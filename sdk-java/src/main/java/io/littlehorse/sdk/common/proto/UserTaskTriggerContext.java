// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_tasks.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf type {@code littlehorse.UserTaskTriggerContext}
 */
public final class UserTaskTriggerContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:littlehorse.UserTaskTriggerContext)
    UserTaskTriggerContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserTaskTriggerContext.newBuilder() to construct.
  private UserTaskTriggerContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserTaskTriggerContext() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserTaskTriggerContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.littlehorse.sdk.common.proto.UserTasks.internal_static_littlehorse_UserTaskTriggerContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.littlehorse.sdk.common.proto.UserTasks.internal_static_littlehorse_UserTaskTriggerContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.littlehorse.sdk.common.proto.UserTaskTriggerContext.class, io.littlehorse.sdk.common.proto.UserTaskTriggerContext.Builder.class);
  }

  private int ownerCase_ = 0;
  private java.lang.Object owner_;
  public enum OwnerCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    USER_GROUP(1),
    USER(2),
    OWNER_NOT_SET(0);
    private final int value;
    private OwnerCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OwnerCase valueOf(int value) {
      return forNumber(value);
    }

    public static OwnerCase forNumber(int value) {
      switch (value) {
        case 1: return USER_GROUP;
        case 2: return USER;
        case 0: return OWNER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OwnerCase
  getOwnerCase() {
    return OwnerCase.forNumber(
        ownerCase_);
  }

  public static final int USER_GROUP_FIELD_NUMBER = 1;
  /**
   * <code>.littlehorse.UserGroup user_group = 1;</code>
   * @return Whether the userGroup field is set.
   */
  @java.lang.Override
  public boolean hasUserGroup() {
    return ownerCase_ == 1;
  }
  /**
   * <code>.littlehorse.UserGroup user_group = 1;</code>
   * @return The userGroup.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.UserGroup getUserGroup() {
    if (ownerCase_ == 1) {
       return (io.littlehorse.sdk.common.proto.UserGroup) owner_;
    }
    return io.littlehorse.sdk.common.proto.UserGroup.getDefaultInstance();
  }
  /**
   * <code>.littlehorse.UserGroup user_group = 1;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.UserGroupOrBuilder getUserGroupOrBuilder() {
    if (ownerCase_ == 1) {
       return (io.littlehorse.sdk.common.proto.UserGroup) owner_;
    }
    return io.littlehorse.sdk.common.proto.UserGroup.getDefaultInstance();
  }

  public static final int USER_FIELD_NUMBER = 2;
  /**
   * <code>.littlehorse.User user = 2;</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return ownerCase_ == 2;
  }
  /**
   * <code>.littlehorse.User user = 2;</code>
   * @return The user.
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.User getUser() {
    if (ownerCase_ == 2) {
       return (io.littlehorse.sdk.common.proto.User) owner_;
    }
    return io.littlehorse.sdk.common.proto.User.getDefaultInstance();
  }
  /**
   * <code>.littlehorse.User user = 2;</code>
   */
  @java.lang.Override
  public io.littlehorse.sdk.common.proto.UserOrBuilder getUserOrBuilder() {
    if (ownerCase_ == 2) {
       return (io.littlehorse.sdk.common.proto.User) owner_;
    }
    return io.littlehorse.sdk.common.proto.User.getDefaultInstance();
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
    if (ownerCase_ == 1) {
      output.writeMessage(1, (io.littlehorse.sdk.common.proto.UserGroup) owner_);
    }
    if (ownerCase_ == 2) {
      output.writeMessage(2, (io.littlehorse.sdk.common.proto.User) owner_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ownerCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.littlehorse.sdk.common.proto.UserGroup) owner_);
    }
    if (ownerCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.littlehorse.sdk.common.proto.User) owner_);
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
    if (!(obj instanceof io.littlehorse.sdk.common.proto.UserTaskTriggerContext)) {
      return super.equals(obj);
    }
    io.littlehorse.sdk.common.proto.UserTaskTriggerContext other = (io.littlehorse.sdk.common.proto.UserTaskTriggerContext) obj;

    if (!getOwnerCase().equals(other.getOwnerCase())) return false;
    switch (ownerCase_) {
      case 1:
        if (!getUserGroup()
            .equals(other.getUserGroup())) return false;
        break;
      case 2:
        if (!getUser()
            .equals(other.getUser())) return false;
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
    switch (ownerCase_) {
      case 1:
        hash = (37 * hash) + USER_GROUP_FIELD_NUMBER;
        hash = (53 * hash) + getUserGroup().hashCode();
        break;
      case 2:
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext parseFrom(
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
  public static Builder newBuilder(io.littlehorse.sdk.common.proto.UserTaskTriggerContext prototype) {
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
   * Protobuf type {@code littlehorse.UserTaskTriggerContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:littlehorse.UserTaskTriggerContext)
      io.littlehorse.sdk.common.proto.UserTaskTriggerContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.littlehorse.sdk.common.proto.UserTasks.internal_static_littlehorse_UserTaskTriggerContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.littlehorse.sdk.common.proto.UserTasks.internal_static_littlehorse_UserTaskTriggerContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.littlehorse.sdk.common.proto.UserTaskTriggerContext.class, io.littlehorse.sdk.common.proto.UserTaskTriggerContext.Builder.class);
    }

    // Construct using io.littlehorse.sdk.common.proto.UserTaskTriggerContext.newBuilder()
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
      if (userGroupBuilder_ != null) {
        userGroupBuilder_.clear();
      }
      if (userBuilder_ != null) {
        userBuilder_.clear();
      }
      ownerCase_ = 0;
      owner_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.littlehorse.sdk.common.proto.UserTasks.internal_static_littlehorse_UserTaskTriggerContext_descriptor;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UserTaskTriggerContext getDefaultInstanceForType() {
      return io.littlehorse.sdk.common.proto.UserTaskTriggerContext.getDefaultInstance();
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UserTaskTriggerContext build() {
      io.littlehorse.sdk.common.proto.UserTaskTriggerContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UserTaskTriggerContext buildPartial() {
      io.littlehorse.sdk.common.proto.UserTaskTriggerContext result = new io.littlehorse.sdk.common.proto.UserTaskTriggerContext(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(io.littlehorse.sdk.common.proto.UserTaskTriggerContext result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(io.littlehorse.sdk.common.proto.UserTaskTriggerContext result) {
      result.ownerCase_ = ownerCase_;
      result.owner_ = this.owner_;
      if (ownerCase_ == 1 &&
          userGroupBuilder_ != null) {
        result.owner_ = userGroupBuilder_.build();
      }
      if (ownerCase_ == 2 &&
          userBuilder_ != null) {
        result.owner_ = userBuilder_.build();
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
      if (other instanceof io.littlehorse.sdk.common.proto.UserTaskTriggerContext) {
        return mergeFrom((io.littlehorse.sdk.common.proto.UserTaskTriggerContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.littlehorse.sdk.common.proto.UserTaskTriggerContext other) {
      if (other == io.littlehorse.sdk.common.proto.UserTaskTriggerContext.getDefaultInstance()) return this;
      switch (other.getOwnerCase()) {
        case USER_GROUP: {
          mergeUserGroup(other.getUserGroup());
          break;
        }
        case USER: {
          mergeUser(other.getUser());
          break;
        }
        case OWNER_NOT_SET: {
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
                  getUserGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              ownerCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              ownerCase_ = 2;
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
    private int ownerCase_ = 0;
    private java.lang.Object owner_;
    public OwnerCase
        getOwnerCase() {
      return OwnerCase.forNumber(
          ownerCase_);
    }

    public Builder clearOwner() {
      ownerCase_ = 0;
      owner_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.UserGroup, io.littlehorse.sdk.common.proto.UserGroup.Builder, io.littlehorse.sdk.common.proto.UserGroupOrBuilder> userGroupBuilder_;
    /**
     * <code>.littlehorse.UserGroup user_group = 1;</code>
     * @return Whether the userGroup field is set.
     */
    @java.lang.Override
    public boolean hasUserGroup() {
      return ownerCase_ == 1;
    }
    /**
     * <code>.littlehorse.UserGroup user_group = 1;</code>
     * @return The userGroup.
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UserGroup getUserGroup() {
      if (userGroupBuilder_ == null) {
        if (ownerCase_ == 1) {
          return (io.littlehorse.sdk.common.proto.UserGroup) owner_;
        }
        return io.littlehorse.sdk.common.proto.UserGroup.getDefaultInstance();
      } else {
        if (ownerCase_ == 1) {
          return userGroupBuilder_.getMessage();
        }
        return io.littlehorse.sdk.common.proto.UserGroup.getDefaultInstance();
      }
    }
    /**
     * <code>.littlehorse.UserGroup user_group = 1;</code>
     */
    public Builder setUserGroup(io.littlehorse.sdk.common.proto.UserGroup value) {
      if (userGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        owner_ = value;
        onChanged();
      } else {
        userGroupBuilder_.setMessage(value);
      }
      ownerCase_ = 1;
      return this;
    }
    /**
     * <code>.littlehorse.UserGroup user_group = 1;</code>
     */
    public Builder setUserGroup(
        io.littlehorse.sdk.common.proto.UserGroup.Builder builderForValue) {
      if (userGroupBuilder_ == null) {
        owner_ = builderForValue.build();
        onChanged();
      } else {
        userGroupBuilder_.setMessage(builderForValue.build());
      }
      ownerCase_ = 1;
      return this;
    }
    /**
     * <code>.littlehorse.UserGroup user_group = 1;</code>
     */
    public Builder mergeUserGroup(io.littlehorse.sdk.common.proto.UserGroup value) {
      if (userGroupBuilder_ == null) {
        if (ownerCase_ == 1 &&
            owner_ != io.littlehorse.sdk.common.proto.UserGroup.getDefaultInstance()) {
          owner_ = io.littlehorse.sdk.common.proto.UserGroup.newBuilder((io.littlehorse.sdk.common.proto.UserGroup) owner_)
              .mergeFrom(value).buildPartial();
        } else {
          owner_ = value;
        }
        onChanged();
      } else {
        if (ownerCase_ == 1) {
          userGroupBuilder_.mergeFrom(value);
        } else {
          userGroupBuilder_.setMessage(value);
        }
      }
      ownerCase_ = 1;
      return this;
    }
    /**
     * <code>.littlehorse.UserGroup user_group = 1;</code>
     */
    public Builder clearUserGroup() {
      if (userGroupBuilder_ == null) {
        if (ownerCase_ == 1) {
          ownerCase_ = 0;
          owner_ = null;
          onChanged();
        }
      } else {
        if (ownerCase_ == 1) {
          ownerCase_ = 0;
          owner_ = null;
        }
        userGroupBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.littlehorse.UserGroup user_group = 1;</code>
     */
    public io.littlehorse.sdk.common.proto.UserGroup.Builder getUserGroupBuilder() {
      return getUserGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlehorse.UserGroup user_group = 1;</code>
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UserGroupOrBuilder getUserGroupOrBuilder() {
      if ((ownerCase_ == 1) && (userGroupBuilder_ != null)) {
        return userGroupBuilder_.getMessageOrBuilder();
      } else {
        if (ownerCase_ == 1) {
          return (io.littlehorse.sdk.common.proto.UserGroup) owner_;
        }
        return io.littlehorse.sdk.common.proto.UserGroup.getDefaultInstance();
      }
    }
    /**
     * <code>.littlehorse.UserGroup user_group = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.UserGroup, io.littlehorse.sdk.common.proto.UserGroup.Builder, io.littlehorse.sdk.common.proto.UserGroupOrBuilder> 
        getUserGroupFieldBuilder() {
      if (userGroupBuilder_ == null) {
        if (!(ownerCase_ == 1)) {
          owner_ = io.littlehorse.sdk.common.proto.UserGroup.getDefaultInstance();
        }
        userGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.UserGroup, io.littlehorse.sdk.common.proto.UserGroup.Builder, io.littlehorse.sdk.common.proto.UserGroupOrBuilder>(
                (io.littlehorse.sdk.common.proto.UserGroup) owner_,
                getParentForChildren(),
                isClean());
        owner_ = null;
      }
      ownerCase_ = 1;
      onChanged();
      return userGroupBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.User, io.littlehorse.sdk.common.proto.User.Builder, io.littlehorse.sdk.common.proto.UserOrBuilder> userBuilder_;
    /**
     * <code>.littlehorse.User user = 2;</code>
     * @return Whether the user field is set.
     */
    @java.lang.Override
    public boolean hasUser() {
      return ownerCase_ == 2;
    }
    /**
     * <code>.littlehorse.User user = 2;</code>
     * @return The user.
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.User getUser() {
      if (userBuilder_ == null) {
        if (ownerCase_ == 2) {
          return (io.littlehorse.sdk.common.proto.User) owner_;
        }
        return io.littlehorse.sdk.common.proto.User.getDefaultInstance();
      } else {
        if (ownerCase_ == 2) {
          return userBuilder_.getMessage();
        }
        return io.littlehorse.sdk.common.proto.User.getDefaultInstance();
      }
    }
    /**
     * <code>.littlehorse.User user = 2;</code>
     */
    public Builder setUser(io.littlehorse.sdk.common.proto.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        owner_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }
      ownerCase_ = 2;
      return this;
    }
    /**
     * <code>.littlehorse.User user = 2;</code>
     */
    public Builder setUser(
        io.littlehorse.sdk.common.proto.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        owner_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      ownerCase_ = 2;
      return this;
    }
    /**
     * <code>.littlehorse.User user = 2;</code>
     */
    public Builder mergeUser(io.littlehorse.sdk.common.proto.User value) {
      if (userBuilder_ == null) {
        if (ownerCase_ == 2 &&
            owner_ != io.littlehorse.sdk.common.proto.User.getDefaultInstance()) {
          owner_ = io.littlehorse.sdk.common.proto.User.newBuilder((io.littlehorse.sdk.common.proto.User) owner_)
              .mergeFrom(value).buildPartial();
        } else {
          owner_ = value;
        }
        onChanged();
      } else {
        if (ownerCase_ == 2) {
          userBuilder_.mergeFrom(value);
        } else {
          userBuilder_.setMessage(value);
        }
      }
      ownerCase_ = 2;
      return this;
    }
    /**
     * <code>.littlehorse.User user = 2;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        if (ownerCase_ == 2) {
          ownerCase_ = 0;
          owner_ = null;
          onChanged();
        }
      } else {
        if (ownerCase_ == 2) {
          ownerCase_ = 0;
          owner_ = null;
        }
        userBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.littlehorse.User user = 2;</code>
     */
    public io.littlehorse.sdk.common.proto.User.Builder getUserBuilder() {
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.littlehorse.User user = 2;</code>
     */
    @java.lang.Override
    public io.littlehorse.sdk.common.proto.UserOrBuilder getUserOrBuilder() {
      if ((ownerCase_ == 2) && (userBuilder_ != null)) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        if (ownerCase_ == 2) {
          return (io.littlehorse.sdk.common.proto.User) owner_;
        }
        return io.littlehorse.sdk.common.proto.User.getDefaultInstance();
      }
    }
    /**
     * <code>.littlehorse.User user = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.littlehorse.sdk.common.proto.User, io.littlehorse.sdk.common.proto.User.Builder, io.littlehorse.sdk.common.proto.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        if (!(ownerCase_ == 2)) {
          owner_ = io.littlehorse.sdk.common.proto.User.getDefaultInstance();
        }
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.littlehorse.sdk.common.proto.User, io.littlehorse.sdk.common.proto.User.Builder, io.littlehorse.sdk.common.proto.UserOrBuilder>(
                (io.littlehorse.sdk.common.proto.User) owner_,
                getParentForChildren(),
                isClean());
        owner_ = null;
      }
      ownerCase_ = 2;
      onChanged();
      return userBuilder_;
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


    // @@protoc_insertion_point(builder_scope:littlehorse.UserTaskTriggerContext)
  }

  // @@protoc_insertion_point(class_scope:littlehorse.UserTaskTriggerContext)
  private static final io.littlehorse.sdk.common.proto.UserTaskTriggerContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.littlehorse.sdk.common.proto.UserTaskTriggerContext();
  }

  public static io.littlehorse.sdk.common.proto.UserTaskTriggerContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserTaskTriggerContext>
      PARSER = new com.google.protobuf.AbstractParser<UserTaskTriggerContext>() {
    @java.lang.Override
    public UserTaskTriggerContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserTaskTriggerContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserTaskTriggerContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.littlehorse.sdk.common.proto.UserTaskTriggerContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

