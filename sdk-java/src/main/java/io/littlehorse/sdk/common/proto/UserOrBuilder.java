// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_tasks.proto

package io.littlehorse.sdk.common.proto;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>optional .littlehorse.UserGroup user_group = 2;</code>
   * @return Whether the userGroup field is set.
   */
  boolean hasUserGroup();
  /**
   * <code>optional .littlehorse.UserGroup user_group = 2;</code>
   * @return The userGroup.
   */
  io.littlehorse.sdk.common.proto.UserGroup getUserGroup();
  /**
   * <code>optional .littlehorse.UserGroup user_group = 2;</code>
   */
  io.littlehorse.sdk.common.proto.UserGroupOrBuilder getUserGroupOrBuilder();
}
