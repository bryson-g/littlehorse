// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface UserTaskRunIdListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.UserTaskRunIdList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.UserTaskRunId results = 1;</code>
   */
  java.util.List<io.littlehorse.sdk.common.proto.UserTaskRunId> 
      getResultsList();
  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.UserTaskRunId results = 1;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskRunId getResults(int index);
  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.UserTaskRunId results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.UserTaskRunId results = 1;</code>
   */
  java.util.List<? extends io.littlehorse.sdk.common.proto.UserTaskRunIdOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * The resulting object id's.
   * </pre>
   *
   * <code>repeated .littlehorse.UserTaskRunId results = 1;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskRunIdOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * The bookmark can be used for cursor-based pagination. If it is null, the server
   * has returned all results. If it is set, you can pass it into your next request
   * to resume searching where your previous request left off.
   * </pre>
   *
   * <code>optional bytes bookmark = 2;</code>
   * @return Whether the bookmark field is set.
   */
  boolean hasBookmark();
  /**
   * <pre>
   * The bookmark can be used for cursor-based pagination. If it is null, the server
   * has returned all results. If it is set, you can pass it into your next request
   * to resume searching where your previous request left off.
   * </pre>
   *
   * <code>optional bytes bookmark = 2;</code>
   * @return The bookmark.
   */
  com.google.protobuf.ByteString getBookmark();
}