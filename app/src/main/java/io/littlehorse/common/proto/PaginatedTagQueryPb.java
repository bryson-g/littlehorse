// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

/**
 * Protobuf type {@code lh_proto.PaginatedTagQueryPb}
 */
public final class PaginatedTagQueryPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lh_proto.PaginatedTagQueryPb)
    PaginatedTagQueryPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaginatedTagQueryPb.newBuilder() to construct.
  private PaginatedTagQueryPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaginatedTagQueryPb() {
    objectType_ = 0;
    attributes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaginatedTagQueryPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PaginatedTagQueryPb(
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
            int rawValue = input.readEnum();

            objectType_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attributes_ = new java.util.ArrayList<io.littlehorse.common.proto.AttributePb>();
              mutable_bitField0_ |= 0x00000001;
            }
            attributes_.add(
                input.readMessage(io.littlehorse.common.proto.AttributePb.parser(), extensionRegistry));
            break;
          }
          case 26: {
            io.littlehorse.common.proto.BookmarkPb.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = bookmark_.toBuilder();
            }
            bookmark_ = input.readMessage(io.littlehorse.common.proto.BookmarkPb.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bookmark_);
              bookmark_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 32: {

            limit_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        attributes_ = java.util.Collections.unmodifiableList(attributes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.common.proto.PaginatedTagQueryPb.class, io.littlehorse.common.proto.PaginatedTagQueryPb.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECT_TYPE_FIELD_NUMBER = 1;
  private int objectType_;
  /**
   * <code>.lh_proto.GETableClassEnumPb object_type = 1;</code>
   * @return The enum numeric value on the wire for objectType.
   */
  @java.lang.Override public int getObjectTypeValue() {
    return objectType_;
  }
  /**
   * <code>.lh_proto.GETableClassEnumPb object_type = 1;</code>
   * @return The objectType.
   */
  @java.lang.Override public io.littlehorse.common.proto.GETableClassEnumPb getObjectType() {
    @SuppressWarnings("deprecation")
    io.littlehorse.common.proto.GETableClassEnumPb result = io.littlehorse.common.proto.GETableClassEnumPb.valueOf(objectType_);
    return result == null ? io.littlehorse.common.proto.GETableClassEnumPb.UNRECOGNIZED : result;
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 2;
  private java.util.List<io.littlehorse.common.proto.AttributePb> attributes_;
  /**
   * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.littlehorse.common.proto.AttributePb> getAttributesList() {
    return attributes_;
  }
  /**
   * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.littlehorse.common.proto.AttributePbOrBuilder> 
      getAttributesOrBuilderList() {
    return attributes_;
  }
  /**
   * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
   */
  @java.lang.Override
  public int getAttributesCount() {
    return attributes_.size();
  }
  /**
   * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
   */
  @java.lang.Override
  public io.littlehorse.common.proto.AttributePb getAttributes(int index) {
    return attributes_.get(index);
  }
  /**
   * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
   */
  @java.lang.Override
  public io.littlehorse.common.proto.AttributePbOrBuilder getAttributesOrBuilder(
      int index) {
    return attributes_.get(index);
  }

  public static final int BOOKMARK_FIELD_NUMBER = 3;
  private io.littlehorse.common.proto.BookmarkPb bookmark_;
  /**
   * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
   * @return Whether the bookmark field is set.
   */
  @java.lang.Override
  public boolean hasBookmark() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
   * @return The bookmark.
   */
  @java.lang.Override
  public io.littlehorse.common.proto.BookmarkPb getBookmark() {
    return bookmark_ == null ? io.littlehorse.common.proto.BookmarkPb.getDefaultInstance() : bookmark_;
  }
  /**
   * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
   */
  @java.lang.Override
  public io.littlehorse.common.proto.BookmarkPbOrBuilder getBookmarkOrBuilder() {
    return bookmark_ == null ? io.littlehorse.common.proto.BookmarkPb.getDefaultInstance() : bookmark_;
  }

  public static final int LIMIT_FIELD_NUMBER = 4;
  private int limit_;
  /**
   * <code>int32 limit = 4;</code>
   * @return The limit.
   */
  @java.lang.Override
  public int getLimit() {
    return limit_;
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
    if (objectType_ != io.littlehorse.common.proto.GETableClassEnumPb.TASK_DEF.getNumber()) {
      output.writeEnum(1, objectType_);
    }
    for (int i = 0; i < attributes_.size(); i++) {
      output.writeMessage(2, attributes_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getBookmark());
    }
    if (limit_ != 0) {
      output.writeInt32(4, limit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (objectType_ != io.littlehorse.common.proto.GETableClassEnumPb.TASK_DEF.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, objectType_);
    }
    for (int i = 0; i < attributes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, attributes_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getBookmark());
    }
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, limit_);
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
    if (!(obj instanceof io.littlehorse.common.proto.PaginatedTagQueryPb)) {
      return super.equals(obj);
    }
    io.littlehorse.common.proto.PaginatedTagQueryPb other = (io.littlehorse.common.proto.PaginatedTagQueryPb) obj;

    if (objectType_ != other.objectType_) return false;
    if (!getAttributesList()
        .equals(other.getAttributesList())) return false;
    if (hasBookmark() != other.hasBookmark()) return false;
    if (hasBookmark()) {
      if (!getBookmark()
          .equals(other.getBookmark())) return false;
    }
    if (getLimit()
        != other.getLimit()) return false;
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
    hash = (37 * hash) + OBJECT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + objectType_;
    if (getAttributesCount() > 0) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributesList().hashCode();
    }
    if (hasBookmark()) {
      hash = (37 * hash) + BOOKMARK_FIELD_NUMBER;
      hash = (53 * hash) + getBookmark().hashCode();
    }
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.common.proto.PaginatedTagQueryPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.common.proto.PaginatedTagQueryPb prototype) {
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
   * Protobuf type {@code lh_proto.PaginatedTagQueryPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lh_proto.PaginatedTagQueryPb)
      io.littlehorse.common.proto.PaginatedTagQueryPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.common.proto.PaginatedTagQueryPb.class, io.littlehorse.common.proto.PaginatedTagQueryPb.Builder.class);
    }

    // Construct using io.littlehorse.common.proto.PaginatedTagQueryPb.newBuilder()
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
        getAttributesFieldBuilder();
        getBookmarkFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      objectType_ = 0;

      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        attributesBuilder_.clear();
      }
      if (bookmarkBuilder_ == null) {
        bookmark_ = null;
      } else {
        bookmarkBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      limit_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.common.proto.InternalServer.internal_static_lh_proto_PaginatedTagQueryPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.PaginatedTagQueryPb getDefaultInstanceForType() {
      return io.littlehorse.common.proto.PaginatedTagQueryPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.common.proto.PaginatedTagQueryPb build() {
      io.littlehorse.common.proto.PaginatedTagQueryPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.common.proto.PaginatedTagQueryPb buildPartial() {
      io.littlehorse.common.proto.PaginatedTagQueryPb result = new io.littlehorse.common.proto.PaginatedTagQueryPb(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.objectType_ = objectType_;
      if (attributesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          attributes_ = java.util.Collections.unmodifiableList(attributes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.attributes_ = attributes_;
      } else {
        result.attributes_ = attributesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (bookmarkBuilder_ == null) {
          result.bookmark_ = bookmark_;
        } else {
          result.bookmark_ = bookmarkBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      result.limit_ = limit_;
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
      if (other instanceof io.littlehorse.common.proto.PaginatedTagQueryPb) {
        return mergeFrom((io.littlehorse.common.proto.PaginatedTagQueryPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.common.proto.PaginatedTagQueryPb other) {
      if (other == io.littlehorse.common.proto.PaginatedTagQueryPb.getDefaultInstance()) return this;
      if (other.objectType_ != 0) {
        setObjectTypeValue(other.getObjectTypeValue());
      }
      if (attributesBuilder_ == null) {
        if (!other.attributes_.isEmpty()) {
          if (attributes_.isEmpty()) {
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAttributesIsMutable();
            attributes_.addAll(other.attributes_);
          }
          onChanged();
        }
      } else {
        if (!other.attributes_.isEmpty()) {
          if (attributesBuilder_.isEmpty()) {
            attributesBuilder_.dispose();
            attributesBuilder_ = null;
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            attributesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttributesFieldBuilder() : null;
          } else {
            attributesBuilder_.addAllMessages(other.attributes_);
          }
        }
      }
      if (other.hasBookmark()) {
        mergeBookmark(other.getBookmark());
      }
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
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
      io.littlehorse.common.proto.PaginatedTagQueryPb parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.littlehorse.common.proto.PaginatedTagQueryPb) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int objectType_ = 0;
    /**
     * <code>.lh_proto.GETableClassEnumPb object_type = 1;</code>
     * @return The enum numeric value on the wire for objectType.
     */
    @java.lang.Override public int getObjectTypeValue() {
      return objectType_;
    }
    /**
     * <code>.lh_proto.GETableClassEnumPb object_type = 1;</code>
     * @param value The enum numeric value on the wire for objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectTypeValue(int value) {
      
      objectType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.lh_proto.GETableClassEnumPb object_type = 1;</code>
     * @return The objectType.
     */
    @java.lang.Override
    public io.littlehorse.common.proto.GETableClassEnumPb getObjectType() {
      @SuppressWarnings("deprecation")
      io.littlehorse.common.proto.GETableClassEnumPb result = io.littlehorse.common.proto.GETableClassEnumPb.valueOf(objectType_);
      return result == null ? io.littlehorse.common.proto.GETableClassEnumPb.UNRECOGNIZED : result;
    }
    /**
     * <code>.lh_proto.GETableClassEnumPb object_type = 1;</code>
     * @param value The objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectType(io.littlehorse.common.proto.GETableClassEnumPb value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      objectType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.lh_proto.GETableClassEnumPb object_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectType() {
      
      objectType_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<io.littlehorse.common.proto.AttributePb> attributes_ =
      java.util.Collections.emptyList();
    private void ensureAttributesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attributes_ = new java.util.ArrayList<io.littlehorse.common.proto.AttributePb>(attributes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.littlehorse.common.proto.AttributePb, io.littlehorse.common.proto.AttributePb.Builder, io.littlehorse.common.proto.AttributePbOrBuilder> attributesBuilder_;

    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public java.util.List<io.littlehorse.common.proto.AttributePb> getAttributesList() {
      if (attributesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attributes_);
      } else {
        return attributesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public int getAttributesCount() {
      if (attributesBuilder_ == null) {
        return attributes_.size();
      } else {
        return attributesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public io.littlehorse.common.proto.AttributePb getAttributes(int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);
      } else {
        return attributesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public Builder setAttributes(
        int index, io.littlehorse.common.proto.AttributePb value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.set(index, value);
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public Builder setAttributes(
        int index, io.littlehorse.common.proto.AttributePb.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.set(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public Builder addAttributes(io.littlehorse.common.proto.AttributePb value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public Builder addAttributes(
        int index, io.littlehorse.common.proto.AttributePb value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(index, value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public Builder addAttributes(
        io.littlehorse.common.proto.AttributePb.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public Builder addAttributes(
        int index, io.littlehorse.common.proto.AttributePb.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public Builder addAllAttributes(
        java.lang.Iterable<? extends io.littlehorse.common.proto.AttributePb> values) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attributes_);
        onChanged();
      } else {
        attributesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public Builder clearAttributes() {
      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        attributesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public Builder removeAttributes(int index) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.remove(index);
        onChanged();
      } else {
        attributesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public io.littlehorse.common.proto.AttributePb.Builder getAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public io.littlehorse.common.proto.AttributePbOrBuilder getAttributesOrBuilder(
        int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);  } else {
        return attributesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public java.util.List<? extends io.littlehorse.common.proto.AttributePbOrBuilder> 
         getAttributesOrBuilderList() {
      if (attributesBuilder_ != null) {
        return attributesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attributes_);
      }
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public io.littlehorse.common.proto.AttributePb.Builder addAttributesBuilder() {
      return getAttributesFieldBuilder().addBuilder(
          io.littlehorse.common.proto.AttributePb.getDefaultInstance());
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public io.littlehorse.common.proto.AttributePb.Builder addAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().addBuilder(
          index, io.littlehorse.common.proto.AttributePb.getDefaultInstance());
    }
    /**
     * <code>repeated .lh_proto.AttributePb attributes = 2;</code>
     */
    public java.util.List<io.littlehorse.common.proto.AttributePb.Builder> 
         getAttributesBuilderList() {
      return getAttributesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.littlehorse.common.proto.AttributePb, io.littlehorse.common.proto.AttributePb.Builder, io.littlehorse.common.proto.AttributePbOrBuilder> 
        getAttributesFieldBuilder() {
      if (attributesBuilder_ == null) {
        attributesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.littlehorse.common.proto.AttributePb, io.littlehorse.common.proto.AttributePb.Builder, io.littlehorse.common.proto.AttributePbOrBuilder>(
                attributes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        attributes_ = null;
      }
      return attributesBuilder_;
    }

    private io.littlehorse.common.proto.BookmarkPb bookmark_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.common.proto.BookmarkPb, io.littlehorse.common.proto.BookmarkPb.Builder, io.littlehorse.common.proto.BookmarkPbOrBuilder> bookmarkBuilder_;
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     * @return Whether the bookmark field is set.
     */
    public boolean hasBookmark() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     * @return The bookmark.
     */
    public io.littlehorse.common.proto.BookmarkPb getBookmark() {
      if (bookmarkBuilder_ == null) {
        return bookmark_ == null ? io.littlehorse.common.proto.BookmarkPb.getDefaultInstance() : bookmark_;
      } else {
        return bookmarkBuilder_.getMessage();
      }
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public Builder setBookmark(io.littlehorse.common.proto.BookmarkPb value) {
      if (bookmarkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bookmark_ = value;
        onChanged();
      } else {
        bookmarkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public Builder setBookmark(
        io.littlehorse.common.proto.BookmarkPb.Builder builderForValue) {
      if (bookmarkBuilder_ == null) {
        bookmark_ = builderForValue.build();
        onChanged();
      } else {
        bookmarkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public Builder mergeBookmark(io.littlehorse.common.proto.BookmarkPb value) {
      if (bookmarkBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            bookmark_ != null &&
            bookmark_ != io.littlehorse.common.proto.BookmarkPb.getDefaultInstance()) {
          bookmark_ =
            io.littlehorse.common.proto.BookmarkPb.newBuilder(bookmark_).mergeFrom(value).buildPartial();
        } else {
          bookmark_ = value;
        }
        onChanged();
      } else {
        bookmarkBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public Builder clearBookmark() {
      if (bookmarkBuilder_ == null) {
        bookmark_ = null;
        onChanged();
      } else {
        bookmarkBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public io.littlehorse.common.proto.BookmarkPb.Builder getBookmarkBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBookmarkFieldBuilder().getBuilder();
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    public io.littlehorse.common.proto.BookmarkPbOrBuilder getBookmarkOrBuilder() {
      if (bookmarkBuilder_ != null) {
        return bookmarkBuilder_.getMessageOrBuilder();
      } else {
        return bookmark_ == null ?
            io.littlehorse.common.proto.BookmarkPb.getDefaultInstance() : bookmark_;
      }
    }
    /**
     * <code>.lh_proto.BookmarkPb bookmark = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.common.proto.BookmarkPb, io.littlehorse.common.proto.BookmarkPb.Builder, io.littlehorse.common.proto.BookmarkPbOrBuilder> 
        getBookmarkFieldBuilder() {
      if (bookmarkBuilder_ == null) {
        bookmarkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.common.proto.BookmarkPb, io.littlehorse.common.proto.BookmarkPb.Builder, io.littlehorse.common.proto.BookmarkPbOrBuilder>(
                getBookmark(),
                getParentForChildren(),
                isClean());
        bookmark_ = null;
      }
      return bookmarkBuilder_;
    }

    private int limit_ ;
    /**
     * <code>int32 limit = 4;</code>
     * @return The limit.
     */
    @java.lang.Override
    public int getLimit() {
      return limit_;
    }
    /**
     * <code>int32 limit = 4;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 limit = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      
      limit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lh_proto.PaginatedTagQueryPb)
  }

  // @@protoc_insertion_point(class_scope:lh_proto.PaginatedTagQueryPb)
  private static final io.littlehorse.common.proto.PaginatedTagQueryPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.common.proto.PaginatedTagQueryPb();
  }

  public static io.littlehorse.common.proto.PaginatedTagQueryPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaginatedTagQueryPb>
      PARSER = new com.google.protobuf.AbstractParser<PaginatedTagQueryPb>() {
    @java.lang.Override
    public PaginatedTagQueryPb parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PaginatedTagQueryPb(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PaginatedTagQueryPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaginatedTagQueryPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.common.proto.PaginatedTagQueryPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
