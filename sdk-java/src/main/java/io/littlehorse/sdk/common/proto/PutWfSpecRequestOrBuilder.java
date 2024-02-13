// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface PutWfSpecRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.PutWfSpecRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the resulting WfSpec.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the resulting WfSpec.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Map from name the ThreadSpec.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.ThreadSpec&gt; thread_specs = 5;</code>
   */
  int getThreadSpecsCount();
  /**
   * <pre>
   * Map from name the ThreadSpec.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.ThreadSpec&gt; thread_specs = 5;</code>
   */
  boolean containsThreadSpecs(
      java.lang.String key);
  /**
   * Use {@link #getThreadSpecsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.ThreadSpec>
  getThreadSpecs();
  /**
   * <pre>
   * Map from name the ThreadSpec.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.ThreadSpec&gt; thread_specs = 5;</code>
   */
  java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.ThreadSpec>
  getThreadSpecsMap();
  /**
   * <pre>
   * Map from name the ThreadSpec.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.ThreadSpec&gt; thread_specs = 5;</code>
   */
  /* nullable */
io.littlehorse.sdk.common.proto.ThreadSpec getThreadSpecsOrDefault(
      java.lang.String key,
      /* nullable */
io.littlehorse.sdk.common.proto.ThreadSpec defaultValue);
  /**
   * <pre>
   * Map from name the ThreadSpec.
   * </pre>
   *
   * <code>map&lt;string, .littlehorse.ThreadSpec&gt; thread_specs = 5;</code>
   */
  io.littlehorse.sdk.common.proto.ThreadSpec getThreadSpecsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The name of the ThreadSpec to be used as the workflow entrypoint.
   * </pre>
   *
   * <code>string entrypoint_thread_name = 6;</code>
   * @return The entrypointThreadName.
   */
  java.lang.String getEntrypointThreadName();
  /**
   * <pre>
   * The name of the ThreadSpec to be used as the workflow entrypoint.
   * </pre>
   *
   * <code>string entrypoint_thread_name = 6;</code>
   * @return The bytes for entrypointThreadName.
   */
  com.google.protobuf.ByteString
      getEntrypointThreadNameBytes();

  /**
   * <pre>
   * Optional policy to determine how long a WfRun is retained in the data store after
   * it is completed or terminated.
   * </pre>
   *
   * <code>optional .littlehorse.WorkflowRetentionPolicy retention_policy = 8;</code>
   * @return Whether the retentionPolicy field is set.
   */
  boolean hasRetentionPolicy();
  /**
   * <pre>
   * Optional policy to determine how long a WfRun is retained in the data store after
   * it is completed or terminated.
   * </pre>
   *
   * <code>optional .littlehorse.WorkflowRetentionPolicy retention_policy = 8;</code>
   * @return The retentionPolicy.
   */
  io.littlehorse.sdk.common.proto.WorkflowRetentionPolicy getRetentionPolicy();
  /**
   * <pre>
   * Optional policy to determine how long a WfRun is retained in the data store after
   * it is completed or terminated.
   * </pre>
   *
   * <code>optional .littlehorse.WorkflowRetentionPolicy retention_policy = 8;</code>
   */
  io.littlehorse.sdk.common.proto.WorkflowRetentionPolicyOrBuilder getRetentionPolicyOrBuilder();

  /**
   * <pre>
   * Parent WfSpec Reference. If this is set, then all WfRun's for this WfSpec *MUST* be
   * Child WfRun's of the specified WfSpec.
   * </pre>
   *
   * <code>optional .littlehorse.WfSpec.ParentWfSpecReference parent_wf_spec = 9;</code>
   * @return Whether the parentWfSpec field is set.
   */
  boolean hasParentWfSpec();
  /**
   * <pre>
   * Parent WfSpec Reference. If this is set, then all WfRun's for this WfSpec *MUST* be
   * Child WfRun's of the specified WfSpec.
   * </pre>
   *
   * <code>optional .littlehorse.WfSpec.ParentWfSpecReference parent_wf_spec = 9;</code>
   * @return The parentWfSpec.
   */
  io.littlehorse.sdk.common.proto.WfSpec.ParentWfSpecReference getParentWfSpec();
  /**
   * <pre>
   * Parent WfSpec Reference. If this is set, then all WfRun's for this WfSpec *MUST* be
   * Child WfRun's of the specified WfSpec.
   * </pre>
   *
   * <code>optional .littlehorse.WfSpec.ParentWfSpecReference parent_wf_spec = 9;</code>
   */
  io.littlehorse.sdk.common.proto.WfSpec.ParentWfSpecReferenceOrBuilder getParentWfSpecOrBuilder();

  /**
   * <pre>
   * Configures the behavior of this individual request. Can be used to prevent
   * breaking changes to the WfSpec, prevent any changes to the WfSpec, or allow
   * all changes to the WfSpec.
   * </pre>
   *
   * <code>.littlehorse.AllowedUpdateType allowed_updates = 10;</code>
   * @return The enum numeric value on the wire for allowedUpdates.
   */
  int getAllowedUpdatesValue();
  /**
   * <pre>
   * Configures the behavior of this individual request. Can be used to prevent
   * breaking changes to the WfSpec, prevent any changes to the WfSpec, or allow
   * all changes to the WfSpec.
   * </pre>
   *
   * <code>.littlehorse.AllowedUpdateType allowed_updates = 10;</code>
   * @return The allowedUpdates.
   */
  io.littlehorse.sdk.common.proto.AllowedUpdateType getAllowedUpdates();
}
