// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: command.proto

package io.littlehorse.common.proto;

/**
 * Protobuf type {@code littlehorse.SleepNodeMaturedPb}
 */
public final class SleepNodeMaturedPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.SleepNodeMaturedPb)
    SleepNodeMaturedPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SleepNodeMaturedPb.newBuilder() to construct.
  private SleepNodeMaturedPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SleepNodeMaturedPb() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SleepNodeMaturedPb();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.common.proto.CommandOuterClass.internal_static_littlehorse_SleepNodeMaturedPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.common.proto.CommandOuterClass.internal_static_littlehorse_SleepNodeMaturedPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.common.proto.SleepNodeMaturedPb.class, io.littlehorse.common.proto.SleepNodeMaturedPb.Builder.class);
  }

  public static final int NODE_RUN_ID_FIELD_NUMBER = 1;
  private io.littlehorse.sdk.common.proto.NodeRunId nodeRunId_;
  /**
   * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
   * @return Whether the nodeRunId field is set.
   */
  @java.lang.Override
  public boolean hasNodeRunId() {
    return nodeRunId_ != null;
  }
  /**
   * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
   * @return The nodeRunId.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.NodeRunId getNodeRunId() {
    return nodeRunId_ == null ? io.littlehorse.sdk.common.proto.NodeRunId.getDefaultInstance() : nodeRunId_;
  }
  /**
   * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.NodeRunIdOrBuilder getNodeRunIdOrBuilder() {
    return nodeRunId_ == null ? io.littlehorse.sdk.common.proto.NodeRunId.getDefaultInstance() : nodeRunId_;
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
    if (nodeRunId_ != null) {
      output.writeMessage(1, getNodeRunId());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeRunId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNodeRunId());
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
    if (!(obj instanceof io.littlehorse.common.proto.SleepNodeMaturedPb)) {
      return super.equals(obj);
    }
    io.littlehorse.common.proto.SleepNodeMaturedPb other = (io.littlehorse.common.proto.SleepNodeMaturedPb) obj;

    if (hasNodeRunId() != other.hasNodeRunId()) return false;
    if (hasNodeRunId()) {
      if (!getNodeRunId()
          .equals(other.getNodeRunId())) return false;
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
    if (hasNodeRunId()) {
      hash = (37 * hash) + NODE_RUN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNodeRunId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.SleepNodeMaturedPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.common.proto.SleepNodeMaturedPb prototype) {
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
   * Protobuf type {@code littlehorse.SleepNodeMaturedPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.SleepNodeMaturedPb)
      io.littlehorse.common.proto.SleepNodeMaturedPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.common.proto.CommandOuterClass.internal_static_littlehorse_SleepNodeMaturedPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.common.proto.CommandOuterClass.internal_static_littlehorse_SleepNodeMaturedPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.common.proto.SleepNodeMaturedPb.class, io.littlehorse.common.proto.SleepNodeMaturedPb.Builder.class);
    }

    // Construct using io.littlehorse.common.proto.SleepNodeMaturedPb.newBuilder()
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
      nodeRunId_ = null;
      if (nodeRunIdBuilder_ != null) {
        nodeRunIdBuilder_.dispose();
        nodeRunIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.common.proto.CommandOuterClass.internal_static_littlehorse_SleepNodeMaturedPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.SleepNodeMaturedPb getDefaultInstanceForType() {
      return io.littlehorse.common.proto.SleepNodeMaturedPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.common.proto.SleepNodeMaturedPb build() {
      io.littlehorse.common.proto.SleepNodeMaturedPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.SleepNodeMaturedPb buildPartial() {
      io.littlehorse.common.proto.SleepNodeMaturedPb result = new io.littlehorse.common.proto.SleepNodeMaturedPb(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.common.proto.SleepNodeMaturedPb result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nodeRunId_ = nodeRunIdBuilder_ == null
            ? nodeRunId_
            : nodeRunIdBuilder_.build();
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
      if (other instanceof io.littlehorse.common.proto.SleepNodeMaturedPb) {
        return mergeFrom((io.littlehorse.common.proto.SleepNodeMaturedPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.common.proto.SleepNodeMaturedPb other) {
      if (other == io.littlehorse.common.proto.SleepNodeMaturedPb.getDefaultInstance()) return this;
      if (other.hasNodeRunId()) {
        mergeNodeRunId(other.getNodeRunId());
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
                  getNodeRunIdFieldBuilder().getBuilder(),
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

    private io.littlehorse.sdk.common.proto.NodeRunId nodeRunId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.NodeRunId, io.littlehorse.sdk.common.proto.NodeRunId.Builder, io.littlehorse.sdk.common.proto.NodeRunIdOrBuilder> nodeRunIdBuilder_;
    /**
     * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
     * @return Whether the nodeRunId field is set.
     */
    public boolean hasNodeRunId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
     * @return The nodeRunId.
     */
    public io.littlehorse.sdk.common.proto.NodeRunId getNodeRunId() {
      if (nodeRunIdBuilder_ == null) {
        return nodeRunId_ == null ? io.littlehorse.sdk.common.proto.NodeRunId.getDefaultInstance() : nodeRunId_;
      } else {
        return nodeRunIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
     */
    public Builder setNodeRunId(io.littlehorse.sdk.common.proto.NodeRunId value) {
      if (nodeRunIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nodeRunId_ = value;
      } else {
        nodeRunIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
     */
    public Builder setNodeRunId(
        io.littlehorse.sdk.common.proto.NodeRunId.Builder builderForValue) {
      if (nodeRunIdBuilder_ == null) {
        nodeRunId_ = builderForValue.build();
      } else {
        nodeRunIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
     */
    public Builder mergeNodeRunId(io.littlehorse.sdk.common.proto.NodeRunId value) {
      if (nodeRunIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          nodeRunId_ != null &&
          nodeRunId_ != io.littlehorse.sdk.common.proto.NodeRunId.getDefaultInstance()) {
          getNodeRunIdBuilder().mergeFrom(value);
        } else {
          nodeRunId_ = value;
        }
      } else {
        nodeRunIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
     */
    public Builder clearNodeRunId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nodeRunId_ = null;
      if (nodeRunIdBuilder_ != null) {
        nodeRunIdBuilder_.dispose();
        nodeRunIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.NodeRunId.Builder getNodeRunIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNodeRunIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.NodeRunIdOrBuilder getNodeRunIdOrBuilder() {
      if (nodeRunIdBuilder_ != null) {
        return nodeRunIdBuilder_.getMessageOrBuilder();
      } else {
        return nodeRunId_ == null ?
            io.littlehorse.sdk.common.proto.NodeRunId.getDefaultInstance() : nodeRunId_;
      }
    }
    /**
     * <code>.littlehorse.NodeRunId node_run_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.NodeRunId, io.littlehorse.sdk.common.proto.NodeRunId.Builder, io.littlehorse.sdk.common.proto.NodeRunIdOrBuilder> 
        getNodeRunIdFieldBuilder() {
      if (nodeRunIdBuilder_ == null) {
        nodeRunIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.NodeRunId, io.littlehorse.sdk.common.proto.NodeRunId.Builder, io.littlehorse.sdk.common.proto.NodeRunIdOrBuilder>(
                getNodeRunId(),
                getParentForChildren(),
                isClean());
        nodeRunId_ = null;
      }
      return nodeRunIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.SleepNodeMaturedPb)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.SleepNodeMaturedPb)
  private static final io.littlehorse.common.proto.SleepNodeMaturedPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.common.proto.SleepNodeMaturedPb();
  }

  public static io.littlehorse.common.proto.SleepNodeMaturedPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SleepNodeMaturedPb>
      PARSER = new com.google.protobuf.AbstractParser<SleepNodeMaturedPb>() {
    @java.lang.Override
    public SleepNodeMaturedPb parsePartialFrom(
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

  public static com.google.protobuf.Parser<SleepNodeMaturedPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SleepNodeMaturedPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.common.proto.SleepNodeMaturedPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

