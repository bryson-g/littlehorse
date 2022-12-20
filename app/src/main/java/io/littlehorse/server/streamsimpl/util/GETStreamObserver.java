package io.littlehorse.server.streamsimpl.util;

import com.google.protobuf.MessageOrBuilder;
import io.grpc.stub.StreamObserver;
import io.littlehorse.common.LHConfig;
import io.littlehorse.common.exceptions.LHSerdeError;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.model.Storeable;
import io.littlehorse.common.proto.CentralStoreQueryReplyPb;
import io.littlehorse.common.proto.LHResponseCodePb;
import io.littlehorse.common.util.LHUtil;

public class GETStreamObserver<
    U extends MessageOrBuilder, T extends Storeable<U>, V extends MessageOrBuilder
>
    implements StreamObserver<CentralStoreQueryReplyPb> {

    private StreamObserver<V> ctx;
    private LHConfig config;
    private Class<T> getableCls;

    private IntermediateGETResp<U, T, V> out;

    public GETStreamObserver(
        StreamObserver<V> responseObserver,
        Class<T> getableCls,
        Class<V> responseCls,
        LHConfig config
    ) {
        this.ctx = responseObserver;
        this.getableCls = getableCls;
        this.config = config;

        this.out = new IntermediateGETResp<U, T, V>(responseCls);
    }

    public void onError(Throwable t) {
        // TODO
        out.code = LHResponseCodePb.CONNECTION_ERROR;
        out.message = "Failed connecting to backend: " + t.getMessage();
        ctx.onNext(out.toProto());
        ctx.onCompleted();
    }

    public void onCompleted() {
        LHUtil.log("Unexpected call to onCompleted()");
    }

    public void onNext(CentralStoreQueryReplyPb reply) {
        // TODO
        if (reply.hasResult()) {
            out.code = LHResponseCodePb.OK;
            try {
                out.result =
                    LHSerializable.fromBytes(
                        reply.getResult().toByteArray(),
                        getableCls,
                        config
                    );
            } catch (LHSerdeError exn) {
                out.code = LHResponseCodePb.CONNECTION_ERROR;
                out.message =
                    "Impossible: got unreadable response from backend: " +
                    exn.getMessage();
            }
        } else {
            out.code = LHResponseCodePb.NOT_FOUND_ERROR;
        }

        ctx.onNext(out.toProto());
        ctx.onCompleted();
    }
}