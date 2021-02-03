// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data-service.proto

package com.ortiz.grpc.services;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tenantId = 1;</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <code>string tenantId = 1;</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();

  /**
   * <code>string personId = 2;</code>
   * @return The personId.
   */
  java.lang.String getPersonId();
  /**
   * <code>string personId = 2;</code>
   * @return The bytes for personId.
   */
  com.google.protobuf.ByteString
      getPersonIdBytes();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string type = 4;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 4;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string cpfCnpj = 5;</code>
   * @return The cpfCnpj.
   */
  java.lang.String getCpfCnpj();
  /**
   * <code>string cpfCnpj = 5;</code>
   * @return The bytes for cpfCnpj.
   */
  com.google.protobuf.ByteString
      getCpfCnpjBytes();

  /**
   * <code>repeated .services.Phone phones = 6;</code>
   */
  java.util.List<com.ortiz.grpc.services.Phone> 
      getPhonesList();
  /**
   * <code>repeated .services.Phone phones = 6;</code>
   */
  com.ortiz.grpc.services.Phone getPhones(int index);
  /**
   * <code>repeated .services.Phone phones = 6;</code>
   */
  int getPhonesCount();
  /**
   * <code>repeated .services.Phone phones = 6;</code>
   */
  java.util.List<? extends com.ortiz.grpc.services.PhoneOrBuilder> 
      getPhonesOrBuilderList();
  /**
   * <code>repeated .services.Phone phones = 6;</code>
   */
  com.ortiz.grpc.services.PhoneOrBuilder getPhonesOrBuilder(
      int index);
}
