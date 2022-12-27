// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.common.proto;

public interface RegisterTaskWorkerReplyPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.RegisterTaskWorkerReplyPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lh_proto.LHResponseCodePb code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.lh_proto.LHResponseCodePb code = 1;</code>
   * @return The code.
   */
  io.littlehorse.common.proto.LHResponseCodePb getCode();

  /**
   * <code>string message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated .lh_proto.HostInfoPb all_endpoints = 3;</code>
   */
  java.util.List<io.littlehorse.common.proto.HostInfoPb> 
      getAllEndpointsList();
  /**
   * <code>repeated .lh_proto.HostInfoPb all_endpoints = 3;</code>
   */
  io.littlehorse.common.proto.HostInfoPb getAllEndpoints(int index);
  /**
   * <code>repeated .lh_proto.HostInfoPb all_endpoints = 3;</code>
   */
  int getAllEndpointsCount();
  /**
   * <code>repeated .lh_proto.HostInfoPb all_endpoints = 3;</code>
   */
  java.util.List<? extends io.littlehorse.common.proto.HostInfoPbOrBuilder> 
      getAllEndpointsOrBuilderList();
  /**
   * <code>repeated .lh_proto.HostInfoPb all_endpoints = 3;</code>
   */
  io.littlehorse.common.proto.HostInfoPbOrBuilder getAllEndpointsOrBuilder(
      int index);

  /**
   * <code>repeated .lh_proto.HostInfoPb your_endpoints = 4;</code>
   */
  java.util.List<io.littlehorse.common.proto.HostInfoPb> 
      getYourEndpointsList();
  /**
   * <code>repeated .lh_proto.HostInfoPb your_endpoints = 4;</code>
   */
  io.littlehorse.common.proto.HostInfoPb getYourEndpoints(int index);
  /**
   * <code>repeated .lh_proto.HostInfoPb your_endpoints = 4;</code>
   */
  int getYourEndpointsCount();
  /**
   * <code>repeated .lh_proto.HostInfoPb your_endpoints = 4;</code>
   */
  java.util.List<? extends io.littlehorse.common.proto.HostInfoPbOrBuilder> 
      getYourEndpointsOrBuilderList();
  /**
   * <code>repeated .lh_proto.HostInfoPb your_endpoints = 4;</code>
   */
  io.littlehorse.common.proto.HostInfoPbOrBuilder getYourEndpointsOrBuilder(
      int index);
}
