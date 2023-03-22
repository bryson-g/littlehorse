// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

/**
 * Protobuf type {@code littlehorse.ExternalEventNodeTimeoutPb}
 */
public final class ExternalEventNodeTimeoutPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.ExternalEventNodeTimeoutPb)
    ExternalEventNodeTimeoutPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExternalEventNodeTimeoutPb.newBuilder() to construct.
  private ExternalEventNodeTimeoutPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExternalEventNodeTimeoutPb() {
    wfRunId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExternalEventNodeTimeoutPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExternalEventNodeTimeoutPb(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            wfRunId_ = s;
            break;
          }
          case 16: {

            threadRunNumber_ = input.readInt32();
            break;
          }
          case 24: {

            nodeRunPosition_ = input.readInt32();
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (time_ != null) {
              subBuilder = time_.toBuilder();
            }
            time_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(time_);
              time_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.common.proto.InternalServer.internal_static_littlehorse_ExternalEventNodeTimeoutPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.common.proto.InternalServer.internal_static_littlehorse_ExternalEventNodeTimeoutPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.common.proto.ExternalEventNodeTimeoutPb.class, io.littlehorse.common.proto.ExternalEventNodeTimeoutPb.Builder.class);
  }

  public static final int WF_RUN_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object wfRunId_;
  /**
   * <code>string wf_run_id = 1;</code>
   * @return The wfRunId.
   */
  @java.lang.Override
  public java.lang.String getWfRunId() {
    java.lang.Object ref = wfRunId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      wfRunId_ = s;
      return s;
    }
  }
  /**
   * <code>string wf_run_id = 1;</code>
   * @return The bytes for wfRunId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWfRunIdBytes() {
    java.lang.Object ref = wfRunId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      wfRunId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THREAD_RUN_NUMBER_FIELD_NUMBER = 2;
  private int threadRunNumber_;
  /**
   * <code>int32 thread_run_number = 2;</code>
   * @return The threadRunNumber.
   */
  @java.lang.Override
  public int getThreadRunNumber() {
    return threadRunNumber_;
  }

  public static final int NODE_RUN_POSITION_FIELD_NUMBER = 3;
  private int nodeRunPosition_;
  /**
   * <code>int32 node_run_position = 3;</code>
   * @return The nodeRunPosition.
   */
  @java.lang.Override
  public int getNodeRunPosition() {
    return nodeRunPosition_;
  }

  public static final int TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp time_;
  /**
   * <code>.google.protobuf.Timestamp time = 4;</code>
   * @return Whether the time field is set.
   */
  @java.lang.Override
  public boolean hasTime() {
    return time_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 4;</code>
   * @return The time.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTime() {
    return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
  }
  /**
   * <code>.google.protobuf.Timestamp time = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
    return getTime();
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
    if (!getWfRunIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, wfRunId_);
    }
    if (threadRunNumber_ != 0) {
      output.writeInt32(2, threadRunNumber_);
    }
    if (nodeRunPosition_ != 0) {
      output.writeInt32(3, nodeRunPosition_);
    }
    if (time_ != null) {
      output.writeMessage(4, getTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getWfRunIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, wfRunId_);
    }
    if (threadRunNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, threadRunNumber_);
    }
    if (nodeRunPosition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, nodeRunPosition_);
    }
    if (time_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getTime());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.littlehorse.common.proto.ExternalEventNodeTimeoutPb)) {
      return super.equals(obj);
    }
    io.littlehorse.common.proto.ExternalEventNodeTimeoutPb other = (io.littlehorse.common.proto.ExternalEventNodeTimeoutPb) obj;

    if (!getWfRunId()
        .equals(other.getWfRunId())) return false;
    if (getThreadRunNumber()
        != other.getThreadRunNumber()) return false;
    if (getNodeRunPosition()
        != other.getNodeRunPosition()) return false;
    if (hasTime() != other.hasTime()) return false;
    if (hasTime()) {
      if (!getTime()
          .equals(other.getTime())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WF_RUN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWfRunId().hashCode();
    hash = (37 * hash) + THREAD_RUN_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getThreadRunNumber();
    hash = (37 * hash) + NODE_RUN_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getNodeRunPosition();
    if (hasTime()) {
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.common.proto.ExternalEventNodeTimeoutPb prototype) {
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
   * Protobuf type {@code littlehorse.ExternalEventNodeTimeoutPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.ExternalEventNodeTimeoutPb)
      io.littlehorse.common.proto.ExternalEventNodeTimeoutPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.common.proto.InternalServer.internal_static_littlehorse_ExternalEventNodeTimeoutPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.common.proto.InternalServer.internal_static_littlehorse_ExternalEventNodeTimeoutPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.common.proto.ExternalEventNodeTimeoutPb.class, io.littlehorse.common.proto.ExternalEventNodeTimeoutPb.Builder.class);
    }

    // Construct using io.littlehorse.common.proto.ExternalEventNodeTimeoutPb.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      wfRunId_ = "";

      threadRunNumber_ = 0;

      nodeRunPosition_ = 0;

      if (timeBuilder_ == null) {
        time_ = null;
      } else {
        time_ = null;
        timeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.common.proto.InternalServer.internal_static_littlehorse_ExternalEventNodeTimeoutPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.ExternalEventNodeTimeoutPb getDefaultInstanceForType() {
      return io.littlehorse.common.proto.ExternalEventNodeTimeoutPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.common.proto.ExternalEventNodeTimeoutPb build() {
      io.littlehorse.common.proto.ExternalEventNodeTimeoutPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.ExternalEventNodeTimeoutPb buildPartial() {
      io.littlehorse.common.proto.ExternalEventNodeTimeoutPb result = new io.littlehorse.common.proto.ExternalEventNodeTimeoutPb(this);
      result.wfRunId_ = wfRunId_;
      result.threadRunNumber_ = threadRunNumber_;
      result.nodeRunPosition_ = nodeRunPosition_;
      if (timeBuilder_ == null) {
        result.time_ = time_;
      } else {
        result.time_ = timeBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof io.littlehorse.common.proto.ExternalEventNodeTimeoutPb) {
        return mergeFrom((io.littlehorse.common.proto.ExternalEventNodeTimeoutPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.common.proto.ExternalEventNodeTimeoutPb other) {
      if (other == io.littlehorse.common.proto.ExternalEventNodeTimeoutPb.getDefaultInstance()) return this;
      if (!other.getWfRunId().isEmpty()) {
        wfRunId_ = other.wfRunId_;
        onChanged();
      }
      if (other.getThreadRunNumber() != 0) {
        setThreadRunNumber(other.getThreadRunNumber());
      }
      if (other.getNodeRunPosition() != 0) {
        setNodeRunPosition(other.getNodeRunPosition());
      }
      if (other.hasTime()) {
        mergeTime(other.getTime());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.littlehorse.common.proto.ExternalEventNodeTimeoutPb parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.littlehorse.common.proto.ExternalEventNodeTimeoutPb) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object wfRunId_ = "";
    /**
     * <code>string wf_run_id = 1;</code>
     * @return The wfRunId.
     */
    public java.lang.String getWfRunId() {
      java.lang.Object ref = wfRunId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        wfRunId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string wf_run_id = 1;</code>
     * @return The bytes for wfRunId.
     */
    public com.google.protobuf.ByteString
        getWfRunIdBytes() {
      java.lang.Object ref = wfRunId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        wfRunId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string wf_run_id = 1;</code>
     * @param value The wfRunId to set.
     * @return This builder for chaining.
     */
    public Builder setWfRunId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      wfRunId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string wf_run_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWfRunId() {
      
      wfRunId_ = getDefaultInstance().getWfRunId();
      onChanged();
      return this;
    }
    /**
     * <code>string wf_run_id = 1;</code>
     * @param value The bytes for wfRunId to set.
     * @return This builder for chaining.
     */
    public Builder setWfRunIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      wfRunId_ = value;
      onChanged();
      return this;
    }

    private int threadRunNumber_ ;
    /**
     * <code>int32 thread_run_number = 2;</code>
     * @return The threadRunNumber.
     */
    @java.lang.Override
    public int getThreadRunNumber() {
      return threadRunNumber_;
    }
    /**
     * <code>int32 thread_run_number = 2;</code>
     * @param value The threadRunNumber to set.
     * @return This builder for chaining.
     */
    public Builder setThreadRunNumber(int value) {
      
      threadRunNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 thread_run_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearThreadRunNumber() {
      
      threadRunNumber_ = 0;
      onChanged();
      return this;
    }

    private int nodeRunPosition_ ;
    /**
     * <code>int32 node_run_position = 3;</code>
     * @return The nodeRunPosition.
     */
    @java.lang.Override
    public int getNodeRunPosition() {
      return nodeRunPosition_;
    }
    /**
     * <code>int32 node_run_position = 3;</code>
     * @param value The nodeRunPosition to set.
     * @return This builder for chaining.
     */
    public Builder setNodeRunPosition(int value) {
      
      nodeRunPosition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 node_run_position = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNodeRunPosition() {
      
      nodeRunPosition_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp time_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     * @return Whether the time field is set.
     */
    public boolean hasTime() {
      return timeBuilder_ != null || time_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     * @return The time.
     */
    public com.google.protobuf.Timestamp getTime() {
      if (timeBuilder_ == null) {
        return time_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      } else {
        return timeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public Builder setTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        time_ = value;
        onChanged();
      } else {
        timeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public Builder setTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeBuilder_ == null) {
        time_ = builderForValue.build();
        onChanged();
      } else {
        timeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public Builder mergeTime(com.google.protobuf.Timestamp value) {
      if (timeBuilder_ == null) {
        if (time_ != null) {
          time_ =
            com.google.protobuf.Timestamp.newBuilder(time_).mergeFrom(value).buildPartial();
        } else {
          time_ = value;
        }
        onChanged();
      } else {
        timeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public Builder clearTime() {
      if (timeBuilder_ == null) {
        time_ = null;
        onChanged();
      } else {
        time_ = null;
        timeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeBuilder() {
      
      onChanged();
      return getTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeOrBuilder() {
      if (timeBuilder_ != null) {
        return timeBuilder_.getMessageOrBuilder();
      } else {
        return time_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : time_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeFieldBuilder() {
      if (timeBuilder_ == null) {
        timeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTime(),
                getParentForChildren(),
                isClean());
        time_ = null;
      }
      return timeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.ExternalEventNodeTimeoutPb)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.ExternalEventNodeTimeoutPb)
  private static final io.littlehorse.common.proto.ExternalEventNodeTimeoutPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.common.proto.ExternalEventNodeTimeoutPb();
  }

  public static io.littlehorse.common.proto.ExternalEventNodeTimeoutPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalEventNodeTimeoutPb>
      PARSER = new com.google.protobuf.AbstractParser<ExternalEventNodeTimeoutPb>() {
    @java.lang.Override
    public ExternalEventNodeTimeoutPb parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExternalEventNodeTimeoutPb(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExternalEventNodeTimeoutPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalEventNodeTimeoutPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.common.proto.ExternalEventNodeTimeoutPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

