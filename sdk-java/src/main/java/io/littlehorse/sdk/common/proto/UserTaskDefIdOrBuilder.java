// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: object_id.proto

package io.littlehorse.sdk.common.proto;

public interface UserTaskDefIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.UserTaskDefId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of a UserTaskDef
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of a UserTaskDef
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Note that UserTaskDef's use simple versioning.
   * </pre>
   *
   * <code>int32 version = 2;</code>
   * @return The version.
   */
  int getVersion();
}