// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.ServerVersionResponse}
 */
public final class ServerVersionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.ServerVersionResponse)
    ServerVersionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerVersionResponse.newBuilder() to construct.
  private ServerVersionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerVersionResponse() {
    preReleaseIdentifier_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServerVersionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ServerVersionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ServerVersionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.ServerVersionResponse.class, io.littlehorse.sdk.common.proto.ServerVersionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MAJOR_VERSION_FIELD_NUMBER = 1;
  private int majorVersion_ = 0;
  /**
   * <code>int32 major_version = 1;</code>
   * @return The majorVersion.
   */
  @java.lang.Override
  public int getMajorVersion() {
    return majorVersion_;
  }

  public static final int MINOR_VERSION_FIELD_NUMBER = 2;
  private int minorVersion_ = 0;
  /**
   * <code>int32 minor_version = 2;</code>
   * @return The minorVersion.
   */
  @java.lang.Override
  public int getMinorVersion() {
    return minorVersion_;
  }

  public static final int PATCH_VERSION_FIELD_NUMBER = 3;
  private int patchVersion_ = 0;
  /**
   * <code>int32 patch_version = 3;</code>
   * @return The patchVersion.
   */
  @java.lang.Override
  public int getPatchVersion() {
    return patchVersion_;
  }

  public static final int PRE_RELEASE_IDENTIFIER_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object preReleaseIdentifier_ = "";
  /**
   * <code>optional string pre_release_identifier = 4;</code>
   * @return Whether the preReleaseIdentifier field is set.
   */
  @java.lang.Override
  public boolean hasPreReleaseIdentifier() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string pre_release_identifier = 4;</code>
   * @return The preReleaseIdentifier.
   */
  @java.lang.Override
  public java.lang.String getPreReleaseIdentifier() {
    java.lang.Object ref = preReleaseIdentifier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      preReleaseIdentifier_ = s;
      return s;
    }
  }
  /**
   * <code>optional string pre_release_identifier = 4;</code>
   * @return The bytes for preReleaseIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPreReleaseIdentifierBytes() {
    java.lang.Object ref = preReleaseIdentifier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      preReleaseIdentifier_ = b;
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
    if (majorVersion_ != 0) {
      output.writeInt32(1, majorVersion_);
    }
    if (minorVersion_ != 0) {
      output.writeInt32(2, minorVersion_);
    }
    if (patchVersion_ != 0) {
      output.writeInt32(3, patchVersion_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, preReleaseIdentifier_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (majorVersion_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, majorVersion_);
    }
    if (minorVersion_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, minorVersion_);
    }
    if (patchVersion_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, patchVersion_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, preReleaseIdentifier_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.ServerVersionResponse)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.ServerVersionResponse other = (io.littlehorse.sdk.common.proto.ServerVersionResponse) obj;

    if (getMajorVersion()
        != other.getMajorVersion()) return false;
    if (getMinorVersion()
        != other.getMinorVersion()) return false;
    if (getPatchVersion()
        != other.getPatchVersion()) return false;
    if (hasPreReleaseIdentifier() != other.hasPreReleaseIdentifier()) return false;
    if (hasPreReleaseIdentifier()) {
      if (!getPreReleaseIdentifier()
          .equals(other.getPreReleaseIdentifier())) return false;
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
    hash = (37 * hash) + MAJOR_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getMajorVersion();
    hash = (37 * hash) + MINOR_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getMinorVersion();
    hash = (37 * hash) + PATCH_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getPatchVersion();
    if (hasPreReleaseIdentifier()) {
      hash = (37 * hash) + PRE_RELEASE_IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getPreReleaseIdentifier().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.ServerVersionResponse parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.ServerVersionResponse prototype) {
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
   * Protobuf type {@code littlehorse.ServerVersionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.ServerVersionResponse)
      io.littlehorse.sdk.common.proto.ServerVersionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ServerVersionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ServerVersionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.ServerVersionResponse.class, io.littlehorse.sdk.common.proto.ServerVersionResponse.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.ServerVersionResponse.newBuilder()
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
      majorVersion_ = 0;
      minorVersion_ = 0;
      patchVersion_ = 0;
      preReleaseIdentifier_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ServerVersionResponse_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ServerVersionResponse getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.ServerVersionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ServerVersionResponse build() {
      io.littlehorse.sdk.common.proto.ServerVersionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ServerVersionResponse buildPartial() {
      io.littlehorse.sdk.common.proto.ServerVersionResponse result = new io.littlehorse.sdk.common.proto.ServerVersionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.ServerVersionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.majorVersion_ = majorVersion_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minorVersion_ = minorVersion_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.patchVersion_ = patchVersion_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.preReleaseIdentifier_ = preReleaseIdentifier_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.ServerVersionResponse) {
        return mergeFrom((io.littlehorse.sdk.common.proto.ServerVersionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.ServerVersionResponse other) {
      if (other == io.littlehorse.sdk.common.proto.ServerVersionResponse.getDefaultInstance()) return this;
      if (other.getMajorVersion() != 0) {
        setMajorVersion(other.getMajorVersion());
      }
      if (other.getMinorVersion() != 0) {
        setMinorVersion(other.getMinorVersion());
      }
      if (other.getPatchVersion() != 0) {
        setPatchVersion(other.getPatchVersion());
      }
      if (other.hasPreReleaseIdentifier()) {
        preReleaseIdentifier_ = other.preReleaseIdentifier_;
        bitField0_ |= 0x00000008;
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
            case 8: {
              majorVersion_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              minorVersion_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              patchVersion_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              preReleaseIdentifier_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int majorVersion_ ;
    /**
     * <code>int32 major_version = 1;</code>
     * @return The majorVersion.
     */
    @java.lang.Override
    public int getMajorVersion() {
      return majorVersion_;
    }
    /**
     * <code>int32 major_version = 1;</code>
     * @param value The majorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setMajorVersion(int value) {

      majorVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 major_version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMajorVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      majorVersion_ = 0;
      onChanged();
      return this;
    }

    private int minorVersion_ ;
    /**
     * <code>int32 minor_version = 2;</code>
     * @return The minorVersion.
     */
    @java.lang.Override
    public int getMinorVersion() {
      return minorVersion_;
    }
    /**
     * <code>int32 minor_version = 2;</code>
     * @param value The minorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setMinorVersion(int value) {

      minorVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 minor_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinorVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minorVersion_ = 0;
      onChanged();
      return this;
    }

    private int patchVersion_ ;
    /**
     * <code>int32 patch_version = 3;</code>
     * @return The patchVersion.
     */
    @java.lang.Override
    public int getPatchVersion() {
      return patchVersion_;
    }
    /**
     * <code>int32 patch_version = 3;</code>
     * @param value The patchVersion to set.
     * @return This builder for chaining.
     */
    public Builder setPatchVersion(int value) {

      patchVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 patch_version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPatchVersion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      patchVersion_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object preReleaseIdentifier_ = "";
    /**
     * <code>optional string pre_release_identifier = 4;</code>
     * @return Whether the preReleaseIdentifier field is set.
     */
    public boolean hasPreReleaseIdentifier() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string pre_release_identifier = 4;</code>
     * @return The preReleaseIdentifier.
     */
    public java.lang.String getPreReleaseIdentifier() {
      java.lang.Object ref = preReleaseIdentifier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        preReleaseIdentifier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string pre_release_identifier = 4;</code>
     * @return The bytes for preReleaseIdentifier.
     */
    public com.google.protobuf.ByteString
        getPreReleaseIdentifierBytes() {
      java.lang.Object ref = preReleaseIdentifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        preReleaseIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string pre_release_identifier = 4;</code>
     * @param value The preReleaseIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setPreReleaseIdentifier(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      preReleaseIdentifier_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional string pre_release_identifier = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPreReleaseIdentifier() {
      preReleaseIdentifier_ = getDefaultInstance().getPreReleaseIdentifier();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>optional string pre_release_identifier = 4;</code>
     * @param value The bytes for preReleaseIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setPreReleaseIdentifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      preReleaseIdentifier_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.ServerVersionResponse)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.ServerVersionResponse)
  private static final io.littlehorse.sdk.common.proto.ServerVersionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.ServerVersionResponse();
  }

  public static io.littlehorse.sdk.common.proto.ServerVersionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerVersionResponse>
      PARSER = new com.google.protobuf.AbstractParser<ServerVersionResponse>() {
    @java.lang.Override
    public ServerVersionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServerVersionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerVersionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.ServerVersionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

