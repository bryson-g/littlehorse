// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface PutUserTaskDefReplyPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.PutUserTaskDefReplyPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.LHResponseCodePb code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.littlehorse.LHResponseCodePb code = 1;</code>
   * @return The code.
   */
  io.littlehorse.sdk.common.proto.LHResponseCodePb getCode();

  /**
   * <code>optional string message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>optional string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>optional .littlehorse.UserTaskDefPb result = 3;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>optional .littlehorse.UserTaskDefPb result = 3;</code>
   * @return The result.
   */
  io.littlehorse.sdk.common.proto.UserTaskDefPb getResult();
  /**
   * <code>optional .littlehorse.UserTaskDefPb result = 3;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskDefPbOrBuilder getResultOrBuilder();
}
