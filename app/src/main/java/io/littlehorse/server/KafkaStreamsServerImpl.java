package io.littlehorse.server;

import com.google.protobuf.MessageOrBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.health.v1.HealthCheckResponse.ServingStatus;
import io.grpc.protobuf.services.HealthStatusManager;
import io.grpc.stub.StreamObserver;
import io.littlehorse.common.LHConfig;
import io.littlehorse.common.LHConstants;
import io.littlehorse.common.exceptions.LHConnectionError;
import io.littlehorse.common.exceptions.LHValidationError;
import io.littlehorse.common.model.LHSerializable;
import io.littlehorse.common.model.command.Command;
import io.littlehorse.common.model.command.SubCommand;
import io.littlehorse.common.model.command.subcommand.DeleteWfRun;
import io.littlehorse.common.model.command.subcommand.PutExternalEvent;
import io.littlehorse.common.model.command.subcommand.PutExternalEventDef;
import io.littlehorse.common.model.command.subcommand.PutTaskDef;
import io.littlehorse.common.model.command.subcommand.PutWfSpec;
import io.littlehorse.common.model.command.subcommand.ResumeWfRun;
import io.littlehorse.common.model.command.subcommand.RunWf;
import io.littlehorse.common.model.command.subcommand.StopWfRun;
import io.littlehorse.common.model.command.subcommand.TaskClaimEvent;
import io.littlehorse.common.model.command.subcommand.TaskResultEvent;
import io.littlehorse.common.model.meta.ExternalEventDef;
import io.littlehorse.common.model.meta.TaskDef;
import io.littlehorse.common.model.meta.WfSpec;
import io.littlehorse.common.model.wfrun.ExternalEvent;
import io.littlehorse.common.model.wfrun.NodeRun;
import io.littlehorse.common.model.wfrun.TaskScheduleRequest;
import io.littlehorse.common.model.wfrun.Variable;
import io.littlehorse.common.model.wfrun.WfRun;
import io.littlehorse.common.proto.CentralStoreQueryReplyPb;
import io.littlehorse.common.proto.CommandPb.CommandCase;
import io.littlehorse.common.proto.DeleteWfRunPb;
import io.littlehorse.common.proto.DeleteWfRunReplyPb;
import io.littlehorse.common.proto.GetExternalEventDefPb;
import io.littlehorse.common.proto.GetExternalEventDefReplyPb;
import io.littlehorse.common.proto.GetExternalEventPb;
import io.littlehorse.common.proto.GetExternalEventReplyPb;
import io.littlehorse.common.proto.GetNodeRunPb;
import io.littlehorse.common.proto.GetNodeRunReplyPb;
import io.littlehorse.common.proto.GetTaskDefPb;
import io.littlehorse.common.proto.GetTaskDefReplyPb;
import io.littlehorse.common.proto.GetVariablePb;
import io.littlehorse.common.proto.GetVariableReplyPb;
import io.littlehorse.common.proto.GetWfRunPb;
import io.littlehorse.common.proto.GetWfRunReplyPb;
import io.littlehorse.common.proto.GetWfSpecPb;
import io.littlehorse.common.proto.GetWfSpecReplyPb;
import io.littlehorse.common.proto.LHPublicApiGrpc.LHPublicApiImplBase;
import io.littlehorse.common.proto.LHResponseCodePb;
import io.littlehorse.common.proto.PaginatedTagQueryPb;
import io.littlehorse.common.proto.PaginatedTagQueryReplyPb;
import io.littlehorse.common.proto.PollTaskPb;
import io.littlehorse.common.proto.PollTaskReplyPb;
import io.littlehorse.common.proto.ProcessCommandReplyPb;
import io.littlehorse.common.proto.PutExternalEventDefPb;
import io.littlehorse.common.proto.PutExternalEventDefReplyPb;
import io.littlehorse.common.proto.PutExternalEventPb;
import io.littlehorse.common.proto.PutExternalEventReplyPb;
import io.littlehorse.common.proto.PutTaskDefPb;
import io.littlehorse.common.proto.PutTaskDefReplyPb;
import io.littlehorse.common.proto.PutWfSpecPb;
import io.littlehorse.common.proto.PutWfSpecReplyPb;
import io.littlehorse.common.proto.RegisterTaskWorkerPb;
import io.littlehorse.common.proto.RegisterTaskWorkerReplyPb;
import io.littlehorse.common.proto.ReportTaskReplyPb;
import io.littlehorse.common.proto.ResumeWfRunPb;
import io.littlehorse.common.proto.ResumeWfRunReplyPb;
import io.littlehorse.common.proto.RunWfPb;
import io.littlehorse.common.proto.RunWfReplyPb;
import io.littlehorse.common.proto.SearchWfRunPb;
import io.littlehorse.common.proto.SearchWfRunReplyPb;
import io.littlehorse.common.proto.StopWfRunPb;
import io.littlehorse.common.proto.StopWfRunReplyPb;
import io.littlehorse.common.proto.TaskResultEventPb;
import io.littlehorse.common.util.LHUtil;
import io.littlehorse.server.streamsimpl.BackendInternalComms;
import io.littlehorse.server.streamsimpl.ServerTopology;
import io.littlehorse.server.streamsimpl.storeinternals.index.TagQueryUtils;
import io.littlehorse.server.streamsimpl.storeinternals.utils.StoreUtils;
import io.littlehorse.server.streamsimpl.taskqueue.TaskQueueManager;
import io.littlehorse.server.streamsimpl.taskqueue.TaskQueueStreamObserver;
import io.littlehorse.server.streamsimpl.util.GETStreamObserver;
import io.littlehorse.server.streamsimpl.util.POSTStreamObserver;
import java.io.IOException;
import java.util.Date;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KafkaStreams.State;
import org.apache.kafka.streams.KafkaStreams.StateListener;

