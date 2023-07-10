// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * Protobuf enum {@code littlehorse.LHStatusPb}
 */
public enum LHStatusPb
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STARTING = 0;</code>
   */
  STARTING(0),
  /**
   * <code>RUNNING = 1;</code>
   */
  RUNNING(1),
  /**
   * <code>COMPLETED = 2;</code>
   */
  COMPLETED(2),
  /**
   * <code>HALTING = 3;</code>
   */
  HALTING(3),
  /**
   * <code>HALTED = 4;</code>
   */
  HALTED(4),
  /**
   * <code>ERROR = 5;</code>
   */
  ERROR(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STARTING = 0;</code>
   */
  public static final int STARTING_VALUE = 0;
  /**
   * <code>RUNNING = 1;</code>
   */
  public static final int RUNNING_VALUE = 1;
  /**
   * <code>COMPLETED = 2;</code>
   */
  public static final int COMPLETED_VALUE = 2;
  /**
   * <code>HALTING = 3;</code>
   */
  public static final int HALTING_VALUE = 3;
  /**
   * <code>HALTED = 4;</code>
   */
  public static final int HALTED_VALUE = 4;
  /**
   * <code>ERROR = 5;</code>
   */
  public static final int ERROR_VALUE = 5;


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
  public static LHStatusPb valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LHStatusPb forNumber(int value) {
    switch (value) {
      case 0: return STARTING;
      case 1: return RUNNING;
      case 2: return COMPLETED;
      case 3: return HALTING;
      case 4: return HALTED;
      case 5: return ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LHStatusPb>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LHStatusPb> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LHStatusPb>() {
          public LHStatusPb findValueByNumber(int number) {
            return LHStatusPb.forNumber(number);
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
    return io.littlehorse.sdk.common.proto.Service.getDescriptor().getEnumTypes().get(1);
  }

  private static final LHStatusPb[] VALUES = values();

  public static LHStatusPb valueOf(
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

  private LHStatusPb(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:littlehorse.LHStatusPb)
}

