package io.littlehorse.server;

import java.util.Arrays;
import java.util.List;
import com.google.protobuf.MessageOrBuilder;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.littlehorse.common.LHConfig;
import io.littlehorse.common.exceptions.LHConnectionError;
import io.littlehorse.common.exceptions.LHSerdeError;
import io.littlehorse.common.model.GETable;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.model.POSTable;
import io.littlehorse.common.model.meta.TaskDef;
import io.littlehorse.common.model.meta.WfSpec;
import io.littlehorse.common.proto.ErrorCodePb;
import io.littlehorse.common.util.KStreamsStateListener;
import io.littlehorse.server.model.internal.POSTableResponse;
import io.littlehorse.server.model.response.ErrorResponse;
import io.littlehorse.server.model.wfrun.TaskRun;
import io.littlehorse.server.model.wfrun.ThreadRun;
import io.littlehorse.server.model.wfrun.WfRun;


public class LHApi {
    private Javalin app;
    private LHConfig config;
    private ApiStreamsContext streams;

    private interface HandlerFunc {
        public void handle(Context ctx) throws Exception;
    }

    private void handle(HandlerFunc func, Context ctx) {
        try {
            func.handle(ctx);
        } catch(Exception exn) {
            exn.printStackTrace();
            throw new RuntimeException(exn);
        }
    }

    public static List<String> GETables = Arrays.asList(
        WfSpec.class.getSimpleName(), TaskDef.class.getSimpleName()
    );

    public LHApi(
        LHConfig config, ApiStreamsContext streams, KStreamsStateListener listener
    ) {
        this.streams = streams;
        this.config = config;
        this.app = LHConfig.createAppWithHealth(listener);

        this.app.get("/WfSpec/{id}", (ctx) -> handle(this::getWfSpec, ctx));
        this.app.get("/WfRun/{id}", (ctx) -> handle(this::getWfRun, ctx));
        this.app.get("/TaskDef/{id}", (ctx) -> handle(this::getTaskDef, ctx));
        this.app.get(
            "/WfRun/{wfRunId}/ThreadRun/{threadRunNumber}",
            (ctx) -> handle(this::getThreadRun, ctx)
        );
        this.app.get(
            "/WfRun/{wfRunId}/ThreadRun/{threadRunNumber}/TaskRun/{taskRunPosition}",
            this::getTaskRun
        );

        this.app.post("/WFSpec", (ctx) -> {
            handle((c) -> {this.post(c, WfSpec.class);}, ctx);
        });
        this.app.post("/TaskDef", (ctx) -> {
            handle((c) -> {this.post(c, TaskDef.class);}, ctx);
        });

        this.app.get(
            "/internal/waitForResponse/{requestId}", 
            (ctx) -> handle(this::waitForResponse, ctx)
        );
        this.app.get(
            "/internal/storeBytes/{storeName}/{storeKey}",
            (ctx) -> handle(this::getBytes, ctx)
        );
    }

    public void start() {
        app.start(config.getExposedPort());
    }

    public <U extends MessageOrBuilder, T extends POSTable<U>> void post(
        Context ctx, Class<T> cls
    ) throws LHSerdeError { // should never throw it though
        T t;
        try {
            t = LHSerializable.fromJson(ctx.body(), cls);
        } catch(LHSerdeError exn) {
            json(
                new ErrorResponse(
                    ErrorCodePb.VALIDATION_ERROR,
                    "Couldn't deserialize resource: " + exn.getMessage()
                ), 400, ctx
            );
            return;
        }

        byte[] out;
        boolean skipPrintStacktrace = false;
        try {
            out = streams.post(t, cls);
            if (out == null) {
                skipPrintStacktrace = true;
                throw new LHConnectionError(null, "Processing timed out");
            }
        } catch (LHConnectionError exn) {
            json(
                new ErrorResponse(
                    ErrorCodePb.CONNECTION_ERROR,
                    "Unexpected error: " + exn.getMessage()
                ), 500, ctx
            );
            if (!skipPrintStacktrace) exn.printStackTrace();
            return;
        }

        POSTableResponse resp = LHSerializable.fromBytes(
            out, POSTableResponse.class
        );
        ctx.status(resp.status);
        ctx.json(resp);
    }

    public void getTaskRun(Context ctx) {
        String wfRunId = ctx.pathParam("wfRunId");
        int threadRunNumber = ctx.pathParamAsClass(
            "threadNumber", Integer.class
        ).get();
        int taskRunPosition = ctx.pathParamAsClass(
            "taskRunPosition", Integer.class
        ).get();

        String storeKey = TaskRun.getStoreKey(
            wfRunId, threadRunNumber, taskRunPosition
        );

        returnLookup(wfRunId, storeKey, ThreadRun.class, ctx);
    }

    public void getWfSpec(Context ctx) {
        String id = ctx.pathParam("id");
        returnLookup(id, id, WfSpec.class, ctx);
    }

    public void getWfRun(Context ctx) {
        String id = ctx.pathParam("id");
        returnLookup(id, id, WfRun.class, ctx);
    }

    public void getTaskDef(Context ctx) {
        String id = ctx.pathParam("id");
        returnLookup(id, id, TaskDef.class, ctx);
    }


    public void getThreadRun(Context ctx) {
        String wfRunId = ctx.pathParam("wfRunId");
        int threadRunNumber = ctx.pathParamAsClass(
            "threadNumber", Integer.class
        ).get();

        String storeKey = ThreadRun.getStoreKey(wfRunId, threadRunNumber);
        returnLookup(wfRunId, storeKey, ThreadRun.class, ctx);
    }

    public void waitForResponse(Context ctx) {
        String requestId = ctx.pathParam("requestId");

        try {
            byte[] response = streams.localWait(requestId);
            if (response == null) {
                ctx.status(404);
            } else {
                ctx.result(response);
            }
        } catch (Exception exn) {
            json(
                new ErrorResponse(
                    ErrorCodePb.CONNECTION_ERROR,
                    "Failed waiting for request to be processed"
                ), 500, ctx
            );
        }
    }

    public void getBytes(Context ctx) {
        String storeName = ctx.pathParam("storeName");
        String storeKey = ctx.pathParam("storeKey");

        byte[] out = streams.localGetBytes(storeName, storeKey);

        if (out == null) {
            ctx.status(404);
        } else {
            ctx.result(out);
        }
    }

    private <U extends MessageOrBuilder, T extends GETable<U>> void returnLookup(
        String partitionKey,
        String storeKey,
        Class<T> cls,
        Context ctx
    ) {
        try {
            T out = streams.get(storeKey, partitionKey, cls);
            if (out == null) {
                json(
                    new ErrorResponse(
                        ErrorCodePb.NOT_FOUND_ERROR,
                        "Couldn't find described " + cls.getSimpleName()
                    ), 404, ctx
                );
                return;
            } else {
                POSTableResponse resp = new POSTableResponse();
                resp.result = out;
                resp.code = null;
                resp.id = out.getStoreKey();
                ctx.json(resp);
            }
        } catch(LHConnectionError exn) {
            json(
                new ErrorResponse(
                    ErrorCodePb.CONNECTION_ERROR,
                    "Failed looking up the " + cls.getSimpleName() + ": "
                    + exn.getMessage()
                ), 500, ctx
            );
        }
    }

    private void json(LHSerializable<?> out, int status, Context ctx) {
        ctx.status(status);
        ctx.contentType("json");
        ctx.result(out.toJson());
    }
}
