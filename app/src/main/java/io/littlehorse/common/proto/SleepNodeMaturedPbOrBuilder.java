// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

public interface SleepNodeMaturedPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.SleepNodeMaturedPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string wf_run_id = 1;</code>
   * @return The wfRunId.
   */
  java.lang.String getWfRunId();
  /**
   * <code>string wf_run_id = 1;</code>
   * @return The bytes for wfRunId.
   */
  com.google.protobuf.ByteString
      getWfRunIdBytes();

  /**
   * <code>int32 thread_run_number = 2;</code>
   * @return The threadRunNumber.
   */
  int getThreadRunNumber();

  /**
   * <code>int32 node_run_position = 3;</code>
   * @return The nodeRunPosition.
   */
  int getNodeRunPosition();
}
