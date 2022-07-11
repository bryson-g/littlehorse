// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lh_proto.proto

package io.littlehorse.common.proto;

public interface TaskScheduleRequestPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.TaskScheduleRequestPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string task_def_id = 1;</code>
   * @return The taskDefId.
   */
  java.lang.String getTaskDefId();
  /**
   * <code>string task_def_id = 1;</code>
   * @return The bytes for taskDefId.
   */
  com.google.protobuf.ByteString
      getTaskDefIdBytes();

  /**
   * <code>string task_def_name = 2;</code>
   * @return The taskDefName.
   */
  java.lang.String getTaskDefName();
  /**
   * <code>string task_def_name = 2;</code>
   * @return The bytes for taskDefName.
   */
  com.google.protobuf.ByteString
      getTaskDefNameBytes();

  /**
   * <code>int32 thread_run_number = 4;</code>
   * @return The threadRunNumber.
   */
  int getThreadRunNumber();

  /**
   * <code>int32 task_run_number = 5;</code>
   * @return The taskRunNumber.
   */
  int getTaskRunNumber();

  /**
   * <code>int32 task_run_position = 6;</code>
   * @return The taskRunPosition.
   */
  int getTaskRunPosition();

  /**
   * <code>string wf_run_id = 7;</code>
   * @return The wfRunId.
   */
  java.lang.String getWfRunId();
  /**
   * <code>string wf_run_id = 7;</code>
   * @return The bytes for wfRunId.
   */
  com.google.protobuf.ByteString
      getWfRunIdBytes();

  /**
   * <code>string reply_kafka_topic = 8;</code>
   * @return The replyKafkaTopic.
   */
  java.lang.String getReplyKafkaTopic();
  /**
   * <code>string reply_kafka_topic = 8;</code>
   * @return The bytes for replyKafkaTopic.
   */
  com.google.protobuf.ByteString
      getReplyKafkaTopicBytes();

  /**
   * <code>string wf_spec_id = 9;</code>
   * @return The wfSpecId.
   */
  java.lang.String getWfSpecId();
  /**
   * <code>string wf_spec_id = 9;</code>
   * @return The bytes for wfSpecId.
   */
  com.google.protobuf.ByteString
      getWfSpecIdBytes();
}
