// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

/**
 * Protobuf type {@code lh_proto.CentralStoreQueryPb}
 */
public final class CentralStoreQueryPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lh_proto.CentralStoreQueryPb)
    CentralStoreQueryPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CentralStoreQueryPb.newBuilder() to construct.
  private CentralStoreQueryPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CentralStoreQueryPb() {
    fullKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CentralStoreQueryPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CentralStoreQueryPb(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {

            enableStaleStores_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fullKey_ = s;
            break;
          }
          case 24: {
            bitField0_ |= 0x00000001;
            specificPartition_ = input.readInt32();
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
    return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_CentralStoreQueryPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_CentralStoreQueryPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.common.proto.CentralStoreQueryPb.class, io.littlehorse.common.proto.CentralStoreQueryPb.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLE_STALE_STORES_FIELD_NUMBER = 1;
  private boolean enableStaleStores_;
  /**
   * <code>bool enable_stale_stores = 1;</code>
   * @return The enableStaleStores.
   */
  @java.lang.Override
  public boolean getEnableStaleStores() {
    return enableStaleStores_;
  }

  public static final int FULL_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object fullKey_;
  /**
   * <code>string full_key = 2;</code>
   * @return The fullKey.
   */
  @java.lang.Override
  public java.lang.String getFullKey() {
    java.lang.Object ref = fullKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullKey_ = s;
      return s;
    }
  }
  /**
   * <code>string full_key = 2;</code>
   * @return The bytes for fullKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFullKeyBytes() {
    java.lang.Object ref = fullKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fullKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPECIFIC_PARTITION_FIELD_NUMBER = 3;
  private int specificPartition_;
  /**
   * <code>int32 specific_partition = 3;</code>
   * @return Whether the specificPartition field is set.
   */
  @java.lang.Override
  public boolean hasSpecificPartition() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>int32 specific_partition = 3;</code>
   * @return The specificPartition.
   */
  @java.lang.Override
  public int getSpecificPartition() {
    return specificPartition_;
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
    if (enableStaleStores_ != false) {
      output.writeBool(1, enableStaleStores_);
    }
    if (!getFullKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fullKey_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(3, specificPartition_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableStaleStores_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableStaleStores_);
    }
    if (!getFullKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fullKey_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, specificPartition_);
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
    if (!(obj instanceof io.littlehorse.common.proto.CentralStoreQueryPb)) {
      return super.equals(obj);
    }
    io.littlehorse.common.proto.CentralStoreQueryPb other = (io.littlehorse.common.proto.CentralStoreQueryPb) obj;

    if (getEnableStaleStores()
        != other.getEnableStaleStores()) return false;
    if (!getFullKey()
        .equals(other.getFullKey())) return false;
    if (hasSpecificPartition() != other.hasSpecificPartition()) return false;
    if (hasSpecificPartition()) {
      if (getSpecificPartition()
          != other.getSpecificPartition()) return false;
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
    hash = (37 * hash) + ENABLE_STALE_STORES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableStaleStores());
    hash = (37 * hash) + FULL_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getFullKey().hashCode();
    if (hasSpecificPartition()) {
      hash = (37 * hash) + SPECIFIC_PARTITION_FIELD_NUMBER;
      hash = (53 * hash) + getSpecificPartition();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.CentralStoreQueryPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.common.proto.CentralStoreQueryPb prototype) {
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
   * Protobuf type {@code lh_proto.CentralStoreQueryPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lh_proto.CentralStoreQueryPb)
      io.littlehorse.common.proto.CentralStoreQueryPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_CentralStoreQueryPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_CentralStoreQueryPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.common.proto.CentralStoreQueryPb.class, io.littlehorse.common.proto.CentralStoreQueryPb.Builder.class);
    }

    // Construct using io.littlehorse.common.proto.CentralStoreQueryPb.newBuilder()
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
      enableStaleStores_ = false;

      fullKey_ = "";

      specificPartition_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_CentralStoreQueryPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.CentralStoreQueryPb getDefaultInstanceForType() {
      return io.littlehorse.common.proto.CentralStoreQueryPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.common.proto.CentralStoreQueryPb build() {
      io.littlehorse.common.proto.CentralStoreQueryPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.CentralStoreQueryPb buildPartial() {
      io.littlehorse.common.proto.CentralStoreQueryPb result = new io.littlehorse.common.proto.CentralStoreQueryPb(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.enableStaleStores_ = enableStaleStores_;
      result.fullKey_ = fullKey_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.specificPartition_ = specificPartition_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.littlehorse.common.proto.CentralStoreQueryPb) {
        return mergeFrom((io.littlehorse.common.proto.CentralStoreQueryPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.common.proto.CentralStoreQueryPb other) {
      if (other == io.littlehorse.common.proto.CentralStoreQueryPb.getDefaultInstance()) return this;
      if (other.getEnableStaleStores() != false) {
        setEnableStaleStores(other.getEnableStaleStores());
      }
      if (!other.getFullKey().isEmpty()) {
        fullKey_ = other.fullKey_;
        onChanged();
      }
      if (other.hasSpecificPartition()) {
        setSpecificPartition(other.getSpecificPartition());
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
      io.littlehorse.common.proto.CentralStoreQueryPb parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.littlehorse.common.proto.CentralStoreQueryPb) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean enableStaleStores_ ;
    /**
     * <code>bool enable_stale_stores = 1;</code>
     * @return The enableStaleStores.
     */
    @java.lang.Override
    public boolean getEnableStaleStores() {
      return enableStaleStores_;
    }
    /**
     * <code>bool enable_stale_stores = 1;</code>
     * @param value The enableStaleStores to set.
     * @return This builder for chaining.
     */
    public Builder setEnableStaleStores(boolean value) {
      
      enableStaleStores_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enable_stale_stores = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableStaleStores() {
      
      enableStaleStores_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object fullKey_ = "";
    /**
     * <code>string full_key = 2;</code>
     * @return The fullKey.
     */
    public java.lang.String getFullKey() {
      java.lang.Object ref = fullKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string full_key = 2;</code>
     * @return The bytes for fullKey.
     */
    public com.google.protobuf.ByteString
        getFullKeyBytes() {
      java.lang.Object ref = fullKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string full_key = 2;</code>
     * @param value The fullKey to set.
     * @return This builder for chaining.
     */
    public Builder setFullKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fullKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string full_key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFullKey() {
      
      fullKey_ = getDefaultInstance().getFullKey();
      onChanged();
      return this;
    }
    /**
     * <code>string full_key = 2;</code>
     * @param value The bytes for fullKey to set.
     * @return This builder for chaining.
     */
    public Builder setFullKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fullKey_ = value;
      onChanged();
      return this;
    }

    private int specificPartition_ ;
    /**
     * <code>int32 specific_partition = 3;</code>
     * @return Whether the specificPartition field is set.
     */
    @java.lang.Override
    public boolean hasSpecificPartition() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>int32 specific_partition = 3;</code>
     * @return The specificPartition.
     */
    @java.lang.Override
    public int getSpecificPartition() {
      return specificPartition_;
    }
    /**
     * <code>int32 specific_partition = 3;</code>
     * @param value The specificPartition to set.
     * @return This builder for chaining.
     */
    public Builder setSpecificPartition(int value) {
      bitField0_ |= 0x00000001;
      specificPartition_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 specific_partition = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpecificPartition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      specificPartition_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lh_proto.CentralStoreQueryPb)
  }

  // @@protoc_insertion_point(class_scope:lh_proto.CentralStoreQueryPb)
  private static final io.littlehorse.common.proto.CentralStoreQueryPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.common.proto.CentralStoreQueryPb();
  }

  public static io.littlehorse.common.proto.CentralStoreQueryPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CentralStoreQueryPb>
      PARSER = new com.google.protobuf.AbstractParser<CentralStoreQueryPb>() {
    @java.lang.Override
    public CentralStoreQueryPb parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CentralStoreQueryPb(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CentralStoreQueryPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CentralStoreQueryPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.common.proto.CentralStoreQueryPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

