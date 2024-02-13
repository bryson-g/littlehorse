// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_run.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * A Halt Reason denoting that a ThreadRun is halted while a Failure Handler is being run.
 * </pre>
 *
 * Protobuf type {@code littlehorse.HandlingFailureHaltReason}
 */
public final class HandlingFailureHaltReason extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.HandlingFailureHaltReason)
    HandlingFailureHaltReasonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HandlingFailureHaltReason.newBuilder() to construct.
  private HandlingFailureHaltReason(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HandlingFailureHaltReason() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HandlingFailureHaltReason();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_HandlingFailureHaltReason_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_HandlingFailureHaltReason_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.HandlingFailureHaltReason.class, io.littlehorse.sdk.common.proto.HandlingFailureHaltReason.Builder.class);
  }

  public static final int HANDLER_THREAD_ID_FIELD_NUMBER = 1;
  private int handlerThreadId_ = 0;
  /**
   * <pre>
   * The ID of the Failure Handler ThreadRun.
   * </pre>
   *
   * <code>int32 handler_thread_id = 1;</code>
   * @return The handlerThreadId.
   */
  @java.lang.Override
  public int getHandlerThreadId() {
    return handlerThreadId_;
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
    if (handlerThreadId_ != 0) {
      output.writeInt32(1, handlerThreadId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (handlerThreadId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, handlerThreadId_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.HandlingFailureHaltReason)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.HandlingFailureHaltReason other = (io.littlehorse.sdk.common.proto.HandlingFailureHaltReason) obj;

    if (getHandlerThreadId()
        != other.getHandlerThreadId()) return false;
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
    hash = (37 * hash) + HANDLER_THREAD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHandlerThreadId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.HandlingFailureHaltReason prototype) {
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
   * A Halt Reason denoting that a ThreadRun is halted while a Failure Handler is being run.
   * </pre>
   *
   * Protobuf type {@code littlehorse.HandlingFailureHaltReason}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.HandlingFailureHaltReason)
      io.littlehorse.sdk.common.proto.HandlingFailureHaltReasonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_HandlingFailureHaltReason_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_HandlingFailureHaltReason_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.HandlingFailureHaltReason.class, io.littlehorse.sdk.common.proto.HandlingFailureHaltReason.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.HandlingFailureHaltReason.newBuilder()
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
      handlerThreadId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.WfRunOuterClass.internal_static_littlehorse_HandlingFailureHaltReason_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.HandlingFailureHaltReason getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.HandlingFailureHaltReason.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.HandlingFailureHaltReason build() {
      io.littlehorse.sdk.common.proto.HandlingFailureHaltReason result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.HandlingFailureHaltReason buildPartial() {
      io.littlehorse.sdk.common.proto.HandlingFailureHaltReason result = new io.littlehorse.sdk.common.proto.HandlingFailureHaltReason(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.HandlingFailureHaltReason result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.handlerThreadId_ = handlerThreadId_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.HandlingFailureHaltReason) {
        return mergeFrom((io.littlehorse.sdk.common.proto.HandlingFailureHaltReason)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.HandlingFailureHaltReason other) {
      if (other == io.littlehorse.sdk.common.proto.HandlingFailureHaltReason.getDefaultInstance()) return this;
      if (other.getHandlerThreadId() != 0) {
        setHandlerThreadId(other.getHandlerThreadId());
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
            case 8: {
              handlerThreadId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int handlerThreadId_ ;
    /**
     * <pre>
     * The ID of the Failure Handler ThreadRun.
     * </pre>
     *
     * <code>int32 handler_thread_id = 1;</code>
     * @return The handlerThreadId.
     */
    @java.lang.Override
    public int getHandlerThreadId() {
      return handlerThreadId_;
    }
    /**
     * <pre>
     * The ID of the Failure Handler ThreadRun.
     * </pre>
     *
     * <code>int32 handler_thread_id = 1;</code>
     * @param value The handlerThreadId to set.
     * @return This builder for chaining.
     */
    public Builder setHandlerThreadId(int value) {

      handlerThreadId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the Failure Handler ThreadRun.
     * </pre>
     *
     * <code>int32 handler_thread_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHandlerThreadId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      handlerThreadId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.HandlingFailureHaltReason)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.HandlingFailureHaltReason)
  private static final io.littlehorse.sdk.common.proto.HandlingFailureHaltReason DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.HandlingFailureHaltReason();
  }

  public static io.littlehorse.sdk.common.proto.HandlingFailureHaltReason getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HandlingFailureHaltReason>
      PARSER = new com.google.protobuf.AbstractParser<HandlingFailureHaltReason>() {
    @java.lang.Override
    public HandlingFailureHaltReason parsePartialFrom(
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

  public static com.google.protobuf.Parser<HandlingFailureHaltReason> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HandlingFailureHaltReason> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.HandlingFailureHaltReason getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

