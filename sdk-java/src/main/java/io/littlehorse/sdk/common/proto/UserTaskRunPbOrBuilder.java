// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.littlehorse.sdk.common.proto;

public interface UserTaskRunPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.UserTaskRunPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.littlehorse.UserTaskRunIdPb id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.littlehorse.UserTaskRunIdPb id = 1;</code>
   * @return The id.
   */
  io.littlehorse.sdk.common.proto.UserTaskRunIdPb getId();
  /**
   * <code>.littlehorse.UserTaskRunIdPb id = 1;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskRunIdPbOrBuilder getIdOrBuilder();

  /**
   * <code>.littlehorse.UserTaskDefIdPb user_task_def_id = 2;</code>
   * @return Whether the userTaskDefId field is set.
   */
  boolean hasUserTaskDefId();
  /**
   * <code>.littlehorse.UserTaskDefIdPb user_task_def_id = 2;</code>
   * @return The userTaskDefId.
   */
  io.littlehorse.sdk.common.proto.UserTaskDefIdPb getUserTaskDefId();
  /**
   * <code>.littlehorse.UserTaskDefIdPb user_task_def_id = 2;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskDefIdPbOrBuilder getUserTaskDefIdOrBuilder();

  /**
   * <code>string specific_user_id = 3;</code>
   * @return Whether the specificUserId field is set.
   */
  boolean hasSpecificUserId();
  /**
   * <code>string specific_user_id = 3;</code>
   * @return The specificUserId.
   */
  java.lang.String getSpecificUserId();
  /**
   * <code>string specific_user_id = 3;</code>
   * @return The bytes for specificUserId.
   */
  com.google.protobuf.ByteString
      getSpecificUserIdBytes();

  /**
   * <code>string user_group = 4;</code>
   * @return Whether the userGroup field is set.
   */
  boolean hasUserGroup();
  /**
   * <code>string user_group = 4;</code>
   * @return The userGroup.
   */
  java.lang.String getUserGroup();
  /**
   * <code>string user_group = 4;</code>
   * @return The bytes for userGroup.
   */
  com.google.protobuf.ByteString
      getUserGroupBytes();

  /**
   * <pre>
   * The task may be in one of two states:
   * 1. Claimed by a specific person.
   * 2. Not yet claimed.
   * </pre>
   *
   * <code>optional string user_id = 5;</code>
   * @return Whether the userId field is set.
   */
  boolean hasUserId();
  /**
   * <pre>
   * The task may be in one of two states:
   * 1. Claimed by a specific person.
   * 2. Not yet claimed.
   * </pre>
   *
   * <code>optional string user_id = 5;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The task may be in one of two states:
   * 1. Claimed by a specific person.
   * 2. Not yet claimed.
   * </pre>
   *
   * <code>optional string user_id = 5;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>repeated .littlehorse.UserTaskFieldResultPb results = 6;</code>
   */
  java.util.List<io.littlehorse.sdk.common.proto.UserTaskFieldResultPb> 
      getResultsList();
  /**
   * <code>repeated .littlehorse.UserTaskFieldResultPb results = 6;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskFieldResultPb getResults(int index);
  /**
   * <code>repeated .littlehorse.UserTaskFieldResultPb results = 6;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .littlehorse.UserTaskFieldResultPb results = 6;</code>
   */
  java.util.List<? extends io.littlehorse.sdk.common.proto.UserTaskFieldResultPbOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .littlehorse.UserTaskFieldResultPb results = 6;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskFieldResultPbOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <code>.littlehorse.UserTaskRunStatusPb status = 7;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.littlehorse.UserTaskRunStatusPb status = 7;</code>
   * @return The status.
   */
  io.littlehorse.sdk.common.proto.UserTaskRunStatusPb getStatus();

  /**
   * <code>repeated .littlehorse.UserTaskEventPb events = 8;</code>
   */
  java.util.List<io.littlehorse.sdk.common.proto.UserTaskEventPb> 
      getEventsList();
  /**
   * <code>repeated .littlehorse.UserTaskEventPb events = 8;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskEventPb getEvents(int index);
  /**
   * <code>repeated .littlehorse.UserTaskEventPb events = 8;</code>
   */
  int getEventsCount();
  /**
   * <code>repeated .littlehorse.UserTaskEventPb events = 8;</code>
   */
  java.util.List<? extends io.littlehorse.sdk.common.proto.UserTaskEventPbOrBuilder> 
      getEventsOrBuilderList();
  /**
   * <code>repeated .littlehorse.UserTaskEventPb events = 8;</code>
   */
  io.littlehorse.sdk.common.proto.UserTaskEventPbOrBuilder getEventsOrBuilder(
      int index);

  /**
   * <code>optional string notes = 9;</code>
   * @return Whether the notes field is set.
   */
  boolean hasNotes();
  /**
   * <code>optional string notes = 9;</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <code>optional string notes = 9;</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <code>.google.protobuf.Timestamp scheduled_time = 10;</code>
   * @return Whether the scheduledTime field is set.
   */
  boolean hasScheduledTime();
  /**
   * <code>.google.protobuf.Timestamp scheduled_time = 10;</code>
   * @return The scheduledTime.
   */
  com.google.protobuf.Timestamp getScheduledTime();
  /**
   * <code>.google.protobuf.Timestamp scheduled_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduledTimeOrBuilder();

  /**
   * <pre>
   * If we ever allow ad-hoc User Tasks, this will move to an optional
   * field, or a `oneof user_task_source` field. However, note that such
   * a change would be fine from the API Compatibility perspective.
   * </pre>
   *
   * <code>.littlehorse.NodeRunIdPb node_run_id = 11;</code>
   * @return Whether the nodeRunId field is set.
   */
  boolean hasNodeRunId();
  /**
   * <pre>
   * If we ever allow ad-hoc User Tasks, this will move to an optional
   * field, or a `oneof user_task_source` field. However, note that such
   * a change would be fine from the API Compatibility perspective.
   * </pre>
   *
   * <code>.littlehorse.NodeRunIdPb node_run_id = 11;</code>
   * @return The nodeRunId.
   */
  io.littlehorse.sdk.common.proto.NodeRunIdPb getNodeRunId();
  /**
   * <pre>
   * If we ever allow ad-hoc User Tasks, this will move to an optional
   * field, or a `oneof user_task_source` field. However, note that such
   * a change would be fine from the API Compatibility perspective.
   * </pre>
   *
   * <code>.littlehorse.NodeRunIdPb node_run_id = 11;</code>
   */
  io.littlehorse.sdk.common.proto.NodeRunIdPbOrBuilder getNodeRunIdOrBuilder();

  public io.littlehorse.sdk.common.proto.UserTaskRunPb.AssignedToCase getAssignedToCase();
}