// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: variable.proto

package io.littlehorse.sdk.common.proto;

public final class VariableOuterClass {
  private VariableOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_VariableValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_VariableValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_Variable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_Variable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_Struct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_Struct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_InlineStruct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_InlineStruct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_StructField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_StructField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_StructField_FieldList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_StructField_FieldList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_SchemaField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_SchemaField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_Schema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_littlehorse_InlineSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_littlehorse_InlineSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016variable.proto\022\013littlehorse\032\037google/pr" +
      "otobuf/timestamp.proto\032\017object_id.proto\032" +
      "\022common_enums.proto\"\276\001\n\rVariableValue\022\022\n" +
      "\010json_obj\030\002 \001(\tH\000\022\022\n\010json_arr\030\003 \001(\tH\000\022\020\n" +
      "\006double\030\004 \001(\001H\000\022\016\n\004bool\030\005 \001(\010H\000\022\r\n\003str\030\006" +
      " \001(\tH\000\022\r\n\003int\030\007 \001(\003H\000\022\017\n\005bytes\030\010 \001(\014H\000\022%" +
      "\n\006struct\030\t \001(\0132\023.littlehorse.StructH\000B\007\n" +
      "\005valueJ\004\010\001\020\002\"\305\001\n\010Variable\022#\n\002id\030\001 \001(\0132\027." +
      "littlehorse.VariableId\022)\n\005value\030\002 \001(\0132\032." +
      "littlehorse.VariableValue\022.\n\ncreated_at\030" +
      "\003 \001(\0132\032.google.protobuf.Timestamp\022)\n\nwf_" +
      "spec_id\030\004 \001(\0132\025.littlehorse.WfSpecId\022\016\n\006" +
      "masked\030\005 \001(\010\"]\n\006Struct\022(\n\tschema_id\030\001 \001(" +
      "\0132\025.littlehorse.SchemaId\022)\n\006struct\030\002 \001(\013" +
      "2\031.littlehorse.InlineStruct\"8\n\014InlineStr" +
      "uct\022(\n\006fields\030\001 \003(\0132\030.littlehorse.Struct" +
      "Field\"\346\001\n\013StructField\022/\n\tprimitive\030\001 \001(\013" +
      "2\032.littlehorse.VariableValueH\000\022+\n\006struct" +
      "\030\002 \001(\0132\031.littlehorse.InlineStructH\000\0222\n\004l" +
      "ist\030\003 \001(\0132\".littlehorse.StructField.Fiel" +
      "dListH\000\0325\n\tFieldList\022(\n\006fields\030\001 \003(\0132\030.l" +
      "ittlehorse.StructFieldB\016\n\014struct_value\"\314" +
      "\001\n\013SchemaField\022\014\n\004name\030\001 \001(\t\022\020\n\010optional" +
      "\030\002 \001(\010\022/\n\tprimitive\030\003 \001(\0162\032.littlehorse." +
      "PrimitiveTypeH\000\022*\n\tschema_id\030\004 \001(\0132\025.lit" +
      "tlehorse.SchemaIdH\000\0222\n\rinline_schema\030\005 \001" +
      "(\0132\031.littlehorse.InlineSchemaH\000B\014\n\nfield" +
      "_type\"\200\001\n\006Schema\022!\n\002id\030\001 \001(\0132\025.littlehor" +
      "se.SchemaId\022\030\n\013description\030\002 \001(\tH\000\210\001\001\022)\n" +
      "\006schema\030\003 \001(\0132\031.littlehorse.InlineSchema" +
      "B\016\n\014_description\"8\n\014InlineSchema\022(\n\006fiel" +
      "ds\030\001 \003(\0132\030.littlehorse.SchemaFieldBI\n\037io" +
      ".littlehorse.sdk.common.protoP\001Z\t.;lhpro" +
      "to\252\002\030LittleHorse.Common.Protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          io.littlehorse.sdk.common.proto.ObjectId.getDescriptor(),
          io.littlehorse.sdk.common.proto.CommonEnums.getDescriptor(),
        });
    internal_static_littlehorse_VariableValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_littlehorse_VariableValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_VariableValue_descriptor,
        new java.lang.String[] { "JsonObj", "JsonArr", "Double", "Bool", "Str", "Int", "Bytes", "Struct", "Value", });
    internal_static_littlehorse_Variable_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_littlehorse_Variable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_Variable_descriptor,
        new java.lang.String[] { "Id", "Value", "CreatedAt", "WfSpecId", "Masked", });
    internal_static_littlehorse_Struct_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_littlehorse_Struct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_Struct_descriptor,
        new java.lang.String[] { "SchemaId", "Struct", });
    internal_static_littlehorse_InlineStruct_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_littlehorse_InlineStruct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_InlineStruct_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_littlehorse_StructField_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_littlehorse_StructField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_StructField_descriptor,
        new java.lang.String[] { "Primitive", "Struct", "List", "StructValue", });
    internal_static_littlehorse_StructField_FieldList_descriptor =
      internal_static_littlehorse_StructField_descriptor.getNestedTypes().get(0);
    internal_static_littlehorse_StructField_FieldList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_StructField_FieldList_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_littlehorse_SchemaField_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_littlehorse_SchemaField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_SchemaField_descriptor,
        new java.lang.String[] { "Name", "Optional", "Primitive", "SchemaId", "InlineSchema", "FieldType", });
    internal_static_littlehorse_Schema_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_littlehorse_Schema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_Schema_descriptor,
        new java.lang.String[] { "Id", "Description", "Schema", "Description", });
    internal_static_littlehorse_InlineSchema_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_littlehorse_InlineSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_littlehorse_InlineSchema_descriptor,
        new java.lang.String[] { "Fields", });
    com.google.protobuf.TimestampProto.getDescriptor();
    io.littlehorse.sdk.common.proto.ObjectId.getDescriptor();
    io.littlehorse.sdk.common.proto.CommonEnums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
