// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

/**
 * Protobuf type {@code lh_proto.WFRunRequestPb}
 */
public final class WFRunRequestPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lh_proto.WFRunRequestPb)
    WFRunRequestPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WFRunRequestPb.newBuilder() to construct.
  private WFRunRequestPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WFRunRequestPb() {
    wfRunId_ = "";
    wfSpecId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WFRunRequestPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WFRunRequestPb(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            wfSpecId_ = s;
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
    return io.littlehorse.common.proto.LhProto.internal_static_lh_proto_WFRunRequestPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.common.proto.LhProto.internal_static_lh_proto_WFRunRequestPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.common.proto.WFRunRequestPb.class, io.littlehorse.common.proto.WFRunRequestPb.Builder.class);
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

  public static final int WF_SPEC_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object wfSpecId_;
  /**
   * <code>string wf_spec_id = 2;</code>
   * @return The wfSpecId.
   */
  @java.lang.Override
  public java.lang.String getWfSpecId() {
    java.lang.Object ref = wfSpecId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      wfSpecId_ = s;
      return s;
    }
  }
  /**
   * <code>string wf_spec_id = 2;</code>
   * @return The bytes for wfSpecId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWfSpecIdBytes() {
    java.lang.Object ref = wfSpecId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      wfSpecId_ = b;
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
    if (!getWfRunIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, wfRunId_);
    }
    if (!getWfSpecIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, wfSpecId_);
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
    if (!getWfSpecIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, wfSpecId_);
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
    if (!(obj instanceof io.littlehorse.common.proto.WFRunRequestPb)) {
      return super.equals(obj);
    }
    io.littlehorse.common.proto.WFRunRequestPb other = (io.littlehorse.common.proto.WFRunRequestPb) obj;

    if (!getWfRunId()
        .equals(other.getWfRunId())) return false;
    if (!getWfSpecId()
        .equals(other.getWfSpecId())) return false;
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
    hash = (37 * hash) + WF_SPEC_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWfSpecId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.WFRunRequestPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.common.proto.WFRunRequestPb prototype) {
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
   * Protobuf type {@code lh_proto.WFRunRequestPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lh_proto.WFRunRequestPb)
      io.littlehorse.common.proto.WFRunRequestPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.common.proto.LhProto.internal_static_lh_proto_WFRunRequestPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.common.proto.LhProto.internal_static_lh_proto_WFRunRequestPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.common.proto.WFRunRequestPb.class, io.littlehorse.common.proto.WFRunRequestPb.Builder.class);
    }

    // Construct using io.littlehorse.common.proto.WFRunRequestPb.newBuilder()
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

      wfSpecId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.common.proto.LhProto.internal_static_lh_proto_WFRunRequestPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.WFRunRequestPb getDefaultInstanceForType() {
      return io.littlehorse.common.proto.WFRunRequestPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.common.proto.WFRunRequestPb build() {
      io.littlehorse.common.proto.WFRunRequestPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.WFRunRequestPb buildPartial() {
      io.littlehorse.common.proto.WFRunRequestPb result = new io.littlehorse.common.proto.WFRunRequestPb(this);
      result.wfRunId_ = wfRunId_;
      result.wfSpecId_ = wfSpecId_;
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
      if (other instanceof io.littlehorse.common.proto.WFRunRequestPb) {
        return mergeFrom((io.littlehorse.common.proto.WFRunRequestPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.common.proto.WFRunRequestPb other) {
      if (other == io.littlehorse.common.proto.WFRunRequestPb.getDefaultInstance()) return this;
      if (!other.getWfRunId().isEmpty()) {
        wfRunId_ = other.wfRunId_;
        onChanged();
      }
      if (!other.getWfSpecId().isEmpty()) {
        wfSpecId_ = other.wfSpecId_;
        onChanged();
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
      io.littlehorse.common.proto.WFRunRequestPb parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.littlehorse.common.proto.WFRunRequestPb) e.getUnfinishedMessage();
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

    private java.lang.Object wfSpecId_ = "";
    /**
     * <code>string wf_spec_id = 2;</code>
     * @return The wfSpecId.
     */
    public java.lang.String getWfSpecId() {
      java.lang.Object ref = wfSpecId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        wfSpecId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string wf_spec_id = 2;</code>
     * @return The bytes for wfSpecId.
     */
    public com.google.protobuf.ByteString
        getWfSpecIdBytes() {
      java.lang.Object ref = wfSpecId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        wfSpecId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string wf_spec_id = 2;</code>
     * @param value The wfSpecId to set.
     * @return This builder for chaining.
     */
    public Builder setWfSpecId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      wfSpecId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string wf_spec_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWfSpecId() {
      
      wfSpecId_ = getDefaultInstance().getWfSpecId();
      onChanged();
      return this;
    }
    /**
     * <code>string wf_spec_id = 2;</code>
     * @param value The bytes for wfSpecId to set.
     * @return This builder for chaining.
     */
    public Builder setWfSpecIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      wfSpecId_ = value;
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


    // @@protoc_insertion_point(builder_scope:lh_proto.WFRunRequestPb)
  }

  // @@protoc_insertion_point(class_scope:lh_proto.WFRunRequestPb)
  private static final io.littlehorse.common.proto.WFRunRequestPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.common.proto.WFRunRequestPb();
  }

  public static io.littlehorse.common.proto.WFRunRequestPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WFRunRequestPb>
      PARSER = new com.google.protobuf.AbstractParser<WFRunRequestPb>() {
    @java.lang.Override
    public WFRunRequestPb parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WFRunRequestPb(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WFRunRequestPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WFRunRequestPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.common.proto.WFRunRequestPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

