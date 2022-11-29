// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

public final class InternalServer {
  private InternalServer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_CommandResultPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_CommandResultPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_CentralStoreQueryReplyPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_CentralStoreQueryReplyPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_CentralStoreQueryPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_CentralStoreQueryPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_CentralStoreQueryPb_CentralStoreSubQueryPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_CentralStoreQueryPb_CentralStoreSubQueryPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_WaitForCommandResultPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_WaitForCommandResultPb_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lh_proto_WaitForCommandResultReplyPb_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lh_proto_WaitForCommandResultReplyPb_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025internal_server.proto\022\010lh_proto\032\037googl" +
      "e/protobuf/timestamp.proto\"f\n\017CommandRes" +
      "ultPb\022\022\n\ncommand_id\030\001 \001(\t\022/\n\013result_time" +
      "\030\002 \001(\0132\032.google.protobuf.Timestamp\022\016\n\006re" +
      "sult\030\003 \001(\014\"\177\n\030CentralStoreQueryReplyPb\022*" +
      "\n\004code\030\001 \001(\0162\034.lh_proto.StoreQueryStatus" +
      "Pb\022\023\n\006result\030\002 \001(\014H\000\210\001\001\022\027\n\017approximate_l" +
      "ag\030\003 \001(\003B\t\n\007_result\"\375\001\n\023CentralStoreQuer" +
      "yPb\022\033\n\023enable_stale_stores\030\001 \001(\010\022\037\n\022spec" +
      "ific_partition\030\002 \001(\005H\000\210\001\001\022C\n\005query\030\003 \001(\013" +
      "24.lh_proto.CentralStoreQueryPb.CentralS" +
      "toreSubQueryPb\032L\n\026CentralStoreSubQueryPb" +
      "\022\r\n\003key\030\001 \001(\tH\000\022\032\n\020last_from_prefix\030\002 \001(" +
      "\tH\000B\007\n\005queryB\025\n\023_specific_partition\"H\n\026W" +
      "aitForCommandResultPb\022\022\n\ncommand_id\030\001 \001(" +
      "\t\022\032\n\022specific_partition\030\002 \001(\005\"\246\001\n\033WaitFo" +
      "rCommandResultReplyPb\022*\n\004code\030\001 \001(\0162\034.lh" +
      "_proto.StoreQueryStatusPb\022.\n\006result\030\002 \001(" +
      "\0132\031.lh_proto.CommandResultPbH\000\210\001\001\022\024\n\007mes" +
      "sage\030\003 \001(\tH\001\210\001\001B\t\n\007_resultB\n\n\010_message*7" +
      "\n\022StoreQueryStatusPb\022\n\n\006RSQ_OK\020\000\022\025\n\021RSQ_" +
      "NOT_AVAILABLE\020\0022\312\001\n\013LHInternals\022X\n\021Centr" +
      "alStoreQuery\022\035.lh_proto.CentralStoreQuer" +
      "yPb\032\".lh_proto.CentralStoreQueryReplyPb\"" +
      "\000\022a\n\024WaitForCommandResult\022 .lh_proto.Wai" +
      "tForCommandResultPb\032%.lh_proto.WaitForCo" +
      "mmandResultReplyPb\"\000B(\n\033io.littlehorse.c" +
      "ommon.protoP\001Z\007.;modelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_lh_proto_CommandResultPb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lh_proto_CommandResultPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_CommandResultPb_descriptor,
        new java.lang.String[] { "CommandId", "ResultTime", "Result", });
    internal_static_lh_proto_CentralStoreQueryReplyPb_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lh_proto_CentralStoreQueryReplyPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_CentralStoreQueryReplyPb_descriptor,
        new java.lang.String[] { "Code", "Result", "ApproximateLag", "Result", });
    internal_static_lh_proto_CentralStoreQueryPb_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lh_proto_CentralStoreQueryPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_CentralStoreQueryPb_descriptor,
        new java.lang.String[] { "EnableStaleStores", "SpecificPartition", "Query", "SpecificPartition", });
    internal_static_lh_proto_CentralStoreQueryPb_CentralStoreSubQueryPb_descriptor =
      internal_static_lh_proto_CentralStoreQueryPb_descriptor.getNestedTypes().get(0);
    internal_static_lh_proto_CentralStoreQueryPb_CentralStoreSubQueryPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_CentralStoreQueryPb_CentralStoreSubQueryPb_descriptor,
        new java.lang.String[] { "Key", "LastFromPrefix", "Query", });
    internal_static_lh_proto_WaitForCommandResultPb_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lh_proto_WaitForCommandResultPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_WaitForCommandResultPb_descriptor,
        new java.lang.String[] { "CommandId", "SpecificPartition", });
    internal_static_lh_proto_WaitForCommandResultReplyPb_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_lh_proto_WaitForCommandResultReplyPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lh_proto_WaitForCommandResultReplyPb_descriptor,
        new java.lang.String[] { "Code", "Result", "Message", "Result", "Message", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}