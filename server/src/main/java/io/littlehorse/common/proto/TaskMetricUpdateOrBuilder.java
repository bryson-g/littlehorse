// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package io.littlehorse.common.proto;

public interface TaskMetricUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.TaskMetricUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
   * @return Whether the taskDefId field is set.
   */
  boolean hasTaskDefId();
  /**
   * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
   * @return The taskDefId.
   */
  io.littlehorse.sdk.common.proto.TaskDefId getTaskDefId();
  /**
   * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
   */
  io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder getTaskDefIdOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp window_start = 2;</code>
   * @return Whether the windowStart field is set.
   */
  boolean hasWindowStart();
  /**
   * <code>.google.protobuf.Timestamp window_start = 2;</code>
   * @return The windowStart.
   */
  com.google.protobuf.Timestamp getWindowStart();
  /**
   * <code>.google.protobuf.Timestamp window_start = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getWindowStartOrBuilder();

  /**
   * <code>.littlehorse.MetricsWindowLength type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.littlehorse.MetricsWindowLength type = 3;</code>
   * @return The type.
   */
  io.littlehorse.sdk.common.proto.MetricsWindowLength getType();

  /**
   * <code>int64 num_entries = 4;</code>
   * @return The numEntries.
   */
  long getNumEntries();

  /**
   * <code>int64 schedule_to_start_max = 5;</code>
   * @return The scheduleToStartMax.
   */
  long getScheduleToStartMax();

  /**
   * <code>int64 schedule_to_start_total = 6;</code>
   * @return The scheduleToStartTotal.
   */
  long getScheduleToStartTotal();

  /**
   * <code>int64 start_to_complete_max = 7;</code>
   * @return The startToCompleteMax.
   */
  long getStartToCompleteMax();

  /**
   * <code>int64 start_to_complete_total = 8;</code>
   * @return The startToCompleteTotal.
   */
  long getStartToCompleteTotal();

  /**
   * <code>int64 total_completed = 9;</code>
   * @return The totalCompleted.
   */
  long getTotalCompleted();

  /**
   * <code>int64 total_errored = 10;</code>
   * @return The totalErrored.
   */
  long getTotalErrored();

  /**
   * <code>int64 total_started = 11;</code>
   * @return The totalStarted.
   */
  long getTotalStarted();

  /**
   * <code>int64 total_scheduled = 12;</code>
   * @return The totalScheduled.
   */
  long getTotalScheduled();
}