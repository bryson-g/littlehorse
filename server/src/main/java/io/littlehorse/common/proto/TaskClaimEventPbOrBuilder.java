// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

public interface TaskClaimEventPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.TaskClaimEventPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
   * @return Whether the taskRunId field is set.
   */
  boolean hasTaskRunId();
  /**
   * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
   * @return The taskRunId.
   */
  io.littlehorse.jlib.common.proto.TaskRunIdPb getTaskRunId();
  /**
   * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
   */
  io.littlehorse.jlib.common.proto.TaskRunIdPbOrBuilder getTaskRunIdOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp time = 2;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2;</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>string task_worker_id = 3;</code>
   * @return The taskWorkerId.
   */
  java.lang.String getTaskWorkerId();
  /**
   * <code>string task_worker_id = 3;</code>
   * @return The bytes for taskWorkerId.
   */
  com.google.protobuf.ByteString
      getTaskWorkerIdBytes();

  /**
   * <code>optional string task_worker_version = 4;</code>
   * @return Whether the taskWorkerVersion field is set.
   */
  boolean hasTaskWorkerVersion();
  /**
   * <code>optional string task_worker_version = 4;</code>
   * @return The taskWorkerVersion.
   */
  java.lang.String getTaskWorkerVersion();
  /**
   * <code>optional string task_worker_version = 4;</code>
   * @return The bytes for taskWorkerVersion.
   */
  com.google.protobuf.ByteString
      getTaskWorkerVersionBytes();
}
