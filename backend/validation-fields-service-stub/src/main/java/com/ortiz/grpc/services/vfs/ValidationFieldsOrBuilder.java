// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validation-fields-service.proto

package com.ortiz.grpc.services.vfs;

public interface ValidationFieldsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.ValidationFields)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .services.ValidationField verifiedFields = 1;</code>
   */
  java.util.List<com.ortiz.grpc.services.vfs.ValidationField> 
      getVerifiedFieldsList();
  /**
   * <code>repeated .services.ValidationField verifiedFields = 1;</code>
   */
  com.ortiz.grpc.services.vfs.ValidationField getVerifiedFields(int index);
  /**
   * <code>repeated .services.ValidationField verifiedFields = 1;</code>
   */
  int getVerifiedFieldsCount();
  /**
   * <code>repeated .services.ValidationField verifiedFields = 1;</code>
   */
  java.util.List<? extends com.ortiz.grpc.services.vfs.ValidationFieldOrBuilder> 
      getVerifiedFieldsOrBuilderList();
  /**
   * <code>repeated .services.ValidationField verifiedFields = 1;</code>
   */
  com.ortiz.grpc.services.vfs.ValidationFieldOrBuilder getVerifiedFieldsOrBuilder(
      int index);
}