public class KafkaStreamsServerImpl extends LHPublicApiImplBase {

    private LHConfig config;
    private Server grpcServer;
    private TaskQueueManager taskQueueManager;

    private KafkaStreams coreStreams;
    private KafkaStreams timerStreams;

    private BackendInternalComms internalComms;

    public KafkaStreamsServerImpl(LHConfig config) {
        this.config = config;

        HealthStatusManager grpcHealthCheckThingy = new HealthStatusManager();
        this.taskQueueManager = new TaskQueueManager(this);

        coreStreams =
            new KafkaStreams(
                ServerTopology.initCoreTopology(config, this),
                config.getStreamsConfig("core")
            );
        timerStreams =
            new KafkaStreams(
                ServerTopology.initTimerTopology(config),
                config.getStreamsConfig("timer")
            );

        this.grpcServer =
            ServerBuilder
                .forPort(config.getApiBindPort())
                .addService(this)
                .addService(grpcHealthCheckThingy.getHealthService())
                .build();
        coreStreams.setStateListener(
            new LHBackendStateListener("core", grpcHealthCheckThingy)
        );
        timerStreams.setStateListener(
            new LHBackendStateListener("timer", grpcHealthCheckThingy)
        );
        internalComms = new BackendInternalComms(config, coreStreams);
    }

    @Override
    public void getWfSpec(GetWfSpecPb req, StreamObserver<GetWfSpecReplyPb> ctx) {
        StreamObserver<CentralStoreQueryReplyPb> observer = new GETStreamObserver<>(
            ctx,
            WfSpec.class,
            GetWfSpecReplyPb.class,
            config
        );

        if (req.hasVersion()) {
            internalComms.getBytesAsync(
                StoreUtils.getFullStoreKey(
                    WfSpec.getSubKey(req.getName(), req.getVersion()),
                    WfSpec.class
                ),
                LHConstants.META_PARTITION_KEY,
                observer
            );
        } else {
            internalComms.getLastFromPrefixAsync(
                WfSpec.getFullPrefixByName(req.getName()),
                LHConstants.META_PARTITION_KEY,
                observer
            );
        }
    }

