// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.StartThreadNode}
 */
public final class StartThreadNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.StartThreadNode)
    StartThreadNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartThreadNode.newBuilder() to construct.
  private StartThreadNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartThreadNode() {
    threadSpecName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StartThreadNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_StartThreadNode_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetVariables();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_StartThreadNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.StartThreadNode.class, io.littlehorse.sdk.common.proto.StartThreadNode.Builder.class);
  }

  public static final int THREAD_SPEC_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object threadSpecName_ = "";
  /**
   * <code>string thread_spec_name = 1;</code>
   * @return The threadSpecName.
   */
  @java.lang.Override
  public java.lang.String getThreadSpecName() {
    java.lang.Object ref = threadSpecName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      threadSpecName_ = s;
      return s;
    }
  }
  /**
   * <code>string thread_spec_name = 1;</code>
   * @return The bytes for threadSpecName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getThreadSpecNameBytes() {
    java.lang.Object ref = threadSpecName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      threadSpecName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VARIABLES_FIELD_NUMBER = 2;
  private static final class VariablesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment>newDefaultInstance(
                io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_StartThreadNode_VariablesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.littlehorse.sdk.common.proto.VariableAssignment.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> variables_;
  private com.google.protobuf.MapField<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment>
  internalGetVariables() {
    if (variables_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          VariablesDefaultEntryHolder.defaultEntry);
    }
    return variables_;
  }
  public int getVariablesCount() {
    return internalGetVariables().getMap().size();
  }
  /**
   * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
   */
  @java.lang.Override
  public boolean containsVariables(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetVariables().getMap().containsKey(key);
  }
  /**
   * Use {@link #getVariablesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> getVariables() {
    return getVariablesMap();
  }
  /**
   * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> getVariablesMap() {
    return internalGetVariables().getMap();
  }
  /**
   * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
   */
  @java.lang.Override
  public /* nullable */
