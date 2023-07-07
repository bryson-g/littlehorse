// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.jlib.common.proto;

/**
 * Protobuf type {@code littlehorse.TaskResultOePb}
 */
public final class TaskResultOePb extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.TaskResultOePb)
    TaskResultOePbOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskResultOePb.newBuilder() to construct.
  private TaskResultOePb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskResultOePb() {
    resultCode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskResultOePb();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskResultOePb_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskResultOePb_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.jlib.common.proto.TaskResultOePb.class, io.littlehorse.jlib.common.proto.TaskResultOePb.Builder.class);
  }

  private int bitField0_;
  public static final int RESULT_CODE_FIELD_NUMBER = 1;
  private int resultCode_ = 0;
  /**
   * <code>.littlehorse.TaskResultCodePb result_code = 1;</code>
   * @return The enum numeric value on the wire for resultCode.
   */
  @java.lang.Override public int getResultCodeValue() {
    return resultCode_;
  }
  /**
   * <code>.littlehorse.TaskResultCodePb result_code = 1;</code>
   * @return The resultCode.
   */
  @java.lang.Override public io.littlehorse.jlib.common.proto.TaskResultCodePb getResultCode() {
    io.littlehorse.jlib.common.proto.TaskResultCodePb result = io.littlehorse.jlib.common.proto.TaskResultCodePb.forNumber(resultCode_);
    return result == null ? io.littlehorse.jlib.common.proto.TaskResultCodePb.UNRECOGNIZED : result;
  }

  public static final int THREAD_RUN_NUMBER_FIELD_NUMBER = 2;
  private int threadRunNumber_ = 0;
  /**
   * <code>int32 thread_run_number = 2;</code>
   * @return The threadRunNumber.
   */
  @java.lang.Override
  public int getThreadRunNumber() {
    return threadRunNumber_;
  }

  public static final int TASK_RUN_POSITION_FIELD_NUMBER = 3;
  private int taskRunPosition_ = 0;
  /**
   * <code>int32 task_run_position = 3;</code>
   * @return The taskRunPosition.
   */
  @java.lang.Override
  public int getTaskRunPosition() {
    return taskRunPosition_;
  }

  public static final int OUTPUT_FIELD_NUMBER = 4;
  private io.littlehorse.jlib.common.proto.VariableValuePb output_;
  /**
   * <code>optional .littlehorse.VariableValuePb output = 4;</code>
   * @return Whether the output field is set.
   */
  @java.lang.Override
  public boolean hasOutput() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .littlehorse.VariableValuePb output = 4;</code>
   * @return The output.
   */
  @java.lang.Override
  public io.littlehorse.jlib.common.proto.VariableValuePb getOutput() {
    return output_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : output_;
  }
  /**
   * <code>optional .littlehorse.VariableValuePb output = 4;</code>
   */
  @java.lang.Override
  public io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getOutputOrBuilder() {
    return output_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : output_;
  }

  public static final int LOG_OUTPUT_FIELD_NUMBER = 5;
  private io.littlehorse.jlib.common.proto.VariableValuePb logOutput_;
  /**
   * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
   * @return Whether the logOutput field is set.
   */
  @java.lang.Override
  public boolean hasLogOutput() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
   * @return The logOutput.
   */
  @java.lang.Override
  public io.littlehorse.jlib.common.proto.VariableValuePb getLogOutput() {
    return logOutput_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : logOutput_;
  }
  /**
   * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
   */
  @java.lang.Override
  public io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getLogOutputOrBuilder() {
    return logOutput_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : logOutput_;
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
    if (resultCode_ != io.littlehorse.jlib.common.proto.TaskResultCodePb.SUCCESS.getNumber()) {
      output.writeEnum(1, resultCode_);
    }
    if (threadRunNumber_ != 0) {
      output.writeInt32(2, threadRunNumber_);
    }
    if (taskRunPosition_ != 0) {
      output.writeInt32(3, taskRunPosition_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getOutput());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(5, getLogOutput());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resultCode_ != io.littlehorse.jlib.common.proto.TaskResultCodePb.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, resultCode_);
    }
    if (threadRunNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, threadRunNumber_);
    }
    if (taskRunPosition_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, taskRunPosition_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getOutput());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getLogOutput());
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
    if (!(obj instanceof io.littlehorse.jlib.common.proto.TaskResultOePb)) {
      return super.equals(obj);
    }
    io.littlehorse.jlib.common.proto.TaskResultOePb other = (io.littlehorse.jlib.common.proto.TaskResultOePb) obj;

    if (resultCode_ != other.resultCode_) return false;
    if (getThreadRunNumber()
        != other.getThreadRunNumber()) return false;
    if (getTaskRunPosition()
        != other.getTaskRunPosition()) return false;
    if (hasOutput() != other.hasOutput()) return false;
    if (hasOutput()) {
      if (!getOutput()
          .equals(other.getOutput())) return false;
    }
    if (hasLogOutput() != other.hasLogOutput()) return false;
    if (hasLogOutput()) {
      if (!getLogOutput()
          .equals(other.getLogOutput())) return false;
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
    hash = (37 * hash) + RESULT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + resultCode_;
    hash = (37 * hash) + THREAD_RUN_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getThreadRunNumber();
    hash = (37 * hash) + TASK_RUN_POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getTaskRunPosition();
    if (hasOutput()) {
      hash = (37 * hash) + OUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + getOutput().hashCode();
    }
    if (hasLogOutput()) {
      hash = (37 * hash) + LOG_OUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + getLogOutput().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.jlib.common.proto.TaskResultOePb parseFrom(
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
  public static Builder newBuilder(io.littlehorse.jlib.common.proto.TaskResultOePb prototype) {
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
   * Protobuf type {@code littlehorse.TaskResultOePb}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.TaskResultOePb)
      io.littlehorse.jlib.common.proto.TaskResultOePbOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskResultOePb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskResultOePb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.jlib.common.proto.TaskResultOePb.class, io.littlehorse.jlib.common.proto.TaskResultOePb.Builder.class);
    }

    // Construct using io.littlehorse.jlib.common.proto.TaskResultOePb.newBuilder()
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
        getOutputFieldBuilder();
        getLogOutputFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resultCode_ = 0;
      threadRunNumber_ = 0;
      taskRunPosition_ = 0;
      output_ = null;
      if (outputBuilder_ != null) {
        outputBuilder_.dispose();
        outputBuilder_ = null;
      }
      logOutput_ = null;
      if (logOutputBuilder_ != null) {
        logOutputBuilder_.dispose();
        logOutputBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.jlib.common.proto.Service.internal_static_littlehorse_TaskResultOePb_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.TaskResultOePb getDefaultInstanceForType() {
      return io.littlehorse.jlib.common.proto.TaskResultOePb.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.TaskResultOePb build() {
      io.littlehorse.jlib.common.proto.TaskResultOePb result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.jlib.common.proto.TaskResultOePb buildPartial() {
      io.littlehorse.jlib.common.proto.TaskResultOePb result = new io.littlehorse.jlib.common.proto.TaskResultOePb(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.jlib.common.proto.TaskResultOePb result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resultCode_ = resultCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.threadRunNumber_ = threadRunNumber_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.taskRunPosition_ = taskRunPosition_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.output_ = outputBuilder_ == null
            ? output_
            : outputBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.logOutput_ = logOutputBuilder_ == null
            ? logOutput_
            : logOutputBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof io.littlehorse.jlib.common.proto.TaskResultOePb) {
        return mergeFrom((io.littlehorse.jlib.common.proto.TaskResultOePb)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.jlib.common.proto.TaskResultOePb other) {
      if (other == io.littlehorse.jlib.common.proto.TaskResultOePb.getDefaultInstance()) return this;
      if (other.resultCode_ != 0) {
        setResultCodeValue(other.getResultCodeValue());
      }
      if (other.getThreadRunNumber() != 0) {
        setThreadRunNumber(other.getThreadRunNumber());
      }
      if (other.getTaskRunPosition() != 0) {
        setTaskRunPosition(other.getTaskRunPosition());
      }
      if (other.hasOutput()) {
        mergeOutput(other.getOutput());
      }
      if (other.hasLogOutput()) {
        mergeLogOutput(other.getLogOutput());
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
              resultCode_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              threadRunNumber_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              taskRunPosition_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getOutputFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getLogOutputFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private int resultCode_ = 0;
    /**
     * <code>.littlehorse.TaskResultCodePb result_code = 1;</code>
     * @return The enum numeric value on the wire for resultCode.
     */
    @java.lang.Override public int getResultCodeValue() {
      return resultCode_;
    }
    /**
     * <code>.littlehorse.TaskResultCodePb result_code = 1;</code>
     * @param value The enum numeric value on the wire for resultCode to set.
     * @return This builder for chaining.
     */
    public Builder setResultCodeValue(int value) {
      resultCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.TaskResultCodePb result_code = 1;</code>
     * @return The resultCode.
     */
    @java.lang.Override
    public io.littlehorse.jlib.common.proto.TaskResultCodePb getResultCode() {
      io.littlehorse.jlib.common.proto.TaskResultCodePb result = io.littlehorse.jlib.common.proto.TaskResultCodePb.forNumber(resultCode_);
      return result == null ? io.littlehorse.jlib.common.proto.TaskResultCodePb.UNRECOGNIZED : result;
    }
    /**
     * <code>.littlehorse.TaskResultCodePb result_code = 1;</code>
     * @param value The resultCode to set.
     * @return This builder for chaining.
     */
    public Builder setResultCode(io.littlehorse.jlib.common.proto.TaskResultCodePb value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      resultCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.littlehorse.TaskResultCodePb result_code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResultCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      resultCode_ = 0;
      onChanged();
      return this;
    }

    private int threadRunNumber_ ;
    /**
     * <code>int32 thread_run_number = 2;</code>
     * @return The threadRunNumber.
     */
    @java.lang.Override
    public int getThreadRunNumber() {
      return threadRunNumber_;
    }
    /**
     * <code>int32 thread_run_number = 2;</code>
     * @param value The threadRunNumber to set.
     * @return This builder for chaining.
     */
    public Builder setThreadRunNumber(int value) {
      
      threadRunNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 thread_run_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearThreadRunNumber() {
      bitField0_ = (bitField0_ & ~0x00000002);
      threadRunNumber_ = 0;
      onChanged();
      return this;
    }

    private int taskRunPosition_ ;
    /**
     * <code>int32 task_run_position = 3;</code>
     * @return The taskRunPosition.
     */
    @java.lang.Override
    public int getTaskRunPosition() {
      return taskRunPosition_;
    }
    /**
     * <code>int32 task_run_position = 3;</code>
     * @param value The taskRunPosition to set.
     * @return This builder for chaining.
     */
    public Builder setTaskRunPosition(int value) {
      
      taskRunPosition_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 task_run_position = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskRunPosition() {
      bitField0_ = (bitField0_ & ~0x00000004);
      taskRunPosition_ = 0;
      onChanged();
      return this;
    }

    private io.littlehorse.jlib.common.proto.VariableValuePb output_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder> outputBuilder_;
    /**
     * <code>optional .littlehorse.VariableValuePb output = 4;</code>
     * @return Whether the output field is set.
     */
    public boolean hasOutput() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .littlehorse.VariableValuePb output = 4;</code>
     * @return The output.
     */
    public io.littlehorse.jlib.common.proto.VariableValuePb getOutput() {
      if (outputBuilder_ == null) {
        return output_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : output_;
      } else {
        return outputBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .littlehorse.VariableValuePb output = 4;</code>
     */
    public Builder setOutput(io.littlehorse.jlib.common.proto.VariableValuePb value) {
      if (outputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        output_ = value;
      } else {
        outputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb output = 4;</code>
     */
    public Builder setOutput(
        io.littlehorse.jlib.common.proto.VariableValuePb.Builder builderForValue) {
      if (outputBuilder_ == null) {
        output_ = builderForValue.build();
      } else {
        outputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb output = 4;</code>
     */
    public Builder mergeOutput(io.littlehorse.jlib.common.proto.VariableValuePb value) {
      if (outputBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          output_ != null &&
          output_ != io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance()) {
          getOutputBuilder().mergeFrom(value);
        } else {
          output_ = value;
        }
      } else {
        outputBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb output = 4;</code>
     */
    public Builder clearOutput() {
      bitField0_ = (bitField0_ & ~0x00000008);
      output_ = null;
      if (outputBuilder_ != null) {
        outputBuilder_.dispose();
        outputBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb output = 4;</code>
     */
    public io.littlehorse.jlib.common.proto.VariableValuePb.Builder getOutputBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getOutputFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .littlehorse.VariableValuePb output = 4;</code>
     */
    public io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getOutputOrBuilder() {
      if (outputBuilder_ != null) {
        return outputBuilder_.getMessageOrBuilder();
      } else {
        return output_ == null ?
            io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : output_;
      }
    }
    /**
     * <code>optional .littlehorse.VariableValuePb output = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder> 
        getOutputFieldBuilder() {
      if (outputBuilder_ == null) {
        outputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder>(
                getOutput(),
                getParentForChildren(),
                isClean());
        output_ = null;
      }
      return outputBuilder_;
    }

    private io.littlehorse.jlib.common.proto.VariableValuePb logOutput_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder> logOutputBuilder_;
    /**
     * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
     * @return Whether the logOutput field is set.
     */
    public boolean hasLogOutput() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
     * @return The logOutput.
     */
    public io.littlehorse.jlib.common.proto.VariableValuePb getLogOutput() {
      if (logOutputBuilder_ == null) {
        return logOutput_ == null ? io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : logOutput_;
      } else {
        return logOutputBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
     */
    public Builder setLogOutput(io.littlehorse.jlib.common.proto.VariableValuePb value) {
      if (logOutputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        logOutput_ = value;
      } else {
        logOutputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
     */
    public Builder setLogOutput(
        io.littlehorse.jlib.common.proto.VariableValuePb.Builder builderForValue) {
      if (logOutputBuilder_ == null) {
        logOutput_ = builderForValue.build();
      } else {
        logOutputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
     */
    public Builder mergeLogOutput(io.littlehorse.jlib.common.proto.VariableValuePb value) {
      if (logOutputBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          logOutput_ != null &&
          logOutput_ != io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance()) {
          getLogOutputBuilder().mergeFrom(value);
        } else {
          logOutput_ = value;
        }
      } else {
        logOutputBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
     */
    public Builder clearLogOutput() {
      bitField0_ = (bitField0_ & ~0x00000010);
      logOutput_ = null;
      if (logOutputBuilder_ != null) {
        logOutputBuilder_.dispose();
        logOutputBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
     */
    public io.littlehorse.jlib.common.proto.VariableValuePb.Builder getLogOutputBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getLogOutputFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
     */
    public io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder getLogOutputOrBuilder() {
      if (logOutputBuilder_ != null) {
        return logOutputBuilder_.getMessageOrBuilder();
      } else {
        return logOutput_ == null ?
            io.littlehorse.jlib.common.proto.VariableValuePb.getDefaultInstance() : logOutput_;
      }
    }
    /**
     * <code>optional .littlehorse.VariableValuePb log_output = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder> 
        getLogOutputFieldBuilder() {
      if (logOutputBuilder_ == null) {
        logOutputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.jlib.common.proto.VariableValuePb, io.littlehorse.jlib.common.proto.VariableValuePb.Builder, io.littlehorse.jlib.common.proto.VariableValuePbOrBuilder>(
                getLogOutput(),
                getParentForChildren(),
                isClean());
        logOutput_ = null;
      }
      return logOutputBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.TaskResultOePb)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.TaskResultOePb)
  private static final io.littlehorse.jlib.common.proto.TaskResultOePb DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.jlib.common.proto.TaskResultOePb();
  }

  public static io.littlehorse.jlib.common.proto.TaskResultOePb getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskResultOePb>
      PARSER = new com.google.protobuf.AbstractParser<TaskResultOePb>() {
    @java.lang.Override
    public TaskResultOePb parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskResultOePb> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskResultOePb> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.jlib.common.proto.TaskResultOePb getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
