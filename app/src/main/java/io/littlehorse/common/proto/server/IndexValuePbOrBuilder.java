// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server.proto

package io.littlehorse.common.proto.server;

public interface IndexValuePbOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lh_proto.IndexValuePb)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string store_key = 1;</code>
   * @return A list containing the storeKey.
   */
  java.util.List<java.lang.String>
      getStoreKeyList();
  /**
   * <code>repeated string store_key = 1;</code>
   * @return The count of storeKey.
   */
  int getStoreKeyCount();
  /**
   * <code>repeated string store_key = 1;</code>
   * @param index The index of the element to return.
   * @return The storeKey at the given index.
   */
  java.lang.String getStoreKey(int index);
  /**
   * <code>repeated string store_key = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the storeKey at the given index.
   */
  com.google.protobuf.ByteString
      getStoreKeyBytes(int index);
}
