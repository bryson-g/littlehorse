// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface TaskDefMetricsIdPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.TaskDefMetricsIdPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp window_start = 1;</code>
   * @return Whether the windowStart field is set.
   */
  boolean hasWindowStart();
  /**
   * <code>.google.protobuf.Timestamp window_start = 1;</code>
   * @return The windowStart.
   */
  com.google.protobuf.Timestamp getWindowStart();
  /**
   * <code>.google.protobuf.Timestamp window_start = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getWindowStartOrBuilder();

  /**
   * <code>.littlehorse.MetricsWindowLengthPb window_type = 2;</code>
   * @return The enum numeric value on the wire for windowType.
   */
  int getWindowTypeValue();
  /**
   * <code>.littlehorse.MetricsWindowLengthPb window_type = 2;</code>
   * @return The windowType.
   */
  io.littlehorse.sdk.common.proto.MetricsWindowLengthPb getWindowType();

  /**
   * <code>string task_def_name = 3;</code>
   * @return The taskDefName.
   */
  java.lang.String getTaskDefName();
  /**
   * <code>string task_def_name = 3;</code>
   * @return The bytes for taskDefName.
   */
  com.google.protobuf.ByteString
      getTaskDefNameBytes();
}
