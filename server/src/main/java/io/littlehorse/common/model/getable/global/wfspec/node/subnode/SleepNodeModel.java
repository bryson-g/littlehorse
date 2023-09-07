package io.littlehorse.common.model.getable.global.wfspec.node.subnode;

import com.google.protobuf.Message;
import io.littlehorse.common.LHServerConfig;
import io.littlehorse.common.dao.ReadOnlyMetadataStore;
import io.littlehorse.common.exceptions.LHApiException;
import io.littlehorse.common.exceptions.LHVarSubError;
import io.littlehorse.common.model.getable.core.wfrun.ThreadRunModel;
import io.littlehorse.common.model.getable.core.wfrun.subnoderun.SleepNodeRunModel;
import io.littlehorse.common.model.getable.global.wfspec.node.SubNode;
import io.littlehorse.common.model.getable.global.wfspec.variable.VariableAssignmentModel;
import io.littlehorse.sdk.common.proto.SleepNode;
import io.littlehorse.sdk.common.proto.SleepNode.SleepLengthCase;
import java.time.Instant;
import java.util.Date;

public class SleepNodeModel extends SubNode<SleepNode> {

    public SleepLengthCase type;
    public VariableAssignmentModel rawSeconds;
    public VariableAssignmentModel timestamp;
    public VariableAssignmentModel isoDate;

    public Class<SleepNode> getProtoBaseClass() {
        return SleepNode.class;
    }

    public SleepNode.Builder toProto() {
        SleepNode.Builder out = SleepNode.newBuilder();

        switch (type) {
            case RAW_SECONDS:
                out.setRawSeconds(rawSeconds.toProto());
                break;
            case TIMESTAMP:
                out.setTimestamp(timestamp.toProto());
                break;
            case ISO_DATE:
                out.setIsoDate(isoDate.toProto());
                break;
            case SLEEPLENGTH_NOT_SET:
                throw new RuntimeException("Not possible");
        }

        return out;
    }

    public void initFrom(Message proto) {
        SleepNode p = (SleepNode) proto;
        type = p.getSleepLengthCase();
        switch (type) {
            case RAW_SECONDS:
                rawSeconds = VariableAssignmentModel.fromProto(p.getRawSeconds());
                break;
            case TIMESTAMP:
                timestamp = VariableAssignmentModel.fromProto(p.getTimestamp());
                break;
            case ISO_DATE:
                isoDate = VariableAssignmentModel.fromProto(p.getIsoDate());
                break;
            case SLEEPLENGTH_NOT_SET:
                throw new RuntimeException("Not possible");
        }
    }

    @Override
    public void validate(ReadOnlyMetadataStore stores, LHServerConfig config) throws LHApiException {
        // TODO: once we have schemas, we need to validate that the
        // variable assignments are types that make sense (unsigned int, long,
        // or date string).
    }

    @Override
    public SleepNodeRunModel createSubNodeRun(Date time) {
        return new SleepNodeRunModel();
    }

    public Date getMaturationTime(ThreadRunModel thread) throws LHVarSubError {
        switch (type) {
            case RAW_SECONDS:
                long timeToSleep = thread.assignVariable(rawSeconds).asInt().intVal;
                return new Date(System.currentTimeMillis() + (1000 * timeToSleep));
            case ISO_DATE:
                String dateStr = thread.assignVariable(isoDate).asStr().strVal;
                try {
                    return new Date(Instant.parse(dateStr).toEpochMilli());
                } catch (Exception exn) {
                    throw new LHVarSubError(exn, "failed parsing date string " + dateStr + ": " + exn.getMessage());
                }
            case TIMESTAMP:
                long ts = thread.assignVariable(timestamp).asInt().intVal;
                return new Date(ts);
            case SLEEPLENGTH_NOT_SET:
        }
        throw new RuntimeException("Not possible");
    }
}