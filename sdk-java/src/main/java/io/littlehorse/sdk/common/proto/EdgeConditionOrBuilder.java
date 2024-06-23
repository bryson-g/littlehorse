// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wf_spec.proto

package io.littlehorse.sdk.common.proto;

public interface EdgeConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.EdgeCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Operator used to evaluate the left versus the right.
   * </pre>
   *
   * <code>.littlehorse.Comparator comparator = 1;</code>
   * @return The enum numeric value on the wire for comparator.
   */
  int getComparatorValue();
  /**
   * <pre>
   * The Operator used to evaluate the left versus the right.
   * </pre>
   *
   * <code>.littlehorse.Comparator comparator = 1;</code>
   * @return The comparator.
   */
  io.littlehorse.sdk.common.proto.Comparator getComparator();

  /**
   * <pre>
   * The left side of the boolean expression.
   * </pre>
   *
   * <code>.littlehorse.VariableAssignment left = 2;</code>
   * @return Whether the left field is set.
   */
  boolean hasLeft();
  /**
   * <pre>
   * The left side of the boolean expression.
   * </pre>
   *
   * <code>.littlehorse.VariableAssignment left = 2;</code>
   * @return The left.
   */
  io.littlehorse.sdk.common.proto.VariableAssignment getLeft();
  /**
   * <pre>
   * The left side of the boolean expression.
   * </pre>
   *
   * <code>.littlehorse.VariableAssignment left = 2;</code>
   */
  io.littlehorse.sdk.common.proto.VariableAssignmentOrBuilder getLeftOrBuilder();

  /**
   * <pre>
   * The right side of the Boolean Expression.
   * </pre>
   *
   * <code>.littlehorse.VariableAssignment right = 3;</code>
   * @return Whether the right field is set.
   */
  boolean hasRight();
  /**
   * <pre>
   * The right side of the Boolean Expression.
   * </pre>
   *
   * <code>.littlehorse.VariableAssignment right = 3;</code>
   * @return The right.
   */
  io.littlehorse.sdk.common.proto.VariableAssignment getRight();
  /**
   * <pre>
   * The right side of the Boolean Expression.
   * </pre>
   *
   * <code>.littlehorse.VariableAssignment right = 3;</code>
   */
  io.littlehorse.sdk.common.proto.VariableAssignmentOrBuilder getRightOrBuilder();
}
