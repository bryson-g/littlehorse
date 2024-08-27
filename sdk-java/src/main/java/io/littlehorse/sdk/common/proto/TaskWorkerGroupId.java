// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: object_id.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * ID for a TaskWorkerGroup.
 * </pre>
 *
 * Protobuf type {@code littlehorse.TaskWorkerGroupId}
 */
public final class TaskWorkerGroupId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.TaskWorkerGroupId)
    TaskWorkerGroupIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskWorkerGroupId.newBuilder() to construct.
  private TaskWorkerGroupId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskWorkerGroupId() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskWorkerGroupId();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_TaskWorkerGroupId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_TaskWorkerGroupId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.TaskWorkerGroupId.class, io.littlehorse.sdk.common.proto.TaskWorkerGroupId.Builder.class);
  }

  public static final int TASK_DEF_ID_FIELD_NUMBER = 1;
  private io.littlehorse.sdk.common.proto.TaskDefId taskDefId_;
  /**
   * <pre>
   * TaskWorkerGroups are uniquely identified by their TaskDefId.
   * </pre>
   *
   * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
   * @return Whether the taskDefId field is set.
   */
  @java.lang.Override
  public boolean hasTaskDefId() {
    return taskDefId_ != null;
  }
  /**
   * <pre>
   * TaskWorkerGroups are uniquely identified by their TaskDefId.
   * </pre>
   *
   * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
   * @return The taskDefId.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskDefId getTaskDefId() {
    return taskDefId_ == null ? io.littlehorse.sdk.common.proto.TaskDefId.getDefaultInstance() : taskDefId_;
  }
  /**
   * <pre>
   * TaskWorkerGroups are uniquely identified by their TaskDefId.
   * </pre>
   *
   * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder getTaskDefIdOrBuilder() {
    return taskDefId_ == null ? io.littlehorse.sdk.common.proto.TaskDefId.getDefaultInstance() : taskDefId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (taskDefId_ != null) {
      output.writeMessage(1, getTaskDefId());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (taskDefId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTaskDefId());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.littlehorse.sdk.common.proto.TaskWorkerGroupId)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.TaskWorkerGroupId other = (io.littlehorse.sdk.common.proto.TaskWorkerGroupId) obj;

    if (hasTaskDefId() != other.hasTaskDefId()) return false;
    if (hasTaskDefId()) {
      if (!getTaskDefId()
          .equals(other.getTaskDefId())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTaskDefId()) {
      hash = (37 * hash) + TASK_DEF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTaskDefId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.TaskWorkerGroupId prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * ID for a TaskWorkerGroup.
   * </pre>
   *
   * Protobuf type {@code littlehorse.TaskWorkerGroupId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.TaskWorkerGroupId)
      io.littlehorse.sdk.common.proto.TaskWorkerGroupIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_TaskWorkerGroupId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_TaskWorkerGroupId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.TaskWorkerGroupId.class, io.littlehorse.sdk.common.proto.TaskWorkerGroupId.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.TaskWorkerGroupId.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      taskDefId_ = null;
      if (taskDefIdBuilder_ != null) {
        taskDefIdBuilder_.dispose();
        taskDefIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.ObjectId.internal_static_littlehorse_TaskWorkerGroupId_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskWorkerGroupId getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.TaskWorkerGroupId.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskWorkerGroupId build() {
      io.littlehorse.sdk.common.proto.TaskWorkerGroupId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskWorkerGroupId buildPartial() {
      io.littlehorse.sdk.common.proto.TaskWorkerGroupId result = new io.littlehorse.sdk.common.proto.TaskWorkerGroupId(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.TaskWorkerGroupId result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.taskDefId_ = taskDefIdBuilder_ == null
            ? taskDefId_
            : taskDefIdBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.littlehorse.sdk.common.proto.TaskWorkerGroupId) {
        return mergeFrom((io.littlehorse.sdk.common.proto.TaskWorkerGroupId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.TaskWorkerGroupId other) {
      if (other == io.littlehorse.sdk.common.proto.TaskWorkerGroupId.getDefaultInstance()) return this;
      if (other.hasTaskDefId()) {
        mergeTaskDefId(other.getTaskDefId());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getTaskDefIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private io.littlehorse.sdk.common.proto.TaskDefId taskDefId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TaskDefId, io.littlehorse.sdk.common.proto.TaskDefId.Builder, io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder> taskDefIdBuilder_;
    /**
     * <pre>
     * TaskWorkerGroups are uniquely identified by their TaskDefId.
     * </pre>
     *
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     * @return Whether the taskDefId field is set.
     */
    public boolean hasTaskDefId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * TaskWorkerGroups are uniquely identified by their TaskDefId.
     * </pre>
     *
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     * @return The taskDefId.
     */
    public io.littlehorse.sdk.common.proto.TaskDefId getTaskDefId() {
      if (taskDefIdBuilder_ == null) {
        return taskDefId_ == null ? io.littlehorse.sdk.common.proto.TaskDefId.getDefaultInstance() : taskDefId_;
      } else {
        return taskDefIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * TaskWorkerGroups are uniquely identified by their TaskDefId.
     * </pre>
     *
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     */
    public Builder setTaskDefId(io.littlehorse.sdk.common.proto.TaskDefId value) {
      if (taskDefIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        taskDefId_ = value;
      } else {
        taskDefIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TaskWorkerGroups are uniquely identified by their TaskDefId.
     * </pre>
     *
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     */
    public Builder setTaskDefId(
        io.littlehorse.sdk.common.proto.TaskDefId.Builder builderForValue) {
      if (taskDefIdBuilder_ == null) {
        taskDefId_ = builderForValue.build();
      } else {
        taskDefIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TaskWorkerGroups are uniquely identified by their TaskDefId.
     * </pre>
     *
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     */
    public Builder mergeTaskDefId(io.littlehorse.sdk.common.proto.TaskDefId value) {
      if (taskDefIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          taskDefId_ != null &&
          taskDefId_ != io.littlehorse.sdk.common.proto.TaskDefId.getDefaultInstance()) {
          getTaskDefIdBuilder().mergeFrom(value);
        } else {
          taskDefId_ = value;
        }
      } else {
        taskDefIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TaskWorkerGroups are uniquely identified by their TaskDefId.
     * </pre>
     *
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     */
    public Builder clearTaskDefId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      taskDefId_ = null;
      if (taskDefIdBuilder_ != null) {
        taskDefIdBuilder_.dispose();
        taskDefIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TaskWorkerGroups are uniquely identified by their TaskDefId.
     * </pre>
     *
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskDefId.Builder getTaskDefIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTaskDefIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * TaskWorkerGroups are uniquely identified by their TaskDefId.
     * </pre>
     *
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder getTaskDefIdOrBuilder() {
      if (taskDefIdBuilder_ != null) {
        return taskDefIdBuilder_.getMessageOrBuilder();
      } else {
        return taskDefId_ == null ?
            io.littlehorse.sdk.common.proto.TaskDefId.getDefaultInstance() : taskDefId_;
      }
    }
    /**
     * <pre>
     * TaskWorkerGroups are uniquely identified by their TaskDefId.
     * </pre>
     *
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TaskDefId, io.littlehorse.sdk.common.proto.TaskDefId.Builder, io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder> 
        getTaskDefIdFieldBuilder() {
      if (taskDefIdBuilder_ == null) {
        taskDefIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.TaskDefId, io.littlehorse.sdk.common.proto.TaskDefId.Builder, io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder>(
                getTaskDefId(),
                getParentForChildren(),
                isClean());
        taskDefId_ = null;
      }
      return taskDefIdBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:littlehorse.TaskWorkerGroupId)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.TaskWorkerGroupId)
  private static final io.littlehorse.sdk.common.proto.TaskWorkerGroupId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.TaskWorkerGroupId();
  }

  public static io.littlehorse.sdk.common.proto.TaskWorkerGroupId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskWorkerGroupId>
      PARSER = new com.google.protobuf.AbstractParser<TaskWorkerGroupId>() {
    @java.lang.Override
    public TaskWorkerGroupId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TaskWorkerGroupId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskWorkerGroupId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskWorkerGroupId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
