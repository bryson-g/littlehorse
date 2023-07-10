// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.TaskNodeRunPb}
 */
public final class TaskNodeRunPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.TaskNodeRunPb)
    TaskNodeRunPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskNodeRunPb.newBuilder() to construct.
  private TaskNodeRunPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskNodeRunPb() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskNodeRunPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskNodeRunPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskNodeRunPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.TaskNodeRunPb.class, io.littlehorse.sdk.common.proto.TaskNodeRunPb.Builder.class);
  }

  public static final int TASK_RUN_ID_FIELD_NUMBER = 1;
  private io.littlehorse.sdk.common.proto.TaskRunIdPb taskRunId_;
  /**
   * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
   * @return Whether the taskRunId field is set.
   */
  @java.lang.Override
  public boolean hasTaskRunId() {
    return taskRunId_ != null;
  }
  /**
   * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
   * @return The taskRunId.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskRunIdPb getTaskRunId() {
    return taskRunId_ == null ? io.littlehorse.sdk.common.proto.TaskRunIdPb.getDefaultInstance() : taskRunId_;
  }
  /**
   * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskRunIdPbOrBuilder getTaskRunIdOrBuilder() {
    return taskRunId_ == null ? io.littlehorse.sdk.common.proto.TaskRunIdPb.getDefaultInstance() : taskRunId_;
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
    if (taskRunId_ != null) {
      output.writeMessage(1, getTaskRunId());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (taskRunId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTaskRunId());
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.TaskNodeRunPb)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.TaskNodeRunPb other = (io.littlehorse.sdk.common.proto.TaskNodeRunPb) obj;

    if (hasTaskRunId() != other.hasTaskRunId()) return false;
    if (hasTaskRunId()) {
      if (!getTaskRunId()
          .equals(other.getTaskRunId())) return false;
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
    if (hasTaskRunId()) {
      hash = (37 * hash) + TASK_RUN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTaskRunId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.TaskNodeRunPb prototype) {
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
   * Protobuf type {@code littlehorse.TaskNodeRunPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.TaskNodeRunPb)
      io.littlehorse.sdk.common.proto.TaskNodeRunPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskNodeRunPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskNodeRunPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.TaskNodeRunPb.class, io.littlehorse.sdk.common.proto.TaskNodeRunPb.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.TaskNodeRunPb.newBuilder()
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
      taskRunId_ = null;
      if (taskRunIdBuilder_ != null) {
        taskRunIdBuilder_.dispose();
        taskRunIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskNodeRunPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskNodeRunPb getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.TaskNodeRunPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskNodeRunPb build() {
      io.littlehorse.sdk.common.proto.TaskNodeRunPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskNodeRunPb buildPartial() {
      io.littlehorse.sdk.common.proto.TaskNodeRunPb result = new io.littlehorse.sdk.common.proto.TaskNodeRunPb(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.TaskNodeRunPb result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.taskRunId_ = taskRunIdBuilder_ == null
            ? taskRunId_
            : taskRunIdBuilder_.build();
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
      if (other instanceof io.littlehorse.sdk.common.proto.TaskNodeRunPb) {
        return mergeFrom((io.littlehorse.sdk.common.proto.TaskNodeRunPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.TaskNodeRunPb other) {
      if (other == io.littlehorse.sdk.common.proto.TaskNodeRunPb.getDefaultInstance()) return this;
      if (other.hasTaskRunId()) {
        mergeTaskRunId(other.getTaskRunId());
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
                  getTaskRunIdFieldBuilder().getBuilder(),
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

    private io.littlehorse.sdk.common.proto.TaskRunIdPb taskRunId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TaskRunIdPb, io.littlehorse.sdk.common.proto.TaskRunIdPb.Builder, io.littlehorse.sdk.common.proto.TaskRunIdPbOrBuilder> taskRunIdBuilder_;
    /**
     * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
     * @return Whether the taskRunId field is set.
     */
    public boolean hasTaskRunId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
     * @return The taskRunId.
     */
    public io.littlehorse.sdk.common.proto.TaskRunIdPb getTaskRunId() {
      if (taskRunIdBuilder_ == null) {
        return taskRunId_ == null ? io.littlehorse.sdk.common.proto.TaskRunIdPb.getDefaultInstance() : taskRunId_;
      } else {
        return taskRunIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
     */
    public Builder setTaskRunId(io.littlehorse.sdk.common.proto.TaskRunIdPb value) {
      if (taskRunIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        taskRunId_ = value;
      } else {
        taskRunIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
     */
    public Builder setTaskRunId(
        io.littlehorse.sdk.common.proto.TaskRunIdPb.Builder builderForValue) {
      if (taskRunIdBuilder_ == null) {
        taskRunId_ = builderForValue.build();
      } else {
        taskRunIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
     */
    public Builder mergeTaskRunId(io.littlehorse.sdk.common.proto.TaskRunIdPb value) {
      if (taskRunIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          taskRunId_ != null &&
          taskRunId_ != io.littlehorse.sdk.common.proto.TaskRunIdPb.getDefaultInstance()) {
          getTaskRunIdBuilder().mergeFrom(value);
        } else {
          taskRunId_ = value;
        }
      } else {
        taskRunIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
     */
    public Builder clearTaskRunId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      taskRunId_ = null;
      if (taskRunIdBuilder_ != null) {
        taskRunIdBuilder_.dispose();
        taskRunIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskRunIdPb.Builder getTaskRunIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTaskRunIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskRunIdPbOrBuilder getTaskRunIdOrBuilder() {
      if (taskRunIdBuilder_ != null) {
        return taskRunIdBuilder_.getMessageOrBuilder();
      } else {
        return taskRunId_ == null ?
            io.littlehorse.sdk.common.proto.TaskRunIdPb.getDefaultInstance() : taskRunId_;
      }
    }
    /**
     * <code>.littlehorse.TaskRunIdPb task_run_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TaskRunIdPb, io.littlehorse.sdk.common.proto.TaskRunIdPb.Builder, io.littlehorse.sdk.common.proto.TaskRunIdPbOrBuilder> 
        getTaskRunIdFieldBuilder() {
      if (taskRunIdBuilder_ == null) {
        taskRunIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.TaskRunIdPb, io.littlehorse.sdk.common.proto.TaskRunIdPb.Builder, io.littlehorse.sdk.common.proto.TaskRunIdPbOrBuilder>(
                getTaskRunId(),
                getParentForChildren(),
                isClean());
        taskRunId_ = null;
      }
      return taskRunIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.TaskNodeRunPb)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.TaskNodeRunPb)
  private static final io.littlehorse.sdk.common.proto.TaskNodeRunPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.TaskNodeRunPb();
  }

  public static io.littlehorse.sdk.common.proto.TaskNodeRunPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskNodeRunPb>
      PARSER = new com.google.protobuf.AbstractParser<TaskNodeRunPb>() {
    @java.lang.Override
    public TaskNodeRunPb parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskNodeRunPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskNodeRunPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskNodeRunPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

