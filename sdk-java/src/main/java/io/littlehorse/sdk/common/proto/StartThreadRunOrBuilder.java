// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: node_run.proto

package io.littlehorse.sdk.common.proto;

public interface StartThreadRunOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.StartThreadRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contains the thread_run_number of the created Child ThreadRun, if it has
   * been created already.
   * </pre>
   *
   * <code>optional int32 child_thread_id = 1;</code>
   * @return Whether the childThreadId field is set.
   */
  boolean hasChildThreadId();
  /**
   * <pre>
   * Contains the thread_run_number of the created Child ThreadRun, if it has
   * been created already.
   * </pre>
   *
   * <code>optional int32 child_thread_id = 1;</code>
   * @return The childThreadId.
   */
  int getChildThreadId();

  /**
   * <pre>
   * The thread_spec_name of the child thread_run.
   * </pre>
   *
   * <code>string thread_spec_name = 2;</code>
   * @return The threadSpecName.
   */
  java.lang.String getThreadSpecName();
  /**
   * <pre>
   * The thread_spec_name of the child thread_run.
   * </pre>
   *
   * <code>string thread_spec_name = 2;</code>
   * @return The bytes for threadSpecName.
   */
  com.google.protobuf.ByteString
      getThreadSpecNameBytes();
}
