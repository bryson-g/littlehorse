// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: external_event.proto

package io.littlehorse.sdk.common.proto;

public interface ExternalEventRetentionPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.ExternalEventRetentionPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Delete such an ExternalEvent X seconds after it has been registered if it
   * has not yet been claimed by a WfRun.
   * </pre>
   *
   * <code>int64 seconds_after_put = 1;</code>
   * @return Whether the secondsAfterPut field is set.
   */
  boolean hasSecondsAfterPut();
  /**
   * <pre>
   * Delete such an ExternalEvent X seconds after it has been registered if it
   * has not yet been claimed by a WfRun.
   * </pre>
   *
   * <code>int64 seconds_after_put = 1;</code>
   * @return The secondsAfterPut.
   */
  long getSecondsAfterPut();

  io.littlehorse.sdk.common.proto.ExternalEventRetentionPolicy.ExtEvtGcPolicyCase getExtEvtGcPolicyCase();
}