// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

public interface TaskRunPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.TaskRunPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string wf_run_id = 1;</code>
   * @return The wfRunId.
   */
  java.lang.String getWfRunId();
  /**
   * <code>string wf_run_id = 1;</code>
   * @return The bytes for wfRunId.
   */
  com.google.protobuf.ByteString
      getWfRunIdBytes();

  /**
   * <code>int32 thread_run_number = 2;</code>
   * @return The threadRunNumber.
   */
  int getThreadRunNumber();

  /**
   * <code>int32 order_position = 3;</code>
   * @return The orderPosition.
   */
  int getOrderPosition();

  /**
   * <code>int32 number = 4;</code>
   * @return The number.
   */
  int getNumber();

  /**
   * <code>string node_name = 5;</code>
   * @return The nodeName.
   */
  java.lang.String getNodeName();
  /**
   * <code>string node_name = 5;</code>
   * @return The bytes for nodeName.
   */
  com.google.protobuf.ByteString
      getNodeNameBytes();

  /**
   * <code>string node_id = 6;</code>
   * @return The nodeId.
   */
  java.lang.String getNodeId();
  /**
   * <code>string node_id = 6;</code>
   * @return The bytes for nodeId.
   */
  com.google.protobuf.ByteString
      getNodeIdBytes();

  /**
   * <code>string task_def_id = 7;</code>
   * @return The taskDefId.
   */
  java.lang.String getTaskDefId();
  /**
   * <code>string task_def_id = 7;</code>
   * @return The bytes for taskDefId.
   */
  com.google.protobuf.ByteString
      getTaskDefIdBytes();

  /**
   * <code>string worker_id = 8;</code>
   * @return Whether the workerId field is set.
   */
  boolean hasWorkerId();
  /**
   * <code>string worker_id = 8;</code>
   * @return The workerId.
   */
  java.lang.String getWorkerId();
  /**
   * <code>string worker_id = 8;</code>
   * @return The bytes for workerId.
   */
  com.google.protobuf.ByteString
      getWorkerIdBytes();

  /**
   * <code>int32 attempt_number = 9;</code>
   * @return The attemptNumber.
   */
  int getAttemptNumber();

  /**
   * <code>.lh_proto.LHStatusPb status = 10;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.lh_proto.LHStatusPb status = 10;</code>
   * @return The status.
   */
  io.littlehorse.common.proto.LHStatusPb getStatus();

  /**
   * <code>bytes stdout = 11;</code>
   * @return Whether the stdout field is set.
   */
  boolean hasStdout();
  /**
   * <code>bytes stdout = 11;</code>
   * @return The stdout.
   */
  com.google.protobuf.ByteString getStdout();

  /**
   * <code>bytes stderr = 12;</code>
   * @return Whether the stderr field is set.
   */
  boolean hasStderr();
  /**
   * <code>bytes stderr = 12;</code>
   * @return The stderr.
   */
  com.google.protobuf.ByteString getStderr();

  /**
   * <code>int32 return_code = 13;</code>
   * @return Whether the returnCode field is set.
   */
  boolean hasReturnCode();
  /**
   * <code>int32 return_code = 13;</code>
   * @return The returnCode.
   */
  int getReturnCode();

  /**
   * <code>.google.protobuf.Timestamp scheduled_time = 14;</code>
   * @return Whether the scheduledTime field is set.
   */
  boolean hasScheduledTime();
  /**
   * <code>.google.protobuf.Timestamp scheduled_time = 14;</code>
   * @return The scheduledTime.
   */
  com.google.protobuf.Timestamp getScheduledTime();
  /**
   * <code>.google.protobuf.Timestamp scheduled_time = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduledTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp started_time = 15;</code>
   * @return Whether the startedTime field is set.
   */
  boolean hasStartedTime();
  /**
   * <code>.google.protobuf.Timestamp started_time = 15;</code>
   * @return The startedTime.
   */
  com.google.protobuf.Timestamp getStartedTime();
  /**
   * <code>.google.protobuf.Timestamp started_time = 15;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartedTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp ended_time = 16;</code>
   * @return Whether the endedTime field is set.
   */
  boolean hasEndedTime();
  /**
   * <code>.google.protobuf.Timestamp ended_time = 16;</code>
   * @return The endedTime.
   */
  com.google.protobuf.Timestamp getEndedTime();
  /**
   * <code>.google.protobuf.Timestamp ended_time = 16;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndedTimeOrBuilder();
}
