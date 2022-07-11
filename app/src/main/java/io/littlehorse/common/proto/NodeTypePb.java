// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

/**
 * Protobuf enum {@code lh_proto.NodeTypePb}
 */
public enum NodeTypePb
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TASK = 0;</code>
   */
  TASK(0),
  /**
   * <code>ENTRYPOINT = 1;</code>
   */
  ENTRYPOINT(1),
  /**
   * <code>EXIT = 2;</code>
   */
  EXIT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TASK = 0;</code>
   */
  public static final int TASK_VALUE = 0;
  /**
   * <code>ENTRYPOINT = 1;</code>
   */
  public static final int ENTRYPOINT_VALUE = 1;
  /**
   * <code>EXIT = 2;</code>
   */
  public static final int EXIT_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NodeTypePb valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NodeTypePb forNumber(int value) {
    switch (value) {
      case 0: return TASK;
      case 1: return ENTRYPOINT;
      case 2: return EXIT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NodeTypePb>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NodeTypePb> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NodeTypePb>() {
          public NodeTypePb findValueByNumber(int number) {
            return NodeTypePb.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.littlehorse.common.proto.LhProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final NodeTypePb[] VALUES = values();

  public static NodeTypePb valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NodeTypePb(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:lh_proto.NodeTypePb)
}

