// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task_run.proto

package io.littlehorse.sdk.common.proto;

public interface TaskRunOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.TaskRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.TaskRunId id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.littlehorse.TaskRunId id = 1;</code>
   * @return The id.
   */
  io.littlehorse.sdk.common.proto.TaskRunId getId();
  /**
   * <code>.littlehorse.TaskRunId id = 1;</code>
   */
  io.littlehorse.sdk.common.proto.TaskRunIdOrBuilder getIdOrBuilder();

  /**
   * <code>repeated .littlehorse.TaskAttempt attempts = 2;</code>
   */
  java.util.List<io.littlehorse.sdk.common.proto.TaskAttempt> 
      getAttemptsList();
  /**
   * <code>repeated .littlehorse.TaskAttempt attempts = 2;</code>
   */
  io.littlehorse.sdk.common.proto.TaskAttempt getAttempts(int index);
  /**
   * <code>repeated .littlehorse.TaskAttempt attempts = 2;</code>
   */
  int getAttemptsCount();
  /**
   * <code>repeated .littlehorse.TaskAttempt attempts = 2;</code>
   */
  java.util.List<? extends io.littlehorse.sdk.common.proto.TaskAttemptOrBuilder> 
      getAttemptsOrBuilderList();
  /**
   * <code>repeated .littlehorse.TaskAttempt attempts = 2;</code>
   */
  io.littlehorse.sdk.common.proto.TaskAttemptOrBuilder getAttemptsOrBuilder(
      int index);

  /**
   * <code>int32 max_attempts = 3;</code>
   * @return The maxAttempts.
   */
  int getMaxAttempts();

  /**
   * <code>string task_def_name = 4;</code>
   * @return The taskDefName.
   */
  java.lang.String getTaskDefName();
  /**
   * <code>string task_def_name = 4;</code>
   * @return The bytes for taskDefName.
   */
  com.google.protobuf.ByteString
      getTaskDefNameBytes();

  /**
   * <code>repeated .littlehorse.VarNameAndVal input_variables = 5;</code>
   */
  java.util.List<io.littlehorse.sdk.common.proto.VarNameAndVal> 
      getInputVariablesList();
  /**
   * <code>repeated .littlehorse.VarNameAndVal input_variables = 5;</code>
   */
  io.littlehorse.sdk.common.proto.VarNameAndVal getInputVariables(int index);
  /**
   * <code>repeated .littlehorse.VarNameAndVal input_variables = 5;</code>
   */
  int getInputVariablesCount();
  /**
   * <code>repeated .littlehorse.VarNameAndVal input_variables = 5;</code>
   */
  java.util.List<? extends io.littlehorse.sdk.common.proto.VarNameAndValOrBuilder> 
      getInputVariablesOrBuilderList();
  /**
   * <code>repeated .littlehorse.VarNameAndVal input_variables = 5;</code>
   */
  io.littlehorse.sdk.common.proto.VarNameAndValOrBuilder getInputVariablesOrBuilder(
      int index);

  /**
   * <code>.littlehorse.TaskRunSource source = 6;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>.littlehorse.TaskRunSource source = 6;</code>
   * @return The source.
   */
  io.littlehorse.sdk.common.proto.TaskRunSource getSource();
  /**
   * <code>.littlehorse.TaskRunSource source = 6;</code>
   */
  io.littlehorse.sdk.common.proto.TaskRunSourceOrBuilder getSourceOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp scheduled_at = 7;</code>
   * @return Whether the scheduledAt field is set.
   */
  boolean hasScheduledAt();
  /**
   * <code>.google.protobuf.Timestamp scheduled_at = 7;</code>
   * @return The scheduledAt.
   */
  com.google.protobuf.Timestamp getScheduledAt();
  /**
   * <code>.google.protobuf.Timestamp scheduled_at = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduledAtOrBuilder();

  /**
   * <code>.littlehorse.TaskStatus status = 8;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.littlehorse.TaskStatus status = 8;</code>
   * @return The status.
   */
  io.littlehorse.sdk.common.proto.TaskStatus getStatus();

  /**
   * <code>int32 timeout_seconds = 9;</code>
   * @return The timeoutSeconds.
   */
  int getTimeoutSeconds();
}
