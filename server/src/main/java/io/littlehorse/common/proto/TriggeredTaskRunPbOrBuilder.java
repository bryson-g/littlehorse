// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

public interface TriggeredTaskRunPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.TriggeredTaskRunPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.ScheduledTaskPb task_to_schedule = 1;</code>
   * @return Whether the taskToSchedule field is set.
   */
  boolean hasTaskToSchedule();
  /**
   * <code>.littlehorse.ScheduledTaskPb task_to_schedule = 1;</code>
   * @return The taskToSchedule.
   */
  io.littlehorse.jlib.common.proto.ScheduledTaskPb getTaskToSchedule();
  /**
   * <code>.littlehorse.ScheduledTaskPb task_to_schedule = 1;</code>
   */
  io.littlehorse.jlib.common.proto.ScheduledTaskPbOrBuilder getTaskToScheduleOrBuilder();
}