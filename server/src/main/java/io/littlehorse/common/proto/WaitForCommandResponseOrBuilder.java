// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: interactive_query.proto

package io.littlehorse.common.proto;

public interface WaitForCommandResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:littlehorse.WaitForCommandResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string command_id = 1;</code>
   * @return The commandId.
   */
  java.lang.String getCommandId();
  /**
   * <code>string command_id = 1;</code>
   * @return The bytes for commandId.
   */
  com.google.protobuf.ByteString
      getCommandIdBytes();

  /**
   * <code>.google.protobuf.Timestamp result_time = 2;</code>
   * @return Whether the resultTime field is set.
   */
  boolean hasResultTime();
  /**
   * <code>.google.protobuf.Timestamp result_time = 2;</code>
   * @return The resultTime.
   */
  com.google.protobuf.Timestamp getResultTime();
  /**
   * <code>.google.protobuf.Timestamp result_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getResultTimeOrBuilder();

  /**
   * <code>bytes result = 3;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>bytes result = 3;</code>
   * @return The result.
   */
  com.google.protobuf.ByteString getResult();

  /**
   * <code>.littlehorse.WaitForCommandResponse.PartitionMigratedResponse partition_migrated_response = 4;</code>
   * @return Whether the partitionMigratedResponse field is set.
   */
  boolean hasPartitionMigratedResponse();
  /**
   * <code>.littlehorse.WaitForCommandResponse.PartitionMigratedResponse partition_migrated_response = 4;</code>
   * @return The partitionMigratedResponse.
   */
  io.littlehorse.common.proto.WaitForCommandResponse.PartitionMigratedResponse getPartitionMigratedResponse();
  /**
   * <code>.littlehorse.WaitForCommandResponse.PartitionMigratedResponse partition_migrated_response = 4;</code>
   */
  io.littlehorse.common.proto.WaitForCommandResponse.PartitionMigratedResponseOrBuilder getPartitionMigratedResponseOrBuilder();

  io.littlehorse.common.proto.WaitForCommandResponse.YieldCase getYieldCase();
}
