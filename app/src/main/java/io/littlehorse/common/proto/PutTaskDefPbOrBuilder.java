// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package io.littlehorse.common.proto;

public interface PutTaskDefPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.PutTaskDefPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.lh_proto.OutputSchemaPb output_schema = 3;</code>
   * @return Whether the outputSchema field is set.
   */
  boolean hasOutputSchema();
  /**
   * <code>.lh_proto.OutputSchemaPb output_schema = 3;</code>
   * @return The outputSchema.
   */
  io.littlehorse.common.proto.OutputSchemaPb getOutputSchema();
  /**
   * <code>.lh_proto.OutputSchemaPb output_schema = 3;</code>
   */
  io.littlehorse.common.proto.OutputSchemaPbOrBuilder getOutputSchemaOrBuilder();

  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; input_vars = 4;</code>
   */
  int getInputVarsCount();
  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; input_vars = 4;</code>
   */
  boolean containsInputVars(
      java.lang.String key);
  /**
   * Use {@link #getInputVarsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.littlehorse.common.proto.VariableDefPb>
  getInputVars();
  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; input_vars = 4;</code>
   */
  java.util.Map<java.lang.String, io.littlehorse.common.proto.VariableDefPb>
  getInputVarsMap();
  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; input_vars = 4;</code>
   */

  io.littlehorse.common.proto.VariableDefPb getInputVarsOrDefault(
      java.lang.String key,
      io.littlehorse.common.proto.VariableDefPb defaultValue);
  /**
   * <code>map&lt;string, .lh_proto.VariableDefPb&gt; input_vars = 4;</code>
   */

  io.littlehorse.common.proto.VariableDefPb getInputVarsOrThrow(
      java.lang.String key);
}
