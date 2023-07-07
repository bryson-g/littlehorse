package io.littlehorse.common.model.meta.usertasks;

import com.google.protobuf.Message;
import io.littlehorse.common.LHDAO;
import io.littlehorse.common.exceptions.LHVarSubError;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.model.meta.VariableAssignment;
import io.littlehorse.common.model.wfrun.subnoderun.UserTaskRun;
import io.littlehorse.jlib.common.proto.UTActionTriggerPb;
import io.littlehorse.jlib.common.proto.UTActionTriggerPb.ActionCase;
import io.littlehorse.jlib.common.proto.UTActionTriggerPb.ScheduleTimeCase;
import io.littlehorse.jlib.common.proto.UTActionTriggerPb.UTACancelPb;
import io.littlehorse.jlib.common.proto.UTActionTriggerPb.UTAReassignPb;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UTActionTrigger extends LHSerializable<UTActionTriggerPb> {

    public ActionCase actionType;
    public UTATask task;
    public UTACancelPb cancel;
    public UTAReassignPb reassign;

    public ScheduleTimeCase scheduleTimeType;
    public VariableAssignment delaySeconds;

    public Class<UTActionTriggerPb> getProtoBaseClass() {
        return UTActionTriggerPb.class;
    }

    public UTActionTriggerPb.Builder toProto() {
        UTActionTriggerPb.Builder out = UTActionTriggerPb.newBuilder();

        switch (actionType) {
            case TASK:
                out.setTask(task.toProto());
                break;
            case CANCEL:
                out.setCancel(cancel);
                break;
            case REASSIGN:
                out.setReassign(reassign);
                break;
            case ACTION_NOT_SET:
                throw new RuntimeException("Not possible");
        }

        switch (scheduleTimeType) {
            case DELAY_SECONDS:
                out.setDelaySeconds(delaySeconds.toProto());
                break;
            case SCHEDULETIME_NOT_SET:
            // nothing to do
        }
        return out;
    }

    public void schedule(LHDAO dao, UserTaskRun utr) throws LHVarSubError {
        switch (actionType) {
            case TASK:
                task.schedule(dao, utr, this);
                break;
            case REASSIGN:
                log.warn("Unimplemented: Reassignment trigger");
                break;
            case CANCEL:
                log.warn("Unimplemented: Cancel trigger");
                break;
            case ACTION_NOT_SET:
            // nothing to do
        }
    }

    public void initFrom(Message proto) {
        UTActionTriggerPb p = (UTActionTriggerPb) proto;

        scheduleTimeType = p.getScheduleTimeCase();
        switch (scheduleTimeType) {
            case DELAY_SECONDS:
                delaySeconds = VariableAssignment.fromProto(p.getDelaySeconds());
                break;
            case SCHEDULETIME_NOT_SET:
            // nothing to do
        }

        actionType = p.getActionCase();
        switch (actionType) {
            case TASK:
                task = LHSerializable.fromProto(p.getTask(), UTATask.class);
                break;
            case REASSIGN:
                reassign = p.getReassign();
                break;
            case CANCEL:
                cancel = p.getCancel();
                break;
            case ACTION_NOT_SET:
                throw new RuntimeException("Not possible");
        }
    }
}