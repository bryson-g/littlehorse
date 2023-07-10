// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

/**
 * <pre>
 * Variable
 * </pre>
 *
 * Protobuf enum {@code littlehorse.VariableTypePb}
 */
public enum VariableTypePb
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>JSON_OBJ = 0;</code>
   */
  JSON_OBJ(0),
  /**
   * <code>JSON_ARR = 1;</code>
   */
  JSON_ARR(1),
  /**
   * <code>DOUBLE = 2;</code>
   */
  DOUBLE(2),
  /**
   * <code>BOOL = 3;</code>
   */
  BOOL(3),
  /**
   * <code>STR = 4;</code>
   */
  STR(4),
  /**
   * <code>INT = 5;</code>
   */
  INT(5),
  /**
   * <code>BYTES = 6;</code>
   */
  BYTES(6),
  /**
   * <code>NULL = 7;</code>
   */
  NULL(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>JSON_OBJ = 0;</code>
   */
  public static final int JSON_OBJ_VALUE = 0;
  /**
   * <code>JSON_ARR = 1;</code>
   */
  public static final int JSON_ARR_VALUE = 1;
  /**
   * <code>DOUBLE = 2;</code>
   */
  public static final int DOUBLE_VALUE = 2;
  /**
   * <code>BOOL = 3;</code>
   */
  public static final int BOOL_VALUE = 3;
  /**
   * <code>STR = 4;</code>
   */
  public static final int STR_VALUE = 4;
  /**
   * <code>INT = 5;</code>
   */
  public static final int INT_VALUE = 5;
  /**
   * <code>BYTES = 6;</code>
   */
  public static final int BYTES_VALUE = 6;
  /**
   * <code>NULL = 7;</code>
   */
  public static final int NULL_VALUE = 7;


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
  public static VariableTypePb valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VariableTypePb forNumber(int value) {
    switch (value) {
      case 0: return JSON_OBJ;
      case 1: return JSON_ARR;
      case 2: return DOUBLE;
      case 3: return BOOL;
      case 4: return STR;
      case 5: return INT;
      case 6: return BYTES;
      case 7: return NULL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VariableTypePb>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VariableTypePb> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VariableTypePb>() {
          public VariableTypePb findValueByNumber(int number) {
            return VariableTypePb.forNumber(number);
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
    return io.littlehorse.sdk.common.proto.Service.getDescriptor().getEnumTypes().get(4);
  }

  private static final VariableTypePb[] VALUES = values();

  public static VariableTypePb valueOf(
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

  private VariableTypePb(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:littlehorse.VariableTypePb)
}

