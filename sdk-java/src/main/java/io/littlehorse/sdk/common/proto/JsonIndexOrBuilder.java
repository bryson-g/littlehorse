// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.sdk.common.proto;

public interface JsonIndexOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.JsonIndex)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Denotes the path in JSONPath format (according to the Java Jayway library) that
   * has a field we should index.
   * </pre>
   *
   * <code>string field_path = 1;</code>
   * @return The fieldPath.
   */
  java.lang.String getFieldPath();
  /**
   * <pre>
   * Denotes the path in JSONPath format (according to the Java Jayway library) that
   * has a field we should index.
   * </pre>
   *
   * <code>string field_path = 1;</code>
   * @return The bytes for fieldPath.
   */
  com.google.protobuf.ByteString
      getFieldPathBytes();

  /**
   * <pre>
   * Is the type of the field we are indexing.
   * </pre>
   *
   * <code>.littlehorse.PrimitiveType field_type = 2;</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  int getFieldTypeValue();
  /**
   * <pre>
   * Is the type of the field we are indexing.
   * </pre>
   *
   * <code>.littlehorse.PrimitiveType field_type = 2;</code>
   * @return The fieldType.
   */
  io.littlehorse.sdk.common.proto.PrimitiveType getFieldType();
}
