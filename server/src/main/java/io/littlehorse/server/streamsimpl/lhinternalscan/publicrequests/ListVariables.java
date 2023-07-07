package io.littlehorse.server.streamsimpl.lhinternalscan.publicrequests;

import com.google.protobuf.Message;
import io.littlehorse.common.model.wfrun.Variable;
import io.littlehorse.common.proto.GetableClassEnumPb;
import io.littlehorse.common.proto.InternalScanPb.BoundedObjectIdScanPb;
import io.littlehorse.common.proto.InternalScanPb.ScanBoundaryCase;
import io.littlehorse.common.proto.ScanResultTypePb;
import io.littlehorse.common.util.LHGlobalMetaStores;
import io.littlehorse.jlib.common.proto.ListVariablesPb;
import io.littlehorse.jlib.common.proto.ListVariablesReplyPb;
import io.littlehorse.jlib.common.proto.VariablePb;
import io.littlehorse.server.streamsimpl.ServerTopology;
import io.littlehorse.server.streamsimpl.lhinternalscan.InternalScan;
import io.littlehorse.server.streamsimpl.lhinternalscan.PublicScanRequest;
import io.littlehorse.server.streamsimpl.lhinternalscan.publicsearchreplies.ListVariablesReply;

public class ListVariables
    extends PublicScanRequest<ListVariablesPb, ListVariablesReplyPb, VariablePb, Variable, ListVariablesReply> {

    public String wfRunId;

    public Class<ListVariablesPb> getProtoBaseClass() {
        return ListVariablesPb.class;
    }

    public ListVariablesPb.Builder toProto() {
        return ListVariablesPb.newBuilder().setWfRunId(wfRunId);
    }

    public void initFrom(Message proto) {
        ListVariablesPb p = (ListVariablesPb) proto;
        wfRunId = p.getWfRunId();
    }

    public GetableClassEnumPb getObjectType() {
        return GetableClassEnumPb.VARIABLE;
    }

    public InternalScan startInternalSearch(LHGlobalMetaStores stores) {
        InternalScan out = new InternalScan();
        out.storeName = ServerTopology.CORE_STORE;
        out.resultType = ScanResultTypePb.OBJECT;
        out.type = ScanBoundaryCase.BOUNDED_OBJECT_ID_SCAN;
        out.partitionKey = wfRunId;
        out.boundedObjectIdScan =
            BoundedObjectIdScanPb
                .newBuilder()
                .setStartObjectId(wfRunId + "/")
                .build();
        return out;
    }
}