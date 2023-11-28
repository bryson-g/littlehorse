// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface PollTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.PollTaskRequest)
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
   * <code>string client_id = 2;</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string client_id = 2;</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>optional string task_worker_version = 3;</code>
   * @return Whether the taskWorkerVersion field is set.
   */
  boolean hasTaskWorkerVersion();
  /**
   * <code>optional string task_worker_version = 3;</code>
   * @return The taskWorkerVersion.
   */
  java.lang.String getTaskWorkerVersion();
  /**
   * <code>optional string task_worker_version = 3;</code>
   * @return The bytes for taskWorkerVersion.
   */
  com.google.protobuf.ByteString
      getTaskWorkerVersionBytes();
}
