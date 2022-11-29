// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: internal_server.proto

package io.littlehorse.common.proto;

public interface CentralStoreQueryPbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.CentralStoreQueryPb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enable_stale_stores = 1;</code>
   * @return The enableStaleStores.
   */
  boolean getEnableStaleStores();

  /**
   * <code>int32 specific_partition = 2;</code>
   * @return Whether the specificPartition field is set.
   */
  boolean hasSpecificPartition();
  /**
   * <code>int32 specific_partition = 2;</code>
   * @return The specificPartition.
   */
  int getSpecificPartition();

  /**
   * <code>.lh_proto.CentralStoreQueryPb.CentralStoreSubQueryPb query = 3;</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <code>.lh_proto.CentralStoreQueryPb.CentralStoreSubQueryPb query = 3;</code>
   * @return The query.
   */
  io.littlehorse.common.proto.CentralStoreQueryPb.CentralStoreSubQueryPb getQuery();
  /**
   * <code>.lh_proto.CentralStoreQueryPb.CentralStoreSubQueryPb query = 3;</code>
   */
  io.littlehorse.common.proto.CentralStoreQueryPb.CentralStoreSubQueryPbOrBuilder getQueryOrBuilder();
}