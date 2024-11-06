// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * A list of WorkflowEvents.
 * </pre>
 *
 * Protobuf type {@code littlehorse.WorkflowEventList}
 */
public final class WorkflowEventList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.WorkflowEventList)
    WorkflowEventListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkflowEventList.newBuilder() to construct.
  private WorkflowEventList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkflowEventList() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkflowEventList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_WorkflowEventList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_WorkflowEventList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.WorkflowEventList.class, io.littlehorse.sdk.common.proto.WorkflowEventList.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<io.littlehorse.sdk.common.proto.WorkflowEvent> results_;
  /**
   * <pre>
   * A list of WorkflowEvent objects.
   * </pre>
   *
   * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.littlehorse.sdk.common.proto.WorkflowEvent> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * A list of WorkflowEvent objects.
   * </pre>
   *
   * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.littlehorse.sdk.common.proto.WorkflowEventOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * A list of WorkflowEvent objects.
   * </pre>
   *
   * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * A list of WorkflowEvent objects.
   * </pre>
   *
   * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.WorkflowEvent getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * A list of WorkflowEvent objects.
   * </pre>
   *
   * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.WorkflowEventOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
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
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, results_.get(i));
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.WorkflowEventList)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.WorkflowEventList other = (io.littlehorse.sdk.common.proto.WorkflowEventList) obj;

    if (!getResultsList()
        .equals(other.getResultsList())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.WorkflowEventList parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.WorkflowEventList prototype) {
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
   * A list of WorkflowEvents.
   * </pre>
   *
   * Protobuf type {@code littlehorse.WorkflowEventList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.WorkflowEventList)
      io.littlehorse.sdk.common.proto.WorkflowEventListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_WorkflowEventList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_WorkflowEventList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.WorkflowEventList.class, io.littlehorse.sdk.common.proto.WorkflowEventList.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.WorkflowEventList.newBuilder()
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
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
      } else {
        results_ = null;
        resultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.Service.internal_static_littlehorse_WorkflowEventList_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.WorkflowEventList getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.WorkflowEventList.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.WorkflowEventList build() {
      io.littlehorse.sdk.common.proto.WorkflowEventList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.WorkflowEventList buildPartial() {
      io.littlehorse.sdk.common.proto.WorkflowEventList result = new io.littlehorse.sdk.common.proto.WorkflowEventList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.littlehorse.sdk.common.proto.WorkflowEventList result) {
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.WorkflowEventList result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof io.littlehorse.sdk.common.proto.WorkflowEventList) {
        return mergeFrom((io.littlehorse.sdk.common.proto.WorkflowEventList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.WorkflowEventList other) {
      if (other == io.littlehorse.sdk.common.proto.WorkflowEventList.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
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
              io.littlehorse.sdk.common.proto.WorkflowEvent m =
                  input.readMessage(
                      io.littlehorse.sdk.common.proto.WorkflowEvent.parser(),
                      extensionRegistry);
              if (resultsBuilder_ == null) {
                ensureResultsIsMutable();
                results_.add(m);
              } else {
                resultsBuilder_.addMessage(m);
              }
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

    private java.util.List<io.littlehorse.sdk.common.proto.WorkflowEvent> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<io.littlehorse.sdk.common.proto.WorkflowEvent>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.littlehorse.sdk.common.proto.WorkflowEvent, io.littlehorse.sdk.common.proto.WorkflowEvent.Builder, io.littlehorse.sdk.common.proto.WorkflowEventOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public java.util.List<io.littlehorse.sdk.common.proto.WorkflowEvent> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.WorkflowEvent getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public Builder setResults(
        int index, io.littlehorse.sdk.common.proto.WorkflowEvent value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public Builder setResults(
        int index, io.littlehorse.sdk.common.proto.WorkflowEvent.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public Builder addResults(io.littlehorse.sdk.common.proto.WorkflowEvent value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public Builder addResults(
        int index, io.littlehorse.sdk.common.proto.WorkflowEvent value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public Builder addResults(
        io.littlehorse.sdk.common.proto.WorkflowEvent.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public Builder addResults(
        int index, io.littlehorse.sdk.common.proto.WorkflowEvent.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends io.littlehorse.sdk.common.proto.WorkflowEvent> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.WorkflowEvent.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.WorkflowEventOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public java.util.List<? extends io.littlehorse.sdk.common.proto.WorkflowEventOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.WorkflowEvent.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          io.littlehorse.sdk.common.proto.WorkflowEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.WorkflowEvent.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, io.littlehorse.sdk.common.proto.WorkflowEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of WorkflowEvent objects.
     * </pre>
     *
     * <code>repeated .littlehorse.WorkflowEvent results = 1;</code>
     */
    public java.util.List<io.littlehorse.sdk.common.proto.WorkflowEvent.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.littlehorse.sdk.common.proto.WorkflowEvent, io.littlehorse.sdk.common.proto.WorkflowEvent.Builder, io.littlehorse.sdk.common.proto.WorkflowEventOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.littlehorse.sdk.common.proto.WorkflowEvent, io.littlehorse.sdk.common.proto.WorkflowEvent.Builder, io.littlehorse.sdk.common.proto.WorkflowEventOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.WorkflowEventList)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.WorkflowEventList)
  private static final io.littlehorse.sdk.common.proto.WorkflowEventList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.WorkflowEventList();
  }

  public static io.littlehorse.sdk.common.proto.WorkflowEventList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkflowEventList>
      PARSER = new com.google.protobuf.AbstractParser<WorkflowEventList>() {
    @java.lang.Override
    public WorkflowEventList parsePartialFrom(
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

  public static com.google.protobuf.Parser<WorkflowEventList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkflowEventList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.WorkflowEventList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
