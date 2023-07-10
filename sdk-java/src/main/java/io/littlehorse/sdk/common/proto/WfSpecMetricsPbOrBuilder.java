// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface WfSpecMetricsPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.WfSpecMetricsPb)
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
   * <code>.littlehorse.MetricsWindowLengthPb type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.littlehorse.MetricsWindowLengthPb type = 2;</code>
   * @return The type.
   */
  io.littlehorse.sdk.common.proto.MetricsWindowLengthPb getType();

  /**
   * <code>string wfSpecName = 3;</code>
   * @return The wfSpecName.
   */
  java.lang.String getWfSpecName();
  /**
   * <code>string wfSpecName = 3;</code>
   * @return The bytes for wfSpecName.
   */
  com.google.protobuf.ByteString
      getWfSpecNameBytes();

  /**
   * <code>int32 wfSpecVersion = 4;</code>
   * @return The wfSpecVersion.
   */
  int getWfSpecVersion();

  /**
   * <code>int64 total_started = 5;</code>
   * @return The totalStarted.
   */
  long getTotalStarted();

  /**
   * <code>int64 total_completed = 6;</code>
   * @return The totalCompleted.
   */
  long getTotalCompleted();

  /**
   * <code>int64 total_errored = 7;</code>
   * @return The totalErrored.
   */
  long getTotalErrored();

  /**
   * <code>int64 start_to_complete_max = 8;</code>
   * @return The startToCompleteMax.
   */
  long getStartToCompleteMax();

  /**
   * <code>int64 start_to_complete_avg = 9;</code>
   * @return The startToCompleteAvg.
   */
  long getStartToCompleteAvg();
}
