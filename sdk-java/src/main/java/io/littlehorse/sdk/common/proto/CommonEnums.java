// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common_enums.proto

package io.littlehorse.sdk.common.proto;

public final class CommonEnums {
  private CommonEnums() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022common_enums.proto\022\013littlehorse*g\n\010LHS" +
      "tatus\022\014\n\010STARTING\020\000\022\013\n\007RUNNING\020\001\022\r\n\tCOMP" +
      "LETED\020\002\022\013\n\007HALTING\020\003\022\n\n\006HALTED\020\004\022\t\n\005ERRO" +
      "R\020\005\022\r\n\tEXCEPTION\020\006*\274\001\n\nTaskStatus\022\022\n\016TAS" +
      "K_SCHEDULED\020\000\022\020\n\014TASK_RUNNING\020\001\022\020\n\014TASK_" +
      "SUCCESS\020\002\022\017\n\013TASK_FAILED\020\003\022\020\n\014TASK_TIMEO" +
      "UT\020\004\022!\n\035TASK_OUTPUT_SERIALIZING_ERROR\020\005\022" +
      "\034\n\030TASK_INPUT_VAR_SUB_ERROR\020\006\022\022\n\016TASK_CA" +
      "NCELLED\020\007*=\n\023MetricsWindowLength\022\r\n\tMINU" +
      "TES_5\020\000\022\013\n\007HOURS_2\020\001\022\n\n\006DAYS_1\020\002*g\n\014Vari" +
      "ableType\022\014\n\010JSON_OBJ\020\000\022\014\n\010JSON_ARR\020\001\022\n\n\006" +
      "DOUBLE\020\002\022\010\n\004BOOL\020\003\022\007\n\003STR\020\004\022\007\n\003INT\020\005\022\t\n\005" +
      "BYTES\020\006\022\010\n\004NULL\020\007*D\n\024WaitForThreadsPolic" +
      "y\022\027\n\023WAIT_FOR_COMPLETION\020\000\022\023\n\017STOP_ON_FA" +
      "ILURE\020\001B,\n\037io.littlehorse.sdk.common.pro" +
      "toP\001Z\007.;modelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}