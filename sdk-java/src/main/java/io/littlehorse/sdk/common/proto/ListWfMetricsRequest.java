// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.ListWfMetricsRequest}
 */
public final class ListWfMetricsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.ListWfMetricsRequest)
    ListWfMetricsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListWfMetricsRequest.newBuilder() to construct.
  private ListWfMetricsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListWfMetricsRequest() {
    windowLength_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListWfMetricsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ListWfMetricsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ListWfMetricsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.ListWfMetricsRequest.class, io.littlehorse.sdk.common.proto.ListWfMetricsRequest.Builder.class);
  }

  public static final int WF_SPEC_ID_FIELD_NUMBER = 1;
  private io.littlehorse.sdk.common.proto.WfSpecId wfSpecId_;
  /**
   * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
   * @return Whether the wfSpecId field is set.
   */
  @java.lang.Override
  public boolean hasWfSpecId() {
    return wfSpecId_ != null;
  }
  /**
   * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
   * @return The wfSpecId.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.WfSpecId getWfSpecId() {
    return wfSpecId_ == null ? io.littlehorse.sdk.common.proto.WfSpecId.getDefaultInstance() : wfSpecId_;
  }
  /**
   * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.WfSpecIdOrBuilder getWfSpecIdOrBuilder() {
    return wfSpecId_ == null ? io.littlehorse.sdk.common.proto.WfSpecId.getDefaultInstance() : wfSpecId_;
  }

  public static final int LAST_WINDOW_START_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp lastWindowStart_;
  /**
   * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
   * @return Whether the lastWindowStart field is set.
   */
  @java.lang.Override
  public boolean hasLastWindowStart() {
    return lastWindowStart_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
   * @return The lastWindowStart.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastWindowStart() {
    return lastWindowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastWindowStart_;
  }
  /**
   * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastWindowStartOrBuilder() {
    return lastWindowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastWindowStart_;
  }

  public static final int WINDOW_LENGTH_FIELD_NUMBER = 3;
  private int windowLength_ = 0;
  /**
   * <code>.littlehorse.MetricsWindowLength window_length = 3;</code>
   * @return The enum numeric value on the wire for windowLength.
   */
  @java.lang.Override public int getWindowLengthValue() {
    return windowLength_;
  }
  /**
   * <code>.littlehorse.MetricsWindowLength window_length = 3;</code>
   * @return The windowLength.
   */
  @java.lang.Override public io.littlehorse.sdk.common.proto.MetricsWindowLength getWindowLength() {
    io.littlehorse.sdk.common.proto.MetricsWindowLength result = io.littlehorse.sdk.common.proto.MetricsWindowLength.forNumber(windowLength_);
    return result == null ? io.littlehorse.sdk.common.proto.MetricsWindowLength.UNRECOGNIZED : result;
  }

  public static final int NUM_WINDOWS_FIELD_NUMBER = 4;
  private int numWindows_ = 0;
  /**
   * <code>int32 num_windows = 4;</code>
   * @return The numWindows.
   */
  @java.lang.Override
  public int getNumWindows() {
    return numWindows_;
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
    if (wfSpecId_ != null) {
      output.writeMessage(1, getWfSpecId());
    }
    if (lastWindowStart_ != null) {
      output.writeMessage(2, getLastWindowStart());
    }
    if (windowLength_ != io.littlehorse.sdk.common.proto.MetricsWindowLength.MINUTES_5.getNumber()) {
      output.writeEnum(3, windowLength_);
    }
    if (numWindows_ != 0) {
      output.writeInt32(4, numWindows_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (wfSpecId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWfSpecId());
    }
    if (lastWindowStart_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLastWindowStart());
    }
    if (windowLength_ != io.littlehorse.sdk.common.proto.MetricsWindowLength.MINUTES_5.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, windowLength_);
    }
    if (numWindows_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, numWindows_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.ListWfMetricsRequest)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.ListWfMetricsRequest other = (io.littlehorse.sdk.common.proto.ListWfMetricsRequest) obj;

    if (hasWfSpecId() != other.hasWfSpecId()) return false;
    if (hasWfSpecId()) {
      if (!getWfSpecId()
          .equals(other.getWfSpecId())) return false;
    }
    if (hasLastWindowStart() != other.hasLastWindowStart()) return false;
    if (hasLastWindowStart()) {
      if (!getLastWindowStart()
          .equals(other.getLastWindowStart())) return false;
    }
    if (windowLength_ != other.windowLength_) return false;
    if (getNumWindows()
        != other.getNumWindows()) return false;
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
    if (hasWfSpecId()) {
      hash = (37 * hash) + WF_SPEC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWfSpecId().hashCode();
    }
    if (hasLastWindowStart()) {
      hash = (37 * hash) + LAST_WINDOW_START_FIELD_NUMBER;
      hash = (53 * hash) + getLastWindowStart().hashCode();
    }
    hash = (37 * hash) + WINDOW_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + windowLength_;
    hash = (37 * hash) + NUM_WINDOWS_FIELD_NUMBER;
    hash = (53 * hash) + getNumWindows();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.ListWfMetricsRequest prototype) {
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
   * Protobuf type {@code littlehorse.ListWfMetricsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.ListWfMetricsRequest)
      io.littlehorse.sdk.common.proto.ListWfMetricsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ListWfMetricsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ListWfMetricsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.ListWfMetricsRequest.class, io.littlehorse.sdk.common.proto.ListWfMetricsRequest.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.ListWfMetricsRequest.newBuilder()
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
      wfSpecId_ = null;
      if (wfSpecIdBuilder_ != null) {
        wfSpecIdBuilder_.dispose();
        wfSpecIdBuilder_ = null;
      }
      lastWindowStart_ = null;
      if (lastWindowStartBuilder_ != null) {
        lastWindowStartBuilder_.dispose();
        lastWindowStartBuilder_ = null;
      }
      windowLength_ = 0;
      numWindows_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_ListWfMetricsRequest_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ListWfMetricsRequest getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.ListWfMetricsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ListWfMetricsRequest build() {
      io.littlehorse.sdk.common.proto.ListWfMetricsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.ListWfMetricsRequest buildPartial() {
      io.littlehorse.sdk.common.proto.ListWfMetricsRequest result = new io.littlehorse.sdk.common.proto.ListWfMetricsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.ListWfMetricsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wfSpecId_ = wfSpecIdBuilder_ == null
            ? wfSpecId_
            : wfSpecIdBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastWindowStart_ = lastWindowStartBuilder_ == null
            ? lastWindowStart_
            : lastWindowStartBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.windowLength_ = windowLength_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.numWindows_ = numWindows_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.ListWfMetricsRequest) {
        return mergeFrom((io.littlehorse.sdk.common.proto.ListWfMetricsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.ListWfMetricsRequest other) {
      if (other == io.littlehorse.sdk.common.proto.ListWfMetricsRequest.getDefaultInstance()) return this;
      if (other.hasWfSpecId()) {
        mergeWfSpecId(other.getWfSpecId());
      }
      if (other.hasLastWindowStart()) {
        mergeLastWindowStart(other.getLastWindowStart());
      }
      if (other.windowLength_ != 0) {
        setWindowLengthValue(other.getWindowLengthValue());
      }
      if (other.getNumWindows() != 0) {
        setNumWindows(other.getNumWindows());
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
                  getWfSpecIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getLastWindowStartFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              windowLength_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              numWindows_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private io.littlehorse.sdk.common.proto.WfSpecId wfSpecId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.WfSpecId, io.littlehorse.sdk.common.proto.WfSpecId.Builder, io.littlehorse.sdk.common.proto.WfSpecIdOrBuilder> wfSpecIdBuilder_;
    /**
     * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
     * @return Whether the wfSpecId field is set.
     */
    public boolean hasWfSpecId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
     * @return The wfSpecId.
     */
    public io.littlehorse.sdk.common.proto.WfSpecId getWfSpecId() {
      if (wfSpecIdBuilder_ == null) {
        return wfSpecId_ == null ? io.littlehorse.sdk.common.proto.WfSpecId.getDefaultInstance() : wfSpecId_;
      } else {
        return wfSpecIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
     */
    public Builder setWfSpecId(io.littlehorse.sdk.common.proto.WfSpecId value) {
      if (wfSpecIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        wfSpecId_ = value;
      } else {
        wfSpecIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
     */
    public Builder setWfSpecId(
        io.littlehorse.sdk.common.proto.WfSpecId.Builder builderForValue) {
      if (wfSpecIdBuilder_ == null) {
        wfSpecId_ = builderForValue.build();
      } else {
        wfSpecIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
     */
    public Builder mergeWfSpecId(io.littlehorse.sdk.common.proto.WfSpecId value) {
      if (wfSpecIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          wfSpecId_ != null &&
          wfSpecId_ != io.littlehorse.sdk.common.proto.WfSpecId.getDefaultInstance()) {
          getWfSpecIdBuilder().mergeFrom(value);
        } else {
          wfSpecId_ = value;
        }
      } else {
        wfSpecIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
     */
    public Builder clearWfSpecId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      wfSpecId_ = null;
      if (wfSpecIdBuilder_ != null) {
        wfSpecIdBuilder_.dispose();
        wfSpecIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.WfSpecId.Builder getWfSpecIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWfSpecIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.WfSpecIdOrBuilder getWfSpecIdOrBuilder() {
      if (wfSpecIdBuilder_ != null) {
        return wfSpecIdBuilder_.getMessageOrBuilder();
      } else {
        return wfSpecId_ == null ?
            io.littlehorse.sdk.common.proto.WfSpecId.getDefaultInstance() : wfSpecId_;
      }
    }
    /**
     * <code>.littlehorse.WfSpecId wf_spec_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.WfSpecId, io.littlehorse.sdk.common.proto.WfSpecId.Builder, io.littlehorse.sdk.common.proto.WfSpecIdOrBuilder> 
        getWfSpecIdFieldBuilder() {
      if (wfSpecIdBuilder_ == null) {
        wfSpecIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.WfSpecId, io.littlehorse.sdk.common.proto.WfSpecId.Builder, io.littlehorse.sdk.common.proto.WfSpecIdOrBuilder>(
                getWfSpecId(),
                getParentForChildren(),
                isClean());
        wfSpecId_ = null;
      }
      return wfSpecIdBuilder_;
    }

    private com.google.protobuf.Timestamp lastWindowStart_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lastWindowStartBuilder_;
    /**
     * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
     * @return Whether the lastWindowStart field is set.
     */
    public boolean hasLastWindowStart() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
     * @return The lastWindowStart.
     */
    public com.google.protobuf.Timestamp getLastWindowStart() {
      if (lastWindowStartBuilder_ == null) {
        return lastWindowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastWindowStart_;
      } else {
        return lastWindowStartBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
     */
    public Builder setLastWindowStart(com.google.protobuf.Timestamp value) {
      if (lastWindowStartBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastWindowStart_ = value;
      } else {
        lastWindowStartBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
     */
    public Builder setLastWindowStart(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastWindowStartBuilder_ == null) {
        lastWindowStart_ = builderForValue.build();
      } else {
        lastWindowStartBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
     */
    public Builder mergeLastWindowStart(com.google.protobuf.Timestamp value) {
      if (lastWindowStartBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          lastWindowStart_ != null &&
          lastWindowStart_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLastWindowStartBuilder().mergeFrom(value);
        } else {
          lastWindowStart_ = value;
        }
      } else {
        lastWindowStartBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
     */
    public Builder clearLastWindowStart() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lastWindowStart_ = null;
      if (lastWindowStartBuilder_ != null) {
        lastWindowStartBuilder_.dispose();
        lastWindowStartBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastWindowStartBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLastWindowStartFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastWindowStartOrBuilder() {
      if (lastWindowStartBuilder_ != null) {
        return lastWindowStartBuilder_.getMessageOrBuilder();
      } else {
        return lastWindowStart_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lastWindowStart_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp last_window_start = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLastWindowStartFieldBuilder() {
      if (lastWindowStartBuilder_ == null) {
        lastWindowStartBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLastWindowStart(),
                getParentForChildren(),
                isClean());
        lastWindowStart_ = null;
      }
      return lastWindowStartBuilder_;
    }

    private int windowLength_ = 0;
    /**
     * <code>.littlehorse.MetricsWindowLength window_length = 3;</code>
     * @return The enum numeric value on the wire for windowLength.
     */
    @java.lang.Override public int getWindowLengthValue() {
      return windowLength_;
    }
    /**
     * <code>.littlehorse.MetricsWindowLength window_length = 3;</code>
     * @param value The enum numeric value on the wire for windowLength to set.
     * @return This builder for chaining.
     */
    public Builder setWindowLengthValue(int value) {
      windowLength_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.MetricsWindowLength window_length = 3;</code>
     * @return The windowLength.
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.MetricsWindowLength getWindowLength() {
      io.littlehorse.sdk.common.proto.MetricsWindowLength result = io.littlehorse.sdk.common.proto.MetricsWindowLength.forNumber(windowLength_);
      return result == null ? io.littlehorse.sdk.common.proto.MetricsWindowLength.UNRECOGNIZED : result;
    }
    /**
     * <code>.littlehorse.MetricsWindowLength window_length = 3;</code>
     * @param value The windowLength to set.
     * @return This builder for chaining.
     */
    public Builder setWindowLength(io.littlehorse.sdk.common.proto.MetricsWindowLength value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      windowLength_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.MetricsWindowLength window_length = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWindowLength() {
      bitField0_ = (bitField0_ & ~0x00000004);
      windowLength_ = 0;
      onChanged();
      return this;
    }

    private int numWindows_ ;
    /**
     * <code>int32 num_windows = 4;</code>
     * @return The numWindows.
     */
    @java.lang.Override
    public int getNumWindows() {
      return numWindows_;
    }
    /**
     * <code>int32 num_windows = 4;</code>
     * @param value The numWindows to set.
     * @return This builder for chaining.
     */
    public Builder setNumWindows(int value) {

      numWindows_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_windows = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumWindows() {
      bitField0_ = (bitField0_ & ~0x00000008);
      numWindows_ = 0;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.ListWfMetricsRequest)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.ListWfMetricsRequest)
  private static final io.littlehorse.sdk.common.proto.ListWfMetricsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.ListWfMetricsRequest();
  }

  public static io.littlehorse.sdk.common.proto.ListWfMetricsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWfMetricsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListWfMetricsRequest>() {
    @java.lang.Override
    public ListWfMetricsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListWfMetricsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWfMetricsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.ListWfMetricsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

