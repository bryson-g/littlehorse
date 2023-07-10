// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.TaskDefMetricsIdPb}
 */
public final class TaskDefMetricsIdPb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.TaskDefMetricsIdPb)
    TaskDefMetricsIdPbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskDefMetricsIdPb.newBuilder() to construct.
  private TaskDefMetricsIdPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskDefMetricsIdPb() {
    windowType_ = 0;
    taskDefName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskDefMetricsIdPb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefMetricsIdPb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefMetricsIdPb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb.class, io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb.Builder.class);
  }

  public static final int WINDOW_START_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp windowStart_;
  /**
   * <code>.google.protobuf.Timestamp window_start = 1;</code>
   * @return Whether the windowStart field is set.
   */
  @java.lang.Override
  public boolean hasWindowStart() {
    return windowStart_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp window_start = 1;</code>
   * @return The windowStart.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getWindowStart() {
    return windowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
  }
  /**
   * <code>.google.protobuf.Timestamp window_start = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getWindowStartOrBuilder() {
    return windowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
  }

  public static final int WINDOW_TYPE_FIELD_NUMBER = 2;
  private int windowType_ = 0;
  /**
   * <code>.littlehorse.MetricsWindowLengthPb window_type = 2;</code>
   * @return The enum numeric value on the wire for windowType.
   */
  @java.lang.Override public int getWindowTypeValue() {
    return windowType_;
  }
  /**
   * <code>.littlehorse.MetricsWindowLengthPb window_type = 2;</code>
   * @return The windowType.
   */
  @java.lang.Override public io.littlehorse.sdk.common.proto.MetricsWindowLengthPb getWindowType() {
    io.littlehorse.sdk.common.proto.MetricsWindowLengthPb result = io.littlehorse.sdk.common.proto.MetricsWindowLengthPb.forNumber(windowType_);
    return result == null ? io.littlehorse.sdk.common.proto.MetricsWindowLengthPb.UNRECOGNIZED : result;
  }

  public static final int TASK_DEF_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object taskDefName_ = "";
  /**
   * <code>string task_def_name = 3;</code>
   * @return The taskDefName.
   */
  @java.lang.Override
  public java.lang.String getTaskDefName() {
    java.lang.Object ref = taskDefName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskDefName_ = s;
      return s;
    }
  }
  /**
   * <code>string task_def_name = 3;</code>
   * @return The bytes for taskDefName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskDefNameBytes() {
    java.lang.Object ref = taskDefName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskDefName_ = b;
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
    if (windowStart_ != null) {
      output.writeMessage(1, getWindowStart());
    }
    if (windowType_ != io.littlehorse.sdk.common.proto.MetricsWindowLengthPb.MINUTES_5.getNumber()) {
      output.writeEnum(2, windowType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskDefName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, taskDefName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (windowStart_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWindowStart());
    }
    if (windowType_ != io.littlehorse.sdk.common.proto.MetricsWindowLengthPb.MINUTES_5.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, windowType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskDefName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, taskDefName_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb other = (io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb) obj;

    if (hasWindowStart() != other.hasWindowStart()) return false;
    if (hasWindowStart()) {
      if (!getWindowStart()
          .equals(other.getWindowStart())) return false;
    }
    if (windowType_ != other.windowType_) return false;
    if (!getTaskDefName()
        .equals(other.getTaskDefName())) return false;
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
    if (hasWindowStart()) {
      hash = (37 * hash) + WINDOW_START_FIELD_NUMBER;
      hash = (53 * hash) + getWindowStart().hashCode();
    }
    hash = (37 * hash) + WINDOW_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + windowType_;
    hash = (37 * hash) + TASK_DEF_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTaskDefName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb prototype) {
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
   * Protobuf type {@code littlehorse.TaskDefMetricsIdPb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.TaskDefMetricsIdPb)
      io.littlehorse.sdk.common.proto.TaskDefMetricsIdPbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefMetricsIdPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefMetricsIdPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb.class, io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb.newBuilder()
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
      windowStart_ = null;
      if (windowStartBuilder_ != null) {
        windowStartBuilder_.dispose();
        windowStartBuilder_ = null;
      }
      windowType_ = 0;
      taskDefName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_TaskDefMetricsIdPb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb build() {
      io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb buildPartial() {
      io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb result = new io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.windowStart_ = windowStartBuilder_ == null
            ? windowStart_
            : windowStartBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.windowType_ = windowType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.taskDefName_ = taskDefName_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb) {
        return mergeFrom((io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb other) {
      if (other == io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb.getDefaultInstance()) return this;
      if (other.hasWindowStart()) {
        mergeWindowStart(other.getWindowStart());
      }
      if (other.windowType_ != 0) {
        setWindowTypeValue(other.getWindowTypeValue());
      }
      if (!other.getTaskDefName().isEmpty()) {
        taskDefName_ = other.taskDefName_;
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
                  getWindowStartFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              windowType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              taskDefName_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.Timestamp windowStart_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> windowStartBuilder_;
    /**
     * <code>.google.protobuf.Timestamp window_start = 1;</code>
     * @return Whether the windowStart field is set.
     */
    public boolean hasWindowStart() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 1;</code>
     * @return The windowStart.
     */
    public com.google.protobuf.Timestamp getWindowStart() {
      if (windowStartBuilder_ == null) {
        return windowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
      } else {
        return windowStartBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 1;</code>
     */
    public Builder setWindowStart(com.google.protobuf.Timestamp value) {
      if (windowStartBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        windowStart_ = value;
      } else {
        windowStartBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 1;</code>
     */
    public Builder setWindowStart(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (windowStartBuilder_ == null) {
        windowStart_ = builderForValue.build();
      } else {
        windowStartBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 1;</code>
     */
    public Builder mergeWindowStart(com.google.protobuf.Timestamp value) {
      if (windowStartBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          windowStart_ != null &&
          windowStart_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getWindowStartBuilder().mergeFrom(value);
        } else {
          windowStart_ = value;
        }
      } else {
        windowStartBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 1;</code>
     */
    public Builder clearWindowStart() {
      bitField0_ = (bitField0_ & ~0x00000001);
      windowStart_ = null;
      if (windowStartBuilder_ != null) {
        windowStartBuilder_.dispose();
        windowStartBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getWindowStartBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWindowStartFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getWindowStartOrBuilder() {
      if (windowStartBuilder_ != null) {
        return windowStartBuilder_.getMessageOrBuilder();
      } else {
        return windowStart_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getWindowStartFieldBuilder() {
      if (windowStartBuilder_ == null) {
        windowStartBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getWindowStart(),
                getParentForChildren(),
                isClean());
        windowStart_ = null;
      }
      return windowStartBuilder_;
    }

    private int windowType_ = 0;
    /**
     * <code>.littlehorse.MetricsWindowLengthPb window_type = 2;</code>
     * @return The enum numeric value on the wire for windowType.
     */
    @java.lang.Override public int getWindowTypeValue() {
      return windowType_;
    }
    /**
     * <code>.littlehorse.MetricsWindowLengthPb window_type = 2;</code>
     * @param value The enum numeric value on the wire for windowType to set.
     * @return This builder for chaining.
     */
    public Builder setWindowTypeValue(int value) {
      windowType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.MetricsWindowLengthPb window_type = 2;</code>
     * @return The windowType.
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.MetricsWindowLengthPb getWindowType() {
      io.littlehorse.sdk.common.proto.MetricsWindowLengthPb result = io.littlehorse.sdk.common.proto.MetricsWindowLengthPb.forNumber(windowType_);
      return result == null ? io.littlehorse.sdk.common.proto.MetricsWindowLengthPb.UNRECOGNIZED : result;
    }
    /**
     * <code>.littlehorse.MetricsWindowLengthPb window_type = 2;</code>
     * @param value The windowType to set.
     * @return This builder for chaining.
     */
    public Builder setWindowType(io.littlehorse.sdk.common.proto.MetricsWindowLengthPb value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      windowType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.MetricsWindowLengthPb window_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWindowType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      windowType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object taskDefName_ = "";
    /**
     * <code>string task_def_name = 3;</code>
     * @return The taskDefName.
     */
    public java.lang.String getTaskDefName() {
      java.lang.Object ref = taskDefName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskDefName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string task_def_name = 3;</code>
     * @return The bytes for taskDefName.
     */
    public com.google.protobuf.ByteString
        getTaskDefNameBytes() {
      java.lang.Object ref = taskDefName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskDefName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string task_def_name = 3;</code>
     * @param value The taskDefName to set.
     * @return This builder for chaining.
     */
    public Builder setTaskDefName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      taskDefName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string task_def_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskDefName() {
      taskDefName_ = getDefaultInstance().getTaskDefName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string task_def_name = 3;</code>
     * @param value The bytes for taskDefName to set.
     * @return This builder for chaining.
     */
    public Builder setTaskDefNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      taskDefName_ = value;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.TaskDefMetricsIdPb)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.TaskDefMetricsIdPb)
  private static final io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb();
  }

  public static io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskDefMetricsIdPb>
      PARSER = new com.google.protobuf.AbstractParser<TaskDefMetricsIdPb>() {
    @java.lang.Override
    public TaskDefMetricsIdPb parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskDefMetricsIdPb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskDefMetricsIdPb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskDefMetricsIdPb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