io.littlehorse.sdk.common.proto.VariableAssignment getVariablesOrDefault(
      java.lang.String key,
      /* nullable */
io.littlehorse.sdk.common.proto.VariableAssignment defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> map =
        internalGetVariables().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.VariableAssignment getVariablesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> map =
        internalGetVariables().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(threadSpecName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, threadSpecName_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetVariables(),
        VariablesDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(threadSpecName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, threadSpecName_);
    }
    for (java.util.Map.Entry<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> entry
         : internalGetVariables().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment>
      variables__ = VariablesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, variables__);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.StartThreadNode)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.StartThreadNode other = (io.littlehorse.sdk.common.proto.StartThreadNode) obj;

    if (!getThreadSpecName()
        .equals(other.getThreadSpecName())) return false;
    if (!internalGetVariables().equals(
        other.internalGetVariables())) return false;
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
    hash = (37 * hash) + THREAD_SPEC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getThreadSpecName().hashCode();
    if (!internalGetVariables().getMap().isEmpty()) {
      hash = (37 * hash) + VARIABLES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetVariables().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.StartThreadNode parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.StartThreadNode prototype) {
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
   * Protobuf type {@code littlehorse.StartThreadNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.StartThreadNode)
      io.littlehorse.sdk.common.proto.StartThreadNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_StartThreadNode_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetVariables();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableVariables();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_StartThreadNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.StartThreadNode.class, io.littlehorse.sdk.common.proto.StartThreadNode.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.StartThreadNode.newBuilder()
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
      threadSpecName_ = "";
      internalGetMutableVariables().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.WfSpecOuterClass.internal_static_littlehorse_StartThreadNode_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.StartThreadNode getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.StartThreadNode.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.StartThreadNode build() {
      io.littlehorse.sdk.common.proto.StartThreadNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.StartThreadNode buildPartial() {
      io.littlehorse.sdk.common.proto.StartThreadNode result = new io.littlehorse.sdk.common.proto.StartThreadNode(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.StartThreadNode result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.threadSpecName_ = threadSpecName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.variables_ = internalGetVariables();
        result.variables_.makeImmutable();
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
      if (other instanceof io.littlehorse.sdk.common.proto.StartThreadNode) {
        return mergeFrom((io.littlehorse.sdk.common.proto.StartThreadNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.StartThreadNode other) {
      if (other == io.littlehorse.sdk.common.proto.StartThreadNode.getDefaultInstance()) return this;
      if (!other.getThreadSpecName().isEmpty()) {
        threadSpecName_ = other.threadSpecName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableVariables().mergeFrom(
          other.internalGetVariables());
      bitField0_ |= 0x00000002;
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
              threadSpecName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment>
              variables__ = input.readMessage(
                  VariablesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableVariables().getMutableMap().put(
                  variables__.getKey(), variables__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object threadSpecName_ = "";
    /**
     * <code>string thread_spec_name = 1;</code>
     * @return The threadSpecName.
     */
    public java.lang.String getThreadSpecName() {
      java.lang.Object ref = threadSpecName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        threadSpecName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string thread_spec_name = 1;</code>
     * @return The bytes for threadSpecName.
     */
    public com.google.protobuf.ByteString
        getThreadSpecNameBytes() {
      java.lang.Object ref = threadSpecName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        threadSpecName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string thread_spec_name = 1;</code>
     * @param value The threadSpecName to set.
     * @return This builder for chaining.
     */
    public Builder setThreadSpecName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      threadSpecName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string thread_spec_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearThreadSpecName() {
      threadSpecName_ = getDefaultInstance().getThreadSpecName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string thread_spec_name = 1;</code>
     * @param value The bytes for threadSpecName to set.
     * @return This builder for chaining.
     */
    public Builder setThreadSpecNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      threadSpecName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> variables_;
    private com.google.protobuf.MapField<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment>
        internalGetVariables() {
      if (variables_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            VariablesDefaultEntryHolder.defaultEntry);
      }
      return variables_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment>
        internalGetMutableVariables() {
      if (variables_ == null) {
        variables_ = com.google.protobuf.MapField.newMapField(
            VariablesDefaultEntryHolder.defaultEntry);
      }
      if (!variables_.isMutable()) {
        variables_ = variables_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return variables_;
    }
    public int getVariablesCount() {
      return internalGetVariables().getMap().size();
    }
    /**
     * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
     */
    @java.lang.Override
    public boolean containsVariables(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetVariables().getMap().containsKey(key);
    }
    /**
     * Use {@link #getVariablesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> getVariables() {
      return getVariablesMap();
    }
    /**
     * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> getVariablesMap() {
      return internalGetVariables().getMap();
    }
    /**
     * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
io.littlehorse.sdk.common.proto.VariableAssignment getVariablesOrDefault(
        java.lang.String key,
        /* nullable */
io.littlehorse.sdk.common.proto.VariableAssignment defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> map =
          internalGetVariables().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.VariableAssignment getVariablesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> map =
          internalGetVariables().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearVariables() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableVariables().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
     */
    public Builder removeVariables(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableVariables().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment>
        getMutableVariables() {
      bitField0_ |= 0x00000002;
      return internalGetMutableVariables().getMutableMap();
    }
    /**
     * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
     */
    public Builder putVariables(
        java.lang.String key,
        io.littlehorse.sdk.common.proto.VariableAssignment value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableVariables().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;string, .littlehorse.VariableAssignment&gt; variables = 2;</code>
     */
    public Builder putAllVariables(
        java.util.Map<java.lang.String, io.littlehorse.sdk.common.proto.VariableAssignment> values) {
      internalGetMutableVariables().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.StartThreadNode)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.StartThreadNode)
  private static final io.littlehorse.sdk.common.proto.StartThreadNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.StartThreadNode();
  }

  public static io.littlehorse.sdk.common.proto.StartThreadNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartThreadNode>
      PARSER = new com.google.protobuf.AbstractParser<StartThreadNode>() {
    @java.lang.Override
    public StartThreadNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartThreadNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartThreadNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.StartThreadNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

