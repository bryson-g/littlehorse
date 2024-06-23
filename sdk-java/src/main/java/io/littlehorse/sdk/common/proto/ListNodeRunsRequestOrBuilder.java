// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface ListNodeRunsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.ListNodeRunsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The WfRun for whom we list NodeRun's.
   * </pre>
   *
   * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
   * @return Whether the wfRunId field is set.
   */
  boolean hasWfRunId();
  /**
   * <pre>
   * The WfRun for whom we list NodeRun's.
   * </pre>
   *
   * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
   * @return The wfRunId.
   */
  io.littlehorse.sdk.common.proto.WfRunId getWfRunId();
  /**
   * <pre>
   * The WfRun for whom we list NodeRun's.
   * </pre>
   *
   * <code>.littlehorse.WfRunId wf_run_id = 1;</code>
   */
  io.littlehorse.sdk.common.proto.WfRunIdOrBuilder getWfRunIdOrBuilder();

  /**
   * <pre>
   * Optionally specify the thread run number to filter NodeRun's by.
   * </pre>
   *
   * <code>optional int32 thread_run_number = 2;</code>
   * @return Whether the threadRunNumber field is set.
   */
  boolean hasThreadRunNumber();
  /**
   * <pre>
   * Optionally specify the thread run number to filter NodeRun's by.
   * </pre>
   *
   * <code>optional int32 thread_run_number = 2;</code>
   * @return The threadRunNumber.
   */
  int getThreadRunNumber();

  /**
   * <pre>
   * Bookmark for cursor-based pagination; pass if applicable.
   * </pre>
   *
   * <code>optional bytes bookmark = 3;</code>
   * @return Whether the bookmark field is set.
   */
  boolean hasBookmark();
  /**
   * <pre>
   * Bookmark for cursor-based pagination; pass if applicable.
   * </pre>
   *
   * <code>optional bytes bookmark = 3;</code>
   * @return The bookmark.
   */
  com.google.protobuf.ByteString getBookmark();

  /**
   * <pre>
   * Maximum results to return in one request.
   * </pre>
   *
   * <code>optional int32 limit = 4;</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <pre>
   * Maximum results to return in one request.
   * </pre>
   *
   * <code>optional int32 limit = 4;</code>
   * @return The limit.
   */
  int getLimit();
}
