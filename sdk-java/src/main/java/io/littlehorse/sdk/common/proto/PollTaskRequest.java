// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.PollTaskRequest}
 */
public final class PollTaskRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.PollTaskRequest)
    PollTaskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PollTaskRequest.newBuilder() to construct.
  private PollTaskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PollTaskRequest() {
    clientId_ = "";
    taskWorkerVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PollTaskRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PollTaskRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PollTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.PollTaskRequest.class, io.littlehorse.sdk.common.proto.PollTaskRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TASK_DEF_ID_FIELD_NUMBER = 1;
  private io.littlehorse.sdk.common.proto.TaskDefId taskDefId_;
  /**
   * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
   * @return Whether the taskDefId field is set.
   */
  @java.lang.Override
  public boolean hasTaskDefId() {
    return taskDefId_ != null;
  }
  /**
   * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
   * @return The taskDefId.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskDefId getTaskDefId() {
    return taskDefId_ == null ? io.littlehorse.sdk.common.proto.TaskDefId.getDefaultInstance() : taskDefId_;
  }
  /**
   * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskDefIdOrBuilder getTaskDefIdOrBuilder() {
    return taskDefId_ == null ? io.littlehorse.sdk.common.proto.TaskDefId.getDefaultInstance() : taskDefId_;
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
   * <code>string client_id = 2;</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <code>string client_id = 2;</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TASK_WORKER_VERSION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object taskWorkerVersion_ = "";
  /**
   * <code>optional string task_worker_version = 3;</code>
   * @return Whether the taskWorkerVersion field is set.
   */
  @java.lang.Override
  public boolean hasTaskWorkerVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string task_worker_version = 3;</code>
   * @return The taskWorkerVersion.
   */
  @java.lang.Override
  public java.lang.String getTaskWorkerVersion() {
    java.lang.Object ref = taskWorkerVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskWorkerVersion_ = s;
      return s;
    }
  }
  /**
   * <code>optional string task_worker_version = 3;</code>
   * @return The bytes for taskWorkerVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskWorkerVersionBytes() {
    java.lang.Object ref = taskWorkerVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskWorkerVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, taskWorkerVersion_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, taskWorkerVersion_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.PollTaskRequest)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.PollTaskRequest other = (io.littlehorse.sdk.common.proto.PollTaskRequest) obj;

    if (hasTaskDefId() != other.hasTaskDefId()) return false;
    if (hasTaskDefId()) {
      if (!getTaskDefId()
          .equals(other.getTaskDefId())) return false;
    }
    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (hasTaskWorkerVersion() != other.hasTaskWorkerVersion()) return false;
    if (hasTaskWorkerVersion()) {
      if (!getTaskWorkerVersion()
          .equals(other.getTaskWorkerVersion())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    if (hasTaskWorkerVersion()) {
      hash = (37 * hash) + TASK_WORKER_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getTaskWorkerVersion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.PollTaskRequest parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.PollTaskRequest prototype) {
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
   * Protobuf type {@code littlehorse.PollTaskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.PollTaskRequest)
      io.littlehorse.sdk.common.proto.PollTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PollTaskRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PollTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.PollTaskRequest.class, io.littlehorse.sdk.common.proto.PollTaskRequest.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.PollTaskRequest.newBuilder()
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
      clientId_ = "";
      taskWorkerVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_PollTaskRequest_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.PollTaskRequest getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.PollTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.PollTaskRequest build() {
      io.littlehorse.sdk.common.proto.PollTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.PollTaskRequest buildPartial() {
      io.littlehorse.sdk.common.proto.PollTaskRequest result = new io.littlehorse.sdk.common.proto.PollTaskRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.PollTaskRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.taskDefId_ = taskDefIdBuilder_ == null
            ? taskDefId_
            : taskDefIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientId_ = clientId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.taskWorkerVersion_ = taskWorkerVersion_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.PollTaskRequest) {
        return mergeFrom((io.littlehorse.sdk.common.proto.PollTaskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.PollTaskRequest other) {
      if (other == io.littlehorse.sdk.common.proto.PollTaskRequest.getDefaultInstance()) return this;
      if (other.hasTaskDefId()) {
        mergeTaskDefId(other.getTaskDefId());
      }
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasTaskWorkerVersion()) {
        taskWorkerVersion_ = other.taskWorkerVersion_;
        bitField0_ |= 0x00000004;
        onChanged();
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
            case 18: {
              clientId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              taskWorkerVersion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     * @return Whether the taskDefId field is set.
     */
    public boolean hasTaskDefId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
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
     * <code>.littlehorse.TaskDefId task_def_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskDefId.Builder getTaskDefIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTaskDefIdFieldBuilder().getBuilder();
    }
    /**
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

    private java.lang.Object clientId_ = "";
    /**
     * <code>string client_id = 2;</code>
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string client_id = 2;</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string client_id = 2;</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 2;</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object taskWorkerVersion_ = "";
    /**
     * <code>optional string task_worker_version = 3;</code>
     * @return Whether the taskWorkerVersion field is set.
     */
    public boolean hasTaskWorkerVersion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string task_worker_version = 3;</code>
     * @return The taskWorkerVersion.
     */
    public java.lang.String getTaskWorkerVersion() {
      java.lang.Object ref = taskWorkerVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskWorkerVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string task_worker_version = 3;</code>
     * @return The bytes for taskWorkerVersion.
     */
    public com.google.protobuf.ByteString
        getTaskWorkerVersionBytes() {
      java.lang.Object ref = taskWorkerVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskWorkerVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string task_worker_version = 3;</code>
     * @param value The taskWorkerVersion to set.
     * @return This builder for chaining.
     */
    public Builder setTaskWorkerVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      taskWorkerVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional string task_worker_version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskWorkerVersion() {
      taskWorkerVersion_ = getDefaultInstance().getTaskWorkerVersion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>optional string task_worker_version = 3;</code>
     * @param value The bytes for taskWorkerVersion to set.
     * @return This builder for chaining.
     */
    public Builder setTaskWorkerVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      taskWorkerVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.PollTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.PollTaskRequest)
  private static final io.littlehorse.sdk.common.proto.PollTaskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.PollTaskRequest();
  }

  public static io.littlehorse.sdk.common.proto.PollTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PollTaskRequest>
      PARSER = new com.google.protobuf.AbstractParser<PollTaskRequest>() {
    @java.lang.Override
    public PollTaskRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PollTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PollTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.PollTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

