// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface VarNameAndValPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.VarNameAndValPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string var_name = 1;</code>
   * @return The varName.
   */
  java.lang.String getVarName();
  /**
   * <code>string var_name = 1;</code>
   * @return The bytes for varName.
   */
  com.google.protobuf.ByteString
      getVarNameBytes();

  /**
   * <code>.littlehorse.VariableValuePb value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.littlehorse.VariableValuePb value = 2;</code>
   * @return The value.
   */
  io.littlehorse.sdk.common.proto.VariableValuePb getValue();
  /**
   * <code>.littlehorse.VariableValuePb value = 2;</code>
   */
  io.littlehorse.sdk.common.proto.VariableValuePbOrBuilder getValueOrBuilder();
}
