// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

public interface InternalPollTaskReplyPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.InternalPollTaskReplyPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.StoreQueryStatusPb code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.littlehorse.StoreQueryStatusPb code = 1;</code>
   * @return The code.
   */
  io.littlehorse.common.proto.StoreQueryStatusPb getCode();

  /**
   * <code>.littlehorse.TaskScheduleRequestPb result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.littlehorse.TaskScheduleRequestPb result = 2;</code>
   * @return The result.
   */
  io.littlehorse.jlib.common.proto.TaskScheduleRequestPb getResult();
  /**
   * <code>.littlehorse.TaskScheduleRequestPb result = 2;</code>
   */
  io.littlehorse.jlib.common.proto.TaskScheduleRequestPbOrBuilder getResultOrBuilder();
}
