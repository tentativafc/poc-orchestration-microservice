// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data-service.proto

package com.ortiz.grpc.services;

public interface PhoneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.Phone)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>int32 ddi = 2;</code>
   * @return The ddi.
   */
  int getDdi();

  /**
   * <code>int32 ddd = 3;</code>
   * @return The ddd.
   */
  int getDdd();

  /**
   * <code>int32 number = 4;</code>
   * @return The number.
   */
  int getNumber();

  /**
   * <code>int32 extensionLine = 5;</code>
   * @return The extensionLine.
   */
  int getExtensionLine();
}