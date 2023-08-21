// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task_run.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.TaskRunSource}
 */
public final class TaskRunSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.TaskRunSource)
    TaskRunSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskRunSource.newBuilder() to construct.
  private TaskRunSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskRunSource() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TaskRunSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.TaskRunOuterClass.internal_static_littlehorse_TaskRunSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.TaskRunOuterClass.internal_static_littlehorse_TaskRunSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.TaskRunSource.class, io.littlehorse.sdk.common.proto.TaskRunSource.Builder.class);
  }

  private int taskRunSourceCase_ = 0;
  private java.lang.Object taskRunSource_;
  public enum TaskRunSourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TASK_NODE(1),
    USER_TASK_TRIGGER(2),
    TASKRUNSOURCE_NOT_SET(0);
    private final int value;
    private TaskRunSourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TaskRunSourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static TaskRunSourceCase forNumber(int value) {
      switch (value) {
        case 1: return TASK_NODE;
        case 2: return USER_TASK_TRIGGER;
        case 0: return TASKRUNSOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TaskRunSourceCase
  getTaskRunSourceCase() {
    return TaskRunSourceCase.forNumber(
        taskRunSourceCase_);
  }

  public static final int TASK_NODE_FIELD_NUMBER = 1;
  /**
   * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
   * @return Whether the taskNode field is set.
   */
  @java.lang.Override
  public boolean hasTaskNode() {
    return taskRunSourceCase_ == 1;
  }
  /**
   * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
   * @return The taskNode.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskNodeReference getTaskNode() {
    if (taskRunSourceCase_ == 1) {
       return (io.littlehorse.sdk.common.proto.TaskNodeReference) taskRunSource_;
    }
    return io.littlehorse.sdk.common.proto.TaskNodeReference.getDefaultInstance();
  }
  /**
   * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskNodeReferenceOrBuilder getTaskNodeOrBuilder() {
    if (taskRunSourceCase_ == 1) {
       return (io.littlehorse.sdk.common.proto.TaskNodeReference) taskRunSource_;
    }
    return io.littlehorse.sdk.common.proto.TaskNodeReference.getDefaultInstance();
  }

  public static final int USER_TASK_TRIGGER_FIELD_NUMBER = 2;
  /**
   * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
   * @return Whether the userTaskTrigger field is set.
   */
  @java.lang.Override
  public boolean hasUserTaskTrigger() {
    return taskRunSourceCase_ == 2;
  }
  /**
   * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
   * @return The userTaskTrigger.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.UserTaskTriggerReference getUserTaskTrigger() {
    if (taskRunSourceCase_ == 2) {
       return (io.littlehorse.sdk.common.proto.UserTaskTriggerReference) taskRunSource_;
    }
    return io.littlehorse.sdk.common.proto.UserTaskTriggerReference.getDefaultInstance();
  }
  /**
   * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.UserTaskTriggerReferenceOrBuilder getUserTaskTriggerOrBuilder() {
    if (taskRunSourceCase_ == 2) {
       return (io.littlehorse.sdk.common.proto.UserTaskTriggerReference) taskRunSource_;
    }
    return io.littlehorse.sdk.common.proto.UserTaskTriggerReference.getDefaultInstance();
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
    if (taskRunSourceCase_ == 1) {
      output.writeMessage(1, (io.littlehorse.sdk.common.proto.TaskNodeReference) taskRunSource_);
    }
    if (taskRunSourceCase_ == 2) {
      output.writeMessage(2, (io.littlehorse.sdk.common.proto.UserTaskTriggerReference) taskRunSource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (taskRunSourceCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.littlehorse.sdk.common.proto.TaskNodeReference) taskRunSource_);
    }
    if (taskRunSourceCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.littlehorse.sdk.common.proto.UserTaskTriggerReference) taskRunSource_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.TaskRunSource)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.TaskRunSource other = (io.littlehorse.sdk.common.proto.TaskRunSource) obj;

    if (!getTaskRunSourceCase().equals(other.getTaskRunSourceCase())) return false;
    switch (taskRunSourceCase_) {
      case 1:
        if (!getTaskNode()
            .equals(other.getTaskNode())) return false;
        break;
      case 2:
        if (!getUserTaskTrigger()
            .equals(other.getUserTaskTrigger())) return false;
        break;
      case 0:
      default:
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
    switch (taskRunSourceCase_) {
      case 1:
        hash = (37 * hash) + TASK_NODE_FIELD_NUMBER;
        hash = (53 * hash) + getTaskNode().hashCode();
        break;
      case 2:
        hash = (37 * hash) + USER_TASK_TRIGGER_FIELD_NUMBER;
        hash = (53 * hash) + getUserTaskTrigger().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.TaskRunSource parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.TaskRunSource prototype) {
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
   * Protobuf type {@code littlehorse.TaskRunSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.TaskRunSource)
      io.littlehorse.sdk.common.proto.TaskRunSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.TaskRunOuterClass.internal_static_littlehorse_TaskRunSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.TaskRunOuterClass.internal_static_littlehorse_TaskRunSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.TaskRunSource.class, io.littlehorse.sdk.common.proto.TaskRunSource.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.TaskRunSource.newBuilder()
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
      if (taskNodeBuilder_ != null) {
        taskNodeBuilder_.clear();
      }
      if (userTaskTriggerBuilder_ != null) {
        userTaskTriggerBuilder_.clear();
      }
      taskRunSourceCase_ = 0;
      taskRunSource_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.TaskRunOuterClass.internal_static_littlehorse_TaskRunSource_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskRunSource getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.TaskRunSource.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskRunSource build() {
      io.littlehorse.sdk.common.proto.TaskRunSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskRunSource buildPartial() {
      io.littlehorse.sdk.common.proto.TaskRunSource result = new io.littlehorse.sdk.common.proto.TaskRunSource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.TaskRunSource result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(io.littlehorse.sdk.common.proto.TaskRunSource result) {
      result.taskRunSourceCase_ = taskRunSourceCase_;
      result.taskRunSource_ = this.taskRunSource_;
      if (taskRunSourceCase_ == 1 &&
          taskNodeBuilder_ != null) {
        result.taskRunSource_ = taskNodeBuilder_.build();
      }
      if (taskRunSourceCase_ == 2 &&
          userTaskTriggerBuilder_ != null) {
        result.taskRunSource_ = userTaskTriggerBuilder_.build();
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
      if (other instanceof io.littlehorse.sdk.common.proto.TaskRunSource) {
        return mergeFrom((io.littlehorse.sdk.common.proto.TaskRunSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.TaskRunSource other) {
      if (other == io.littlehorse.sdk.common.proto.TaskRunSource.getDefaultInstance()) return this;
      switch (other.getTaskRunSourceCase()) {
        case TASK_NODE: {
          mergeTaskNode(other.getTaskNode());
          break;
        }
        case USER_TASK_TRIGGER: {
          mergeUserTaskTrigger(other.getUserTaskTrigger());
          break;
        }
        case TASKRUNSOURCE_NOT_SET: {
          break;
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
              input.readMessage(
                  getTaskNodeFieldBuilder().getBuilder(),
                  extensionRegistry);
              taskRunSourceCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUserTaskTriggerFieldBuilder().getBuilder(),
                  extensionRegistry);
              taskRunSourceCase_ = 2;
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
    private int taskRunSourceCase_ = 0;
    private java.lang.Object taskRunSource_;
    public TaskRunSourceCase
        getTaskRunSourceCase() {
      return TaskRunSourceCase.forNumber(
          taskRunSourceCase_);
    }

    public Builder clearTaskRunSource() {
      taskRunSourceCase_ = 0;
      taskRunSource_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TaskNodeReference, io.littlehorse.sdk.common.proto.TaskNodeReference.Builder, io.littlehorse.sdk.common.proto.TaskNodeReferenceOrBuilder> taskNodeBuilder_;
    /**
     * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
     * @return Whether the taskNode field is set.
     */
    @java.lang.Override
    public boolean hasTaskNode() {
      return taskRunSourceCase_ == 1;
    }
    /**
     * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
     * @return The taskNode.
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskNodeReference getTaskNode() {
      if (taskNodeBuilder_ == null) {
        if (taskRunSourceCase_ == 1) {
          return (io.littlehorse.sdk.common.proto.TaskNodeReference) taskRunSource_;
        }
        return io.littlehorse.sdk.common.proto.TaskNodeReference.getDefaultInstance();
      } else {
        if (taskRunSourceCase_ == 1) {
          return taskNodeBuilder_.getMessage();
        }
        return io.littlehorse.sdk.common.proto.TaskNodeReference.getDefaultInstance();
      }
    }
    /**
     * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
     */
    public Builder setTaskNode(io.littlehorse.sdk.common.proto.TaskNodeReference value) {
      if (taskNodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        taskRunSource_ = value;
        onChanged();
      } else {
        taskNodeBuilder_.setMessage(value);
      }
      taskRunSourceCase_ = 1;
      return this;
    }
    /**
     * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
     */
    public Builder setTaskNode(
        io.littlehorse.sdk.common.proto.TaskNodeReference.Builder builderForValue) {
      if (taskNodeBuilder_ == null) {
        taskRunSource_ = builderForValue.build();
        onChanged();
      } else {
        taskNodeBuilder_.setMessage(builderForValue.build());
      }
      taskRunSourceCase_ = 1;
      return this;
    }
    /**
     * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
     */
    public Builder mergeTaskNode(io.littlehorse.sdk.common.proto.TaskNodeReference value) {
      if (taskNodeBuilder_ == null) {
        if (taskRunSourceCase_ == 1 &&
            taskRunSource_ != io.littlehorse.sdk.common.proto.TaskNodeReference.getDefaultInstance()) {
          taskRunSource_ = io.littlehorse.sdk.common.proto.TaskNodeReference.newBuilder((io.littlehorse.sdk.common.proto.TaskNodeReference) taskRunSource_)
              .mergeFrom(value).buildPartial();
        } else {
          taskRunSource_ = value;
        }
        onChanged();
      } else {
        if (taskRunSourceCase_ == 1) {
          taskNodeBuilder_.mergeFrom(value);
        } else {
          taskNodeBuilder_.setMessage(value);
        }
      }
      taskRunSourceCase_ = 1;
      return this;
    }
    /**
     * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
     */
    public Builder clearTaskNode() {
      if (taskNodeBuilder_ == null) {
        if (taskRunSourceCase_ == 1) {
          taskRunSourceCase_ = 0;
          taskRunSource_ = null;
          onChanged();
        }
      } else {
        if (taskRunSourceCase_ == 1) {
          taskRunSourceCase_ = 0;
          taskRunSource_ = null;
        }
        taskNodeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.TaskNodeReference.Builder getTaskNodeBuilder() {
      return getTaskNodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.TaskNodeReferenceOrBuilder getTaskNodeOrBuilder() {
      if ((taskRunSourceCase_ == 1) && (taskNodeBuilder_ != null)) {
        return taskNodeBuilder_.getMessageOrBuilder();
      } else {
        if (taskRunSourceCase_ == 1) {
          return (io.littlehorse.sdk.common.proto.TaskNodeReference) taskRunSource_;
        }
        return io.littlehorse.sdk.common.proto.TaskNodeReference.getDefaultInstance();
      }
    }
    /**
     * <code>.littlehorse.TaskNodeReference task_node = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.TaskNodeReference, io.littlehorse.sdk.common.proto.TaskNodeReference.Builder, io.littlehorse.sdk.common.proto.TaskNodeReferenceOrBuilder> 
        getTaskNodeFieldBuilder() {
      if (taskNodeBuilder_ == null) {
        if (!(taskRunSourceCase_ == 1)) {
          taskRunSource_ = io.littlehorse.sdk.common.proto.TaskNodeReference.getDefaultInstance();
        }
        taskNodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.TaskNodeReference, io.littlehorse.sdk.common.proto.TaskNodeReference.Builder, io.littlehorse.sdk.common.proto.TaskNodeReferenceOrBuilder>(
                (io.littlehorse.sdk.common.proto.TaskNodeReference) taskRunSource_,
                getParentForChildren(),
                isClean());
        taskRunSource_ = null;
      }
      taskRunSourceCase_ = 1;
      onChanged();
      return taskNodeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.UserTaskTriggerReference, io.littlehorse.sdk.common.proto.UserTaskTriggerReference.Builder, io.littlehorse.sdk.common.proto.UserTaskTriggerReferenceOrBuilder> userTaskTriggerBuilder_;
    /**
     * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
     * @return Whether the userTaskTrigger field is set.
     */
    @java.lang.Override
    public boolean hasUserTaskTrigger() {
      return taskRunSourceCase_ == 2;
    }
    /**
     * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
     * @return The userTaskTrigger.
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UserTaskTriggerReference getUserTaskTrigger() {
      if (userTaskTriggerBuilder_ == null) {
        if (taskRunSourceCase_ == 2) {
          return (io.littlehorse.sdk.common.proto.UserTaskTriggerReference) taskRunSource_;
        }
        return io.littlehorse.sdk.common.proto.UserTaskTriggerReference.getDefaultInstance();
      } else {
        if (taskRunSourceCase_ == 2) {
          return userTaskTriggerBuilder_.getMessage();
        }
        return io.littlehorse.sdk.common.proto.UserTaskTriggerReference.getDefaultInstance();
      }
    }
    /**
     * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
     */
    public Builder setUserTaskTrigger(io.littlehorse.sdk.common.proto.UserTaskTriggerReference value) {
      if (userTaskTriggerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        taskRunSource_ = value;
        onChanged();
      } else {
        userTaskTriggerBuilder_.setMessage(value);
      }
      taskRunSourceCase_ = 2;
      return this;
    }
    /**
     * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
     */
    public Builder setUserTaskTrigger(
        io.littlehorse.sdk.common.proto.UserTaskTriggerReference.Builder builderForValue) {
      if (userTaskTriggerBuilder_ == null) {
        taskRunSource_ = builderForValue.build();
        onChanged();
      } else {
        userTaskTriggerBuilder_.setMessage(builderForValue.build());
      }
      taskRunSourceCase_ = 2;
      return this;
    }
    /**
     * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
     */
    public Builder mergeUserTaskTrigger(io.littlehorse.sdk.common.proto.UserTaskTriggerReference value) {
      if (userTaskTriggerBuilder_ == null) {
        if (taskRunSourceCase_ == 2 &&
            taskRunSource_ != io.littlehorse.sdk.common.proto.UserTaskTriggerReference.getDefaultInstance()) {
          taskRunSource_ = io.littlehorse.sdk.common.proto.UserTaskTriggerReference.newBuilder((io.littlehorse.sdk.common.proto.UserTaskTriggerReference) taskRunSource_)
              .mergeFrom(value).buildPartial();
        } else {
          taskRunSource_ = value;
        }
        onChanged();
      } else {
        if (taskRunSourceCase_ == 2) {
          userTaskTriggerBuilder_.mergeFrom(value);
        } else {
          userTaskTriggerBuilder_.setMessage(value);
        }
      }
      taskRunSourceCase_ = 2;
      return this;
    }
    /**
     * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
     */
    public Builder clearUserTaskTrigger() {
      if (userTaskTriggerBuilder_ == null) {
        if (taskRunSourceCase_ == 2) {
          taskRunSourceCase_ = 0;
          taskRunSource_ = null;
          onChanged();
        }
      } else {
        if (taskRunSourceCase_ == 2) {
          taskRunSourceCase_ = 0;
          taskRunSource_ = null;
        }
        userTaskTriggerBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
     */
    public io.littlehorse.sdk.common.proto.UserTaskTriggerReference.Builder getUserTaskTriggerBuilder() {
      return getUserTaskTriggerFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UserTaskTriggerReferenceOrBuilder getUserTaskTriggerOrBuilder() {
      if ((taskRunSourceCase_ == 2) && (userTaskTriggerBuilder_ != null)) {
        return userTaskTriggerBuilder_.getMessageOrBuilder();
      } else {
        if (taskRunSourceCase_ == 2) {
          return (io.littlehorse.sdk.common.proto.UserTaskTriggerReference) taskRunSource_;
        }
        return io.littlehorse.sdk.common.proto.UserTaskTriggerReference.getDefaultInstance();
      }
    }
    /**
     * <code>.littlehorse.UserTaskTriggerReference user_task_trigger = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.UserTaskTriggerReference, io.littlehorse.sdk.common.proto.UserTaskTriggerReference.Builder, io.littlehorse.sdk.common.proto.UserTaskTriggerReferenceOrBuilder> 
        getUserTaskTriggerFieldBuilder() {
      if (userTaskTriggerBuilder_ == null) {
        if (!(taskRunSourceCase_ == 2)) {
          taskRunSource_ = io.littlehorse.sdk.common.proto.UserTaskTriggerReference.getDefaultInstance();
        }
        userTaskTriggerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.UserTaskTriggerReference, io.littlehorse.sdk.common.proto.UserTaskTriggerReference.Builder, io.littlehorse.sdk.common.proto.UserTaskTriggerReferenceOrBuilder>(
                (io.littlehorse.sdk.common.proto.UserTaskTriggerReference) taskRunSource_,
                getParentForChildren(),
                isClean());
        taskRunSource_ = null;
      }
      taskRunSourceCase_ = 2;
      onChanged();
      return userTaskTriggerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.TaskRunSource)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.TaskRunSource)
  private static final io.littlehorse.sdk.common.proto.TaskRunSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.TaskRunSource();
  }

  public static io.littlehorse.sdk.common.proto.TaskRunSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskRunSource>
      PARSER = new com.google.protobuf.AbstractParser<TaskRunSource>() {
    @java.lang.Override
    public TaskRunSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<TaskRunSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskRunSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.TaskRunSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

