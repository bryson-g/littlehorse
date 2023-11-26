package io.littlehorse.server.streams.lhinternalscan.publicrequests;

import com.google.protobuf.Message;
import io.littlehorse.common.LHSerializable;
import io.littlehorse.common.LHStore;
import io.littlehorse.common.dao.ReadOnlyMetadataDAO;
import io.littlehorse.common.exceptions.LHApiException;
import io.littlehorse.common.model.getable.core.externalevent.ExternalEventModel;
import io.littlehorse.common.model.getable.objectId.WfRunIdModel;
import io.littlehorse.common.proto.GetableClassEnum;
import io.littlehorse.common.proto.ScanResultTypePb;
import io.littlehorse.common.proto.TagStorageType;
import io.littlehorse.sdk.common.proto.ExternalEvent;
import io.littlehorse.sdk.common.proto.ExternalEventList;
import io.littlehorse.sdk.common.proto.ListExternalEventsRequest;
import io.littlehorse.server.streams.lhinternalscan.ObjectIdScanBoundaryStrategy;
import io.littlehorse.server.streams.lhinternalscan.PublicScanRequest;
import io.littlehorse.server.streams.lhinternalscan.SearchScanBoundaryStrategy;
import io.littlehorse.server.streams.lhinternalscan.publicsearchreplies.ListExternalEventsReply;

public class ListExternalEventsRequestModel
        extends PublicScanRequest<
                ListExternalEventsRequest,
                ExternalEventList,
                ExternalEvent,
                ExternalEventModel,
                ListExternalEventsReply> {

    public WfRunIdModel wfRunId;

    public Class<ListExternalEventsRequest> getProtoBaseClass() {
        return ListExternalEventsRequest.class;
    }

    public ListExternalEventsRequest.Builder toProto() {
        return ListExternalEventsRequest.newBuilder().setWfRunId(wfRunId.toProto());
    }

    public void initFrom(Message proto) {
        ListExternalEventsRequest p = (ListExternalEventsRequest) proto;
        wfRunId = LHSerializable.fromProto(p.getWfRunId(), WfRunIdModel.class);
    }

    public GetableClassEnum getObjectType() {
        return GetableClassEnum.EXTERNAL_EVENT;
    }

    @Override
    public TagStorageType indexTypeForSearch(ReadOnlyMetadataDAO readOnlyDao) throws LHApiException {
        return TagStorageType.LOCAL;
    }

    @Override
    public SearchScanBoundaryStrategy getScanBoundary(String searchAttributeString) {
        return new ObjectIdScanBoundaryStrategy(wfRunId);
    }

    @Override
    public ScanResultTypePb getResultType() {
        return ScanResultTypePb.OBJECT;
    }

    @Override
    public LHStore getStoreType() {
        return LHStore.CORE;
    }
}
