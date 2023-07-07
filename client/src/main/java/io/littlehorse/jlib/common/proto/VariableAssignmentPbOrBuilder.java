// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

public interface VariableAssignmentPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.VariableAssignmentPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string json_path = 1;</code>
   * @return Whether the jsonPath field is set.
   */
  boolean hasJsonPath();
  /**
   * <code>optional string json_path = 1;</code>
   * @return The jsonPath.
   */
  java.lang.String getJsonPath();
  /**
   * <code>optional string json_path = 1;</code>
   * @return The bytes for jsonPath.
   */
  com.google.protobuf.ByteString
      getJsonPathBytes();

  /**
   * <code>string variable_name = 2;</code>
   * @return Whether the variableName field is set.
   */
  boolean hasVariableName();
  /**
   * <code>string variable_name = 2;</code>
   * @return The variableName.
   */
  java.lang.String getVariableName();
  /**
   * <code>string variable_name = 2;</code>
   * @return The bytes for variableName.
   */
  com.google.protobuf.ByteString
      getVariableNameBytes();

  /**
   * <code>.littlehorse.VariableValuePb literal_value = 3;</code>
   * @return Whether the literalValue field is set.
   */
  boolean hasLiteralValue();
  /**
   * <code>.littlehorse.VariableValuePb literal_value = 3;</code>
   * @return The literalValue.
   */
  io.littlehorse.jlib.common.proto.VariableValuePb getLiteralValue();
  /**
   * <code>.littlehorse.VariableValuePb literal_value = 3;</code>
   */
  io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getLiteralValueOrBuilder();

  /**
   * <code>.littlehorse.VariableAssignmentPb.FormatStringPb format_string = 4;</code>
   * @return Whether the formatString field is set.
   */
  boolean hasFormatString();
  /**
   * <code>.littlehorse.VariableAssignmentPb.FormatStringPb format_string = 4;</code>
   * @return The formatString.
   */
  io.littlehorse.jlib.common.proto.VariableAssignmentPb.FormatStringPb getFormatString();
  /**
   * <code>.littlehorse.VariableAssignmentPb.FormatStringPb format_string = 4;</code>
   */
  io.littlehorse.jlib.common.proto.VariableAssignmentPb.FormatStringPbOrBuilder getFormatStringOrBuilder();

  public io.littlehorse.jlib.common.proto.VariableAssignmentPb.SourceCase getSourceCase();
}