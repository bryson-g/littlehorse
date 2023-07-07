package io.littlehorse.jtests.test.workflowtests;

import io.littlehorse.jlib.client.LHClient;
import io.littlehorse.jlib.common.config.LHWorkerConfig;
import io.littlehorse.jlib.common.exception.LHApiError;
import io.littlehorse.jlib.common.proto.LHStatusPb;
import io.littlehorse.jlib.common.proto.VariableMutationTypePb;
import io.littlehorse.jlib.common.proto.VariableTypePb;
import io.littlehorse.jlib.common.util.Arg;
import io.littlehorse.jlib.wfsdk.WfRunVariable;
import io.littlehorse.jlib.wfsdk.Workflow;
import io.littlehorse.jlib.wfsdk.internal.WorkflowImpl;
import io.littlehorse.jlib.worker.LHTaskMethod;
import io.littlehorse.jtests.test.LogicTestFailure;
import io.littlehorse.jtests.test.WorkflowLogicTest;
import java.util.Arrays;
import java.util.List;

public class AFVarMutationsRemoveFromList extends WorkflowLogicTest {

    public AFVarMutationsRemoveFromList(
        LHClient client,
        LHWorkerConfig workerConfig
    ) {
        super(client, workerConfig);
    }

    public String getDescription() {
        return "Tests ability to remove items from a JSON_ARR variable.";
    }

    public Workflow getWorkflowImpl() {
        return new WorkflowImpl(
            getWorkflowName(),
            thread -> {
                WfRunVariable listOne = thread.addVariable(
                    "list-one",
                    VariableTypePb.JSON_ARR
                );

                thread.execute("af-simple");

                thread.mutate(listOne, VariableMutationTypePb.REMOVE_IF_PRESENT, 5);
                thread.mutate(
                    listOne,
                    VariableMutationTypePb.REMOVE_IF_PRESENT,
                    "hello"
                );
                thread.mutate(listOne, VariableMutationTypePb.REMOVE_INDEX, 3);
            }
        );
    }

    public List<Object> getTaskWorkerObjects() {
        return Arrays.asList(new AFSimpleTask());
    }

    public List<String> launchAndCheckWorkflows(LHClient client)
        throws LogicTestFailure, InterruptedException, LHApiError {
        // Workflow removes number 5, then removes "hello", then removes
        // index 3. That should throw index out of bounds exception here
        List<?> wfOneInput = Arrays.asList(5, "hello", 3, 4);
        String wfOne = runWf(client, Arg.of("list-one", wfOneInput));

        // Workflow should pass here and just remove number 4.
        String wfTwo = runWf(
            client,
            Arg.of("list-one", Arrays.asList("asdf", "asdf", 3, 4, 9))
        );

        Thread.sleep(500);

        assertStatus(client, wfOne, LHStatusPb.ERROR);
        assertStatus(client, wfTwo, LHStatusPb.COMPLETED);

        List<?> removed = getVarAsList(client, wfOne, 0, "list-one");
        for (int i = 0; i < wfOneInput.size(); i++) {
            if (!wfOneInput.get(i).equals(removed.get(i))) {
                throw new LogicTestFailure(this, "Should have rolled back mutation.");
            }
        }

        List<?> desired = Arrays.asList("asdf", "asdf", 3, 9);
        removed = getVarAsList(client, wfTwo, 0, "list-one");
        for (int i = 0; i < removed.size(); i++) {
            if (!desired.get(i).equals(removed.get(i))) {
                throw new LogicTestFailure(this, "Didn't get required thing");
            }
        }

        return Arrays.asList(wfOne, wfTwo);
    }
}

class AFSimpleTask {

    @LHTaskMethod("af-simple")
    public String simpleTask() {
        return "hello there";
    }
}