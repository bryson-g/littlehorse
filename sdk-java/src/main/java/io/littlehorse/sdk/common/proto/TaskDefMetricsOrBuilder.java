// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface TaskDefMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.TaskDefMetrics)
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
   * <code>.littlehorse.MetricsWindowLength type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.littlehorse.MetricsWindowLength type = 2;</code>
   * @return The type.
   */
  io.littlehorse.sdk.common.proto.MetricsWindowLength getType();

  /**
   * <code>string taskDefName = 3;</code>
   * @return The taskDefName.
   */
  java.lang.String getTaskDefName();
  /**
   * <code>string taskDefName = 3;</code>
   * @return The bytes for taskDefName.
   */
  com.google.protobuf.ByteString
      getTaskDefNameBytes();

  /**
   * <code>int64 schedule_to_start_max = 4;</code>
   * @return The scheduleToStartMax.
   */
  long getScheduleToStartMax();

  /**
   * <code>int64 schedule_to_start_avg = 5;</code>
   * @return The scheduleToStartAvg.
   */
  long getScheduleToStartAvg();

  /**
   * <code>int64 start_to_complete_max = 6;</code>
   * @return The startToCompleteMax.
   */
  long getStartToCompleteMax();

  /**
   * <code>int64 start_to_complete_avg = 7;</code>
   * @return The startToCompleteAvg.
   */
  long getStartToCompleteAvg();

  /**
   * <code>int64 total_completed = 8;</code>
   * @return The totalCompleted.
   */
  long getTotalCompleted();

  /**
   * <code>int64 total_errored = 9;</code>
   * @return The totalErrored.
   */
  long getTotalErrored();

  /**
   * <code>int64 total_started = 10;</code>
   * @return The totalStarted.
   */
  long getTotalStarted();

  /**
   * <code>int64 total_scheduled = 11;</code>
   * @return The totalScheduled.
   */
  long getTotalScheduled();
}