    @Override
    public void getTaskDef(GetTaskDefPb req, StreamObserver<GetTaskDefReplyPb> ctx) {
        StreamObserver<CentralStoreQueryReplyPb> observer = new GETStreamObserver<>(
            ctx,
            TaskDef.class,
            GetTaskDefReplyPb.class,
            config
        );

        if (req.hasVersion()) {
            internalComms.getBytesAsync(
                StoreUtils.getFullStoreKey(
                    TaskDef.getSubKey(req.getName(), req.getVersion()),
                    TaskDef.class
                ),
                LHConstants.META_PARTITION_KEY,
                observer
            );
        } else {
            internalComms.getLastFromPrefixAsync(
                TaskDef.getFullPrefixByName(req.getName()),
                LHConstants.META_PARTITION_KEY,
                observer
            );
        }
    }

    @Override
    public void getExternalEventDef(
        GetExternalEventDefPb req,
        StreamObserver<GetExternalEventDefReplyPb> ctx
    ) {
        StreamObserver<CentralStoreQueryReplyPb> observer = new GETStreamObserver<>(
            ctx,
            ExternalEventDef.class,
            GetExternalEventDefReplyPb.class,
            config
        );

        if (req.hasVersion()) {
            internalComms.getBytesAsync(
                StoreUtils.getFullStoreKey(
                    ExternalEventDef.getSubKey(req.getName(), req.getVersion()),
                    ExternalEventDef.class
                ),
                LHConstants.META_PARTITION_KEY,
                observer
            );
        } else {
            internalComms.getLastFromPrefixAsync(
                ExternalEventDef.getFullPrefixByName(req.getName()),
                LHConstants.META_PARTITION_KEY,
                observer
            );
        }
    }

    @Override
    public void putTaskDef(PutTaskDefPb req, StreamObserver<PutTaskDefReplyPb> ctx) {
        processCommand(req, ctx, PutTaskDef.class, PutTaskDefReplyPb.class);
    }

    @Override
    public void putExternalEvent(
        PutExternalEventPb req,
        StreamObserver<PutExternalEventReplyPb> ctx
    ) {
        processCommand(
            req,
            ctx,
            PutExternalEvent.class,
            PutExternalEventReplyPb.class
        );
    }

    @Override
    public void putExternalEventDef(
        PutExternalEventDefPb req,
        StreamObserver<PutExternalEventDefReplyPb> ctx
    ) {
        processCommand(
            req,
            ctx,
            PutExternalEventDef.class,
            PutExternalEventDefReplyPb.class
        );
    }

    @Override
    public void putWfSpec(PutWfSpecPb req, StreamObserver<PutWfSpecReplyPb> ctx) {
        processCommand(req, ctx, PutWfSpec.class, PutWfSpecReplyPb.class);
    }

    @Override
    public void runWf(RunWfPb req, StreamObserver<RunWfReplyPb> ctx) {
        processCommand(req, ctx, RunWf.class, RunWfReplyPb.class);
    }

    @Override
    public StreamObserver<PollTaskPb> pollTask(StreamObserver<PollTaskReplyPb> ctx) {
        return new TaskQueueStreamObserver(ctx, taskQueueManager);
    }

    @Override
    public StreamObserver<RegisterTaskWorkerPb> registerTaskWorker(
        StreamObserver<RegisterTaskWorkerReplyPb> responseObserver
    ) {
        return new StreamObserver<RegisterTaskWorkerPb>() {
            @Override
            public void onCompleted() {
                // Nothing to do
            }

            @Override
            public void onError(Throwable t) {
                // Nothing to do
            }

            @Override
            public void onNext(RegisterTaskWorkerPb request) {
                responseObserver.onNext(internalComms.registerTaskWorker(request));
            }
        };
    }

    @Override
    public void reportTask(
        TaskResultEventPb req,
        StreamObserver<ReportTaskReplyPb> ctx
    ) {
        processCommand(req, ctx, TaskResultEvent.class, ReportTaskReplyPb.class);
    }

    @Override
    public void getWfRun(GetWfRunPb req, StreamObserver<GetWfRunReplyPb> ctx) {
        StreamObserver<CentralStoreQueryReplyPb> observer = new GETStreamObserver<>(
            ctx,
            WfRun.class,
            GetWfRunReplyPb.class,
            config
        );

        internalComms.getBytesAsync(
            StoreUtils.getFullStoreKey(req.getId(), WfRun.class),
            req.getId(),
            observer
        );
    }

    @Override
    public void getNodeRun(GetNodeRunPb req, StreamObserver<GetNodeRunReplyPb> ctx) {
        StreamObserver<CentralStoreQueryReplyPb> observer = new GETStreamObserver<>(
            ctx,
            NodeRun.class,
            GetNodeRunReplyPb.class,
            config
        );

        internalComms.getBytesAsync(
            StoreUtils.getFullStoreKey(
                NodeRun.getStoreKey(
                    req.getWfRunId(),
                    req.getThreadRunNumber(),
                    req.getPosition()
                ),
                NodeRun.class
            ),
            req.getWfRunId(),
            observer
        );
    }

    @Override
    public void getVariable(
        GetVariablePb req,
        StreamObserver<GetVariableReplyPb> ctx
    ) {
        StreamObserver<CentralStoreQueryReplyPb> observer = new GETStreamObserver<>(
            ctx,
            Variable.class,
            GetVariableReplyPb.class,
            config
        );

        internalComms.getBytesAsync(
            StoreUtils.getFullStoreKey(
                Variable.getStoreKey(
                    req.getWfRunId(),
                    req.getThreadRunNumber(),
                    req.getVarName()
                ),
                Variable.class
            ),
            req.getWfRunId(),
            observer
        );
    }

    @Override
    public void getExternalEvent(
        GetExternalEventPb req,
        StreamObserver<GetExternalEventReplyPb> ctx
    ) {
        StreamObserver<CentralStoreQueryReplyPb> observer = new GETStreamObserver<>(
            ctx,
            ExternalEvent.class,
            GetExternalEventReplyPb.class,
            config
        );

        internalComms.getBytesAsync(
            StoreUtils.getFullStoreKey(
                ExternalEvent.getStoreKey(
                    req.getWfRunId(),
                    req.getExternalEventDefName(),
                    req.getGuid()
                ),
                ExternalEvent.class
            ),
            req.getWfRunId(),
            observer
        );
    }

    // EMPLOYEE_TODO: this is a synchronous call. Make it asynchronous.
    // This will require refactoring the PaginatedTagQuery logic, which will be
    // hard. Once an employee can do this, they will have earned their lightsaber
    // and graduated to the rank of Jedi Padawan.
    @Override
    public void searchWfRun(
        SearchWfRunPb req,
        StreamObserver<SearchWfRunReplyPb> ctx
    ) {
        SearchWfRunReplyPb.Builder out = SearchWfRunReplyPb.newBuilder();
        PaginatedTagQueryPb internalQuery;
        try {
            internalQuery = TagQueryUtils.translateSearchWfRun(req);
        } catch (LHValidationError exn) {
            out.setCode(LHResponseCodePb.VALIDATION_ERROR);
            out.setMessage(exn.getMessage());
            ctx.onNext(out.build());
            ctx.onCompleted();
            return;
        }

        try {
            PaginatedTagQueryReplyPb raw = internalComms.doPaginatedTagQuery(
                internalQuery
            );
            out.setCode(LHResponseCodePb.OK);
            if (raw.hasUpdatedBookmark()) {
                out.setBookmark(raw.getUpdatedBookmark().toByteString());
            }
            for (String wfRunId : raw.getObjectIdsList()) {
                out.addWfRunIds(wfRunId);
            }
        } catch (LHConnectionError exn) {
            out
                .setCode(LHResponseCodePb.CONNECTION_ERROR)
                .setMessage("Failed connecting to backend: " + exn.getMessage());
        }

        ctx.onNext(out.build());
        ctx.onCompleted();
    }

    @Override
    public void stopWfRun(StopWfRunPb req, StreamObserver<StopWfRunReplyPb> ctx) {
        processCommand(req, ctx, StopWfRun.class, StopWfRunReplyPb.class);
    }

