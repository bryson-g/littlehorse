package io.littlehorse.server.model.internal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import io.littlehorse.common.exceptions.LHSerdeError;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.proto.ErrorCodePb;
import io.littlehorse.common.proto.POSTableResponsePb;
import io.littlehorse.common.proto.POSTableResponsePbOrBuilder;

public class POSTableResponse extends LHSerializable<POSTableResponsePb> {
    @JsonIgnore public int status;
    public ErrorCodePb code;
    public String message;
    public String id;
    public LHSerializable<?> result;

    @JsonIgnore public Class<POSTableResponsePb> getProtoBaseClass() {
        return POSTableResponsePb.class;
    }

    public POSTableResponsePb.Builder toProto() {
        POSTableResponsePb.Builder out = POSTableResponsePb.newBuilder()
            .setStatus(status);

        if (code != null) out.setCode(code);
        if (message != null) out.setMessage(message);
        if (id != null) out.setId(id);
        if (result != null) {
            // This is jank i know
            out.setPayload(ByteString.copyFrom(result.toBytes()));
            out.setPayloadClass(result.getClass().getCanonicalName());
        }
        return out;
    }

    @SuppressWarnings("unchecked")
    public void initFrom(MessageOrBuilder p) {
        POSTableResponsePbOrBuilder proto = (POSTableResponsePbOrBuilder) p;
        status = proto.getStatus();
        if (proto.hasCode()) code = proto.getCode();
        if (proto.hasMessage()) message = proto.getMessage();
        if (proto.hasId()) id = proto.getId();
        if (proto.hasPayload()) {
            try {
                result = LHSerializable.fromBytes(
                    proto.getPayload().toByteArray(),
                    (Class<LHSerializable<?>>) Class.forName(proto.getPayloadClass())
                );
            } catch(LHSerdeError|ClassNotFoundException exn) {
                // Should be impossible
                throw new RuntimeException(exn);
            }
        }
    }
}
