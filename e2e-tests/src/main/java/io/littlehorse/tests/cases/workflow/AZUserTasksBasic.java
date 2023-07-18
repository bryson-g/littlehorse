package io.littlehorse.tests.cases.workflow;

import io.littlehorse.sdk.client.LHClient;
import io.littlehorse.sdk.common.LHLibUtil;
import io.littlehorse.sdk.common.config.LHWorkerConfig;
import io.littlehorse.sdk.common.exception.LHApiError;
import io.littlehorse.sdk.common.exception.LHSerdeError;
import io.littlehorse.sdk.common.proto.CompleteUserTaskRunPb;
import io.littlehorse.sdk.common.proto.LHStatusPb;
import io.littlehorse.sdk.common.proto.NodeRunPb;
import io.littlehorse.sdk.common.proto.SearchUserTaskRunPb;
import io.littlehorse.sdk.common.proto.SearchUserTaskRunReplyPb;
import io.littlehorse.sdk.common.proto.TaskRunIdPb;
import io.littlehorse.sdk.common.proto.TaskRunPb;
import io.littlehorse.sdk.common.proto.TaskStatusPb;
import io.littlehorse.sdk.common.proto.UserTaskEventPb;
import io.littlehorse.sdk.common.proto.UserTaskEventPb.EventCase;
import io.littlehorse.sdk.common.proto.UserTaskFieldResultPb;
import io.littlehorse.sdk.common.proto.UserTaskResultPb;
import io.littlehorse.sdk.common.proto.UserTaskRunIdPb;
import io.littlehorse.sdk.common.proto.UserTaskRunPb;
import io.littlehorse.sdk.common.proto.UserTaskRunStatusPb;
import io.littlehorse.sdk.common.proto.VariableMutationTypePb;
import io.littlehorse.sdk.common.proto.VariableTypePb;
import io.littlehorse.sdk.usertask.annotations.UserTaskField;
import io.littlehorse.sdk.wfsdk.UserTaskOutput;
import io.littlehorse.sdk.wfsdk.WfRunVariable;
import io.littlehorse.sdk.wfsdk.Workflow;
import io.littlehorse.sdk.wfsdk.internal.WorkflowImpl;
import io.littlehorse.sdk.worker.LHTaskMethod;
import io.littlehorse.tests.LogicTestFailure;
import io.littlehorse.tests.UserTaskWorkflowTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AZUserTasksBasic extends UserTaskWorkflowTest {

    private static final String USER_TASK_DEF_NAME = "some-usertask";

    public AZUserTasksBasic(LHClient client, LHWorkerConfig workerConfig) {
        super(client, workerConfig);
    }

    public String getDescription() {
        return (
            "Test for basic User Task assigned to specific user id, and tests " +
            " that we can schedule 'reminder tasks' which run X seconds after " +
            " the UserTaskRun is scheduled. "
        );
    }

    @Override
    public Map<String, Object> getRequiredUserTaskForms() {
        return Map.of(USER_TASK_DEF_NAME, new AZUserTaskForm());
    }

    public Workflow getWorkflowImpl() {
        return new WorkflowImpl(
            getWorkflowName(),
            thread -> {
                WfRunVariable formVar = thread.addVariable(
                    "form",
                    VariableTypePb.JSON_OBJ
                );

                UserTaskOutput formOutput = thread.assignUserTaskToUser(
                    USER_TASK_DEF_NAME,
                    "eduwer"
                );

                thread.scheduleTaskAfter(formOutput, 2, "az-reminder");
                thread.mutate(formVar, VariableMutationTypePb.ASSIGN, formOutput);

                thread.execute("az-describe-car", formVar);
            }
        );
    }

    public List<Object> getTaskWorkerObjects() {
        return Arrays.asList(new AZSimpleTask());
    }

    public List<String> launchAndCheckWorkflows(LHClient client)
        throws LogicTestFailure, InterruptedException, LHApiError {
        List<String> out = new ArrayList<>();

        String wfRunId = runWf(client);
        Thread.sleep(8 * 1000); // Wait for reminder task to execute

        // Get the UserTaskRun, ensure that there is an event with a taskRunId
        NodeRunPb firstUserTask = getNodeRun(client, wfRunId, 0, 1);
        UserTaskRunPb utr = getUserTaskRun(
            client,
            firstUserTask.getUserTask().getUserTaskRunId()
        );

        if (utr.getEventsCount() < 2) {
            throw new LogicTestFailure(
                this,
                "Workflow " +
                wfRunId +
                " should have a triggered task run event on the first noderun!"
            );
        }
        UserTaskEventPb ute = utr.getEvents(1);
        if (!ute.getEventCase().equals(EventCase.TASK_EXECUTED)) {
            throw new LogicTestFailure(
                this,
                "Workflow " + wfRunId + " usertask run doesn't have proper event set!"
            );
        }

        // Now we get the TaskRun for that event.
        TaskRunIdPb executedTaskRunId = ute.getTaskExecuted().getTaskRun();
        TaskRunPb taskRun = getTaskRun(client, executedTaskRunId);
        if (taskRun.getAttempts(0).getStatus() != TaskStatusPb.TASK_SUCCESS) {
            throw new LogicTestFailure(
                this,
                "Workflow " + wfRunId + " usertask run reminder didn't complete!"
            );
        }

        // Look for UserTaskRun's with `eduwer` as the user
        SearchUserTaskRunReplyPb results = client
            .getGrpcClient()
            .searchUserTaskRun(
                SearchUserTaskRunPb
                    .newBuilder()
                    .setUserId("eduwer")
                    .setUserTaskDefName(USER_TASK_DEF_NAME)
                    .setStatus(UserTaskRunStatusPb.CLAIMED)
                    .build()
            );

        UserTaskRunIdPb found = null;

        for (UserTaskRunIdPb candidate : results.getResultsList()) {
            if (candidate.getWfRunId().equals(wfRunId)) {
                found = candidate;
                break;
            }
        }

        if (found == null) {
            throw new LogicTestFailure(this, "Couldn't find Eduwer's task!");
        }

        // Now we execute the task
        try {
            client
                .getGrpcClient()
                .completeUserTaskRun(
                    CompleteUserTaskRunPb
                        .newBuilder()
                        .setUserTaskRunId(found)
                        .setResult(
                            UserTaskResultPb
                                .newBuilder()
                                .addFields(
                                    UserTaskFieldResultPb
                                        .newBuilder()
                                        .setName("myStr")
                                        .setValue(LHLibUtil.objToVarVal("asdf"))
                                )
                                .addFields(
                                    UserTaskFieldResultPb
                                        .newBuilder()
                                        .setName("myInt")
                                        .setValue(LHLibUtil.objToVarVal(123))
                                )
                        )
                        .build()
                );
        } catch (LHSerdeError exn) {
            throw new RuntimeException(exn);
        }

        // Wait for the last task to complete
        Thread.sleep(200);

        assertStatus(client, wfRunId, LHStatusPb.COMPLETED);

        assertTaskOutputsMatch(client, wfRunId, 0, "String was asdf and int was 123");

        out.add(wfRunId);
        return out;
    }
}

class AZUserTaskForm {

    @UserTaskField(displayName = "Str display name", description = "some discription")
    public String myStr;

    @UserTaskField(
        displayName = "Int display name",
        description = "another discription"
    )
    public int myInt;
}

class AZSimpleTask {

    @LHTaskMethod("az-describe-car")
    public String obiwan(AZUserTaskForm formData) {
        return "String was " + formData.myStr + " and int was " + formData.myInt;
    }

    @LHTaskMethod("az-reminder")
    public String reminder() {
        return "Hey there dude execute your task!";
    }
}