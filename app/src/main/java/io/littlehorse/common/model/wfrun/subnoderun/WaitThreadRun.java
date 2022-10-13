package io.littlehorse.common.model.wfrun.subnoderun;

import com.google.protobuf.MessageOrBuilder;
import io.littlehorse.common.exceptions.LHVarSubError;
import io.littlehorse.common.model.event.WfRunEvent;
import io.littlehorse.common.model.wfrun.SubNodeRun;
import io.littlehorse.common.model.wfrun.ThreadRun;
import io.littlehorse.common.model.wfrun.VariableValue;
import io.littlehorse.common.proto.LHStatusPb;
import io.littlehorse.common.proto.TaskResultCodePb;
import io.littlehorse.common.proto.VariableTypePb;
import io.littlehorse.common.proto.WaitThreadRunPb;
import io.littlehorse.common.proto.WaitThreadRunPbOrBuilder;
import io.littlehorse.common.util.LHUtil;
import java.util.Date;

public class WaitThreadRun extends SubNodeRun<WaitThreadRunPb> {

    public Integer threadRunNumber;
    public Date threadEndTime;
    public TaskResultCodePb threadResultCode;
    public LHStatusPb threadStatus;

    public Class<WaitThreadRunPb> getProtoBaseClass() {
        return WaitThreadRunPb.class;
    }

    public void initFrom(MessageOrBuilder proto) {
        WaitThreadRunPbOrBuilder p = (WaitThreadRunPbOrBuilder) proto;
        threadRunNumber = p.getThreadRunNumber();
        if (p.hasThreadEndTime()) {
            threadEndTime = LHUtil.fromProtoTs(p.getThreadEndTime());
        }
        if (p.hasThreadResultCode()) {
            threadResultCode = p.getThreadResultCode();
        }
        if (p.hasThreadStatus()) {
            threadStatus = p.getThreadStatus();
        }
    }

    public WaitThreadRunPb.Builder toProto() {
        WaitThreadRunPb.Builder out = WaitThreadRunPb
            .newBuilder()
            .setThreadRunNumber(threadRunNumber);

        if (threadResultCode != null) {
            out.setThreadResultCode(threadResultCode);
        }

        if (threadEndTime != null) {
            out.setThreadEndTime(LHUtil.fromDate(threadEndTime));
        }

        if (threadStatus != null) {
            out.setThreadStatus(threadStatus);
        }

        return out;
    }

    public static WaitThreadRun fromProto(WaitThreadRunPbOrBuilder p) {
        WaitThreadRun out = new WaitThreadRun();
        out.initFrom(p);
        return out;
    }

    public void processEvent(WfRunEvent event) {
        // Nothing to do here until we enable timeouts.
    }

    public void advanceIfPossible(Date time) {
        ThreadRun toWait = getWfRun().threadRuns.get(threadRunNumber);

        threadStatus = toWait.status;
        threadEndTime = toWait.endTime;

        if (toWait.status == LHStatusPb.COMPLETED) {
            VariableValue out = new VariableValue();
            out.type = VariableTypePb.VOID;
            nodeRun.complete(out, time);
        } else if (toWait.status == LHStatusPb.ERROR) {
            nodeRun.fail(
                TaskResultCodePb.FAILED,
                "Thread failed: " + toWait.errorMessage,
                time
            );
        } else {
            // nothing to do.
            LHUtil.log("still waiting for thread");
        }
    }

    public void arrive(Date time) {
        try {
            threadRunNumber =
                nodeRun.threadRun
                    .assignVariable(getNode().waitForThreadNode.threadRunNumber)
                    .asInt()
                    .intVal.intValue();
        } catch (LHVarSubError exn) {
            nodeRun.fail(
                TaskResultCodePb.VAR_SUB_ERROR,
                "Failed determining thread run number: " + exn.getMessage(),
                time
            );
        }

        if (threadRunNumber >= getWfRun().threadRuns.size() || threadRunNumber < 0) {
            nodeRun.fail(
                TaskResultCodePb.VAR_SUB_ERROR,
                "Determined threadrunnumber " + threadRunNumber + " is invalid",
                time
            );
        }

        ThreadRun toWait = getWfRun().threadRuns.get(threadRunNumber);

        // Validate that we're not waiting on a thread that's above us in the
        // hierarchy
        ThreadRun potentialParent = nodeRun.threadRun;
        while (potentialParent != null) {
            if (potentialParent.number == toWait.number) {
                nodeRun.fail(
                    TaskResultCodePb.VAR_SUB_ERROR,
                    "Determined threadrunnumber " + threadRunNumber + " is a parent!",
                    time
                );
            }
            potentialParent = potentialParent.getParent();
        }

        threadStatus = toWait.status;
    }
}