    @Override
    public void resumeWfRun(
        ResumeWfRunPb req,
        StreamObserver<ResumeWfRunReplyPb> ctx
    ) {
        processCommand(req, ctx, ResumeWfRun.class, ResumeWfRunReplyPb.class);
    }

    @Override
    public void deleteWfRun(
        DeleteWfRunPb req,
        StreamObserver<DeleteWfRunReplyPb> ctx
    ) {
        processCommand(req, ctx, DeleteWfRun.class, DeleteWfRunReplyPb.class);
    }

    public void returnTaskToClient(String taskId, TaskQueueStreamObserver client) {
        // First, create the TaskStartedEvent Command.
        TaskScheduleRequest tsr = internalComms.getTsr(taskId);
        TaskClaimEvent claimEvent = new TaskClaimEvent();
        claimEvent.wfRunId = tsr.wfRunId;
        claimEvent.threadRunNumber = tsr.threadRunNumber;
        claimEvent.taskRunPosition = tsr.taskRunPosition;
        claimEvent.taskRunNumber = tsr.taskRunNumber;
        claimEvent.time = new Date();

        Command taskClaimCommand = new Command();
        taskClaimCommand.type = CommandCase.TASK_CLAIM_EVENT;
        taskClaimCommand.taskClaimEvent = claimEvent;

        processCommand(
            claimEvent.toProto().build(),
            client,
            TaskClaimEvent.class,
            PollTaskPb.class,
            false // it's a stream, so we don't want to complete it.
        );
    }

    public void onResponseReceived(String commandId, ProcessCommandReplyPb response) {
        internalComms.onResponseReceived(commandId, response);
    }

    private <
        U extends MessageOrBuilder,
        T extends SubCommand<U>,
        V extends MessageOrBuilder
    > void processCommand(
        U request,
        StreamObserver<V> responseObserver,
        Class<T> subCmdCls,
        Class<V> responseCls
    ) {
        processCommand(request, responseObserver, subCmdCls, responseCls, true);
    }

    private <
        U extends MessageOrBuilder,
        T extends SubCommand<U>,
        V extends MessageOrBuilder
    > void processCommand(
        U request,
        StreamObserver<V> responseObserver,
        Class<T> subCmdCls,
        Class<V> responseCls,
        boolean shouldComplete
    ) {
        T subCmd = LHSerializable.fromProto(request, subCmdCls);
        Command cmd = new Command(subCmd);
        StreamObserver<ProcessCommandReplyPb> observer = new POSTStreamObserver<>(
            responseObserver,
            responseCls,
            shouldComplete
        );
        internalComms.processCommand(cmd, observer);
    }

    public void onTaskScheduled(String taskDefName, String tsrObjectId) {
        taskQueueManager.onTaskScheduled(taskDefName, tsrObjectId);
    }

    public void start() throws IOException {
        coreStreams.start();
        timerStreams.start();
        internalComms.start();
        grpcServer.start();
    }

    public void close() {
        grpcServer.shutdown();
        timerStreams.close();
        coreStreams.close();
        internalComms.close();
    }

    public static void doMain(LHConfig config) throws IOException {
        KafkaStreamsServerImpl server = new KafkaStreamsServerImpl(config);
        Runtime
            .getRuntime()
            .addShutdownHook(
                new Thread(() -> {
                    server.close();
                    config.cleanup();
                })
            );
        server.start();
    }
}

class LHBackendStateListener implements StateListener {

    private String componentName;
    private HealthStatusManager grpcHealthCheckThingy;

    public LHBackendStateListener(
        String componentName,
        HealthStatusManager grpcHealthCheckThingy
    ) {
        this.componentName = componentName;
        this.grpcHealthCheckThingy = grpcHealthCheckThingy;
    }

    public void onChange(State newState, State oldState) {
        LHUtil.log(new Date(), "New state for", componentName + ":", newState);
        if (newState == State.RUNNING) {
            grpcHealthCheckThingy.setStatus(componentName, ServingStatus.SERVING);
        } else {
            grpcHealthCheckThingy.setStatus(componentName, ServingStatus.NOT_SERVING);
        }
    }
}