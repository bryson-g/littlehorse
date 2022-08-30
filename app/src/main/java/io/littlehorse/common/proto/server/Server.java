// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package io.littlehorse.common.proto.server;

public final class Server {
  private Server() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_WfRunPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_WfRunPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_ThreadRunPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_ThreadRunPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_TaskRunPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_TaskRunPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_LHResponsePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_LHResponsePb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_POSTableRequestPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_POSTableRequestPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_RangeResponsePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_RangeResponsePb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_AttributePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_AttributePb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_IndexKeyPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_IndexKeyPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_IndexValuePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_IndexValuePb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_IndexEntryPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_IndexEntryPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_IndexEntryActionPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_IndexEntryActionPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_GETableEntryPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_GETableEntryPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_IndexEntriesPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_IndexEntriesPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_RemoteStoreQueryResponsePb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_RemoteStoreQueryResponsePb_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014server.proto\022\010lh_proto\032\037google/protobu" +
      "f/timestamp.proto\032\016lh_proto.proto\"\235\002\n\007Wf" +
      "RunPb\022\n\n\002id\030\001 \001(\t\022\022\n\nwf_spec_id\030\002 \001(\t\022\024\n" +
      "\014wf_spec_name\030\003 \001(\t\022$\n\006status\030\004 \001(\0162\024.lh" +
      "_proto.LHStatusPb\022\032\n\022last_update_offset\030" +
      "\005 \001(\003\022.\n\nstart_time\030\006 \001(\0132\032.google.proto" +
      "buf.Timestamp\0221\n\010end_time\030\007 \001(\0132\032.google" +
      ".protobuf.TimestampH\000\210\001\001\022*\n\013thread_runs\030" +
      "\010 \003(\0132\025.lh_proto.ThreadRunPbB\013\n\t_end_tim" +
      "e\"\207\002\n\013ThreadRunPb\022\021\n\twf_run_id\030\001 \001(\t\022\016\n\006" +
      "number\030\002 \001(\005\022$\n\006status\030\003 \001(\0162\024.lh_proto." +
      "LHStatusPb\022\022\n\nwf_spec_id\030\004 \001(\t\022\030\n\020thread" +
      "_spec_name\030\005 \001(\t\022\021\n\tnum_steps\030\006 \001(\005\022.\n\ns" +
      "tart_time\030\007 \001(\0132\032.google.protobuf.Timest" +
      "amp\0221\n\010end_time\030\010 \001(\0132\032.google.protobuf." +
      "TimestampH\000\210\001\001B\013\n\t_end_time\"\264\004\n\tTaskRunP" +
      "b\022\021\n\twf_run_id\030\001 \001(\t\022\031\n\021thread_run_numbe" +
      "r\030\002 \001(\005\022\020\n\010position\030\003 \001(\005\022\016\n\006number\030\004 \001(" +
      "\005\022\026\n\016attempt_number\030\005 \001(\005\022$\n\006status\030\006 \001(" +
      "\0162\024.lh_proto.LHStatusPb\022\023\n\006output\030\007 \001(\014H" +
      "\000\210\001\001\022\027\n\nlog_output\030\010 \001(\014H\001\210\001\001\0221\n\rschedul" +
      "e_time\030\t \001(\0132\032.google.protobuf.Timestamp" +
      "\0223\n\nstart_time\030\n \001(\0132\032.google.protobuf.T" +
      "imestampH\002\210\001\001\0221\n\010end_time\030\013 \001(\0132\032.google" +
      ".protobuf.TimestampH\003\210\001\001\022\022\n\nwf_spec_id\030\014" +
      " \001(\t\022\030\n\020thread_spec_name\030\r \001(\t\022\021\n\tnode_n" +
      "ame\030\016 \001(\t\022\023\n\013task_def_id\030\017 \001(\t\0224\n\013result" +
      "_code\030\020 \001(\0162\032.lh_proto.TaskResultCodePbH" +
      "\004\210\001\001B\t\n\007_outputB\r\n\013_log_outputB\r\n\013_start" +
      "_timeB\013\n\t_end_timeB\016\n\014_result_code\"\276\001\n\014L" +
      "HResponsePb\022(\n\004code\030\001 \001(\0162\032.lh_proto.LHR" +
      "esponseCodePb\022\017\n\002id\030\002 \001(\tH\000\210\001\001\022\024\n\007messag" +
      "e\030\003 \001(\tH\001\210\001\001\022\023\n\006result\030\004 \001(\014H\002\210\001\001\022\031\n\014res" +
      "ult_class\030\005 \001(\tH\003\210\001\001B\005\n\003_idB\n\n\010_messageB" +
      "\t\n\007_resultB\017\n\r_result_class\"\203\001\n\021POSTable" +
      "RequestPb\022%\n\004type\030\001 \001(\0162\027.lh_proto.Reque" +
      "stTypePb\022\021\n\tstore_key\030\002 \001(\t\022\022\n\nrequest_i" +
      "d\030\003 \001(\t\022\024\n\007payload\030\004 \001(\014H\000\210\001\001B\n\n\010_payloa" +
      "d\"<\n\017RangeResponsePb\022\013\n\003ids\030\001 \003(\t\022\022\n\005tok" +
      "en\030\002 \001(\tH\000\210\001\001B\010\n\006_token\"\'\n\013AttributePb\022\013" +
      "\n\003key\030\001 \001(\t\022\013\n\003val\030\002 \001(\t\"\220\001\n\nIndexKeyPb\022" +
      ")\n\nattributes\030\001 \003(\0132\025.lh_proto.Attribute" +
      "Pb\022*\n\004type\030\002 \001(\0162\034.lh_proto.GETableClass" +
      "EnumPb\022+\n\007created\030\003 \001(\0132\032.google.protobu" +
      "f.Timestamp\"!\n\014IndexValuePb\022\021\n\tstore_key" +
      "\030\001 \003(\t\"D\n\014IndexEntryPb\022!\n\003key\030\001 \001(\0132\024.lh" +
      "_proto.IndexKeyPb\022\021\n\tstore_key\030\002 \001(\t\"f\n\022" +
      "IndexEntryActionPb\022%\n\005entry\030\001 \001(\0132\026.lh_p" +
      "roto.IndexEntryPb\022)\n\006action\030\002 \001(\0162\031.lh_p" +
      "roto.IndexActionEnum\"O\n\016GETableEntryPb\022\r" +
      "\n\005entry\030\001 \001(\014\022\021\n\tpartition\030\002 \001(\005\022\033\n\023last" +
      "_updated_offset\030\003 \001(\003\"9\n\016IndexEntriesPb\022" +
      "\'\n\007entries\030\001 \003(\0132\026.lh_proto.IndexEntryPb" +
      "\"\207\001\n\032RemoteStoreQueryResponsePb\0220\n\004code\030" +
      "\001 \001(\0162\".lh_proto.RemoteStoreQueryStatusP" +
      "b\022\023\n\006result\030\002 \001(\014H\000\210\001\001\022\027\n\017approximate_la" +
      "g\030\003 \001(\003B\t\n\007_result*r\n\020LHResponseCodePb\022\006" +
      "\n\002OK\020\000\022\024\n\020CONNECTION_ERROR\020\001\022\023\n\017NOT_FOUN" +
      "D_ERROR\020\002\022\025\n\021BAD_REQUEST_ERROR\020\003\022\024\n\020VALI" +
      "DATION_ERROR\020\004*%\n\rRequestTypePb\022\010\n\004POST\020" +
      "\000\022\n\n\006DELETE\020\001*Y\n\022GETableClassEnumPb\022\014\n\010T" +
      "ASK_DEF\020\000\022\013\n\007WF_SPEC\020\001\022\n\n\006WF_RUN\020\002\022\016\n\nTH" +
      "READ_RUN\020\003\022\014\n\010TASK_RUN\020\004*=\n\017IndexActionE" +
      "num\022\024\n\020CREATE_IDX_ENTRY\020\000\022\024\n\020DELETE_IDX_" +
      "ENTRY\020\001*b\n\030RemoteStoreQueryStatusPb\022\n\n\006R" +
      "SQ_OK\020\000\022\021\n\rRSQ_NOT_FOUND\020\001\022\020\n\014RSQ_MIGRAT" +
      "ED\020\002\022\025\n\021RSQ_NOT_AVAILABLE\020\003B/\n\"io.little" +
      "horse.common.proto.serverP\001Z\007.;modelb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          io.littlehorse.common.proto.LhProto.getDescriptor(),
        });
    internal_static_lh_proto_WfRunPb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lh_proto_WfRunPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_WfRunPb_descriptor,
        new java.lang.String[] { "Id", "WfSpecId", "WfSpecName", "Status", "LastUpdateOffset", "StartTime", "EndTime", "ThreadRuns", "EndTime", });
    internal_static_lh_proto_ThreadRunPb_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lh_proto_ThreadRunPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_ThreadRunPb_descriptor,
        new java.lang.String[] { "WfRunId", "Number", "Status", "WfSpecId", "ThreadSpecName", "NumSteps", "StartTime", "EndTime", "EndTime", });
    internal_static_lh_proto_TaskRunPb_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lh_proto_TaskRunPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_TaskRunPb_descriptor,
        new java.lang.String[] { "WfRunId", "ThreadRunNumber", "Position", "Number", "AttemptNumber", "Status", "Output", "LogOutput", "ScheduleTime", "StartTime", "EndTime", "WfSpecId", "ThreadSpecName", "NodeName", "TaskDefId", "ResultCode", "Output", "LogOutput", "StartTime", "EndTime", "ResultCode", });
    internal_static_lh_proto_LHResponsePb_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lh_proto_LHResponsePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_LHResponsePb_descriptor,
        new java.lang.String[] { "Code", "Id", "Message", "Result", "ResultClass", "Id", "Message", "Result", "ResultClass", });
    internal_static_lh_proto_POSTableRequestPb_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_lh_proto_POSTableRequestPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_POSTableRequestPb_descriptor,
        new java.lang.String[] { "Type", "StoreKey", "RequestId", "Payload", "Payload", });
    internal_static_lh_proto_RangeResponsePb_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_lh_proto_RangeResponsePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_RangeResponsePb_descriptor,
        new java.lang.String[] { "Ids", "Token", "Token", });
    internal_static_lh_proto_AttributePb_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_lh_proto_AttributePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_AttributePb_descriptor,
        new java.lang.String[] { "Key", "Val", });
    internal_static_lh_proto_IndexKeyPb_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_lh_proto_IndexKeyPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_IndexKeyPb_descriptor,
        new java.lang.String[] { "Attributes", "Type", "Created", });
    internal_static_lh_proto_IndexValuePb_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_lh_proto_IndexValuePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_IndexValuePb_descriptor,
        new java.lang.String[] { "StoreKey", });
    internal_static_lh_proto_IndexEntryPb_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_lh_proto_IndexEntryPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_IndexEntryPb_descriptor,
        new java.lang.String[] { "Key", "StoreKey", });
    internal_static_lh_proto_IndexEntryActionPb_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_lh_proto_IndexEntryActionPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_IndexEntryActionPb_descriptor,
        new java.lang.String[] { "Entry", "Action", });
    internal_static_lh_proto_GETableEntryPb_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_lh_proto_GETableEntryPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_GETableEntryPb_descriptor,
        new java.lang.String[] { "Entry", "Partition", "LastUpdatedOffset", });
    internal_static_lh_proto_IndexEntriesPb_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_lh_proto_IndexEntriesPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_IndexEntriesPb_descriptor,
        new java.lang.String[] { "Entries", });
    internal_static_lh_proto_RemoteStoreQueryResponsePb_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_lh_proto_RemoteStoreQueryResponsePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_RemoteStoreQueryResponsePb_descriptor,
        new java.lang.String[] { "Code", "Result", "ApproximateLag", "Result", });
    com.google.protobuf.TimestampProto.getDescriptor();
    io.littlehorse.common.proto.LhProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
