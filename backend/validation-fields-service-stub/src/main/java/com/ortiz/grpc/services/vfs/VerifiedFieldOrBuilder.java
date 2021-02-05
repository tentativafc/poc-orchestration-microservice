// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validation-fields-service.proto

package com.ortiz.grpc.services.vfs;

public interface VerifiedFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.VerifiedField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <code>.google.protobuf.StringValue tenantId = 2;</code>
   * @return Whether the tenantId field is set.
   */
  boolean hasTenantId();
  /**
   * <code>.google.protobuf.StringValue tenantId = 2;</code>
   * @return The tenantId.
   */
  com.google.protobuf.StringValue getTenantId();
  /**
   * <code>.google.protobuf.StringValue tenantId = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTenantIdOrBuilder();

  /**
   * <code>.google.protobuf.StringValue personId = 3;</code>
   * @return Whether the personId field is set.
   */
  boolean hasPersonId();
  /**
   * <code>.google.protobuf.StringValue personId = 3;</code>
   * @return The personId.
   */
  com.google.protobuf.StringValue getPersonId();
  /**
   * <code>.google.protobuf.StringValue personId = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPersonIdOrBuilder();

  /**
   * <code>.google.protobuf.StringValue fieldName = 4;</code>
   * @return Whether the fieldName field is set.
   */
  boolean hasFieldName();
  /**
   * <code>.google.protobuf.StringValue fieldName = 4;</code>
   * @return The fieldName.
   */
  com.google.protobuf.StringValue getFieldName();
  /**
   * <code>.google.protobuf.StringValue fieldName = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFieldNameOrBuilder();

  /**
   * <code>.google.protobuf.StringValue fieldValue = 5;</code>
   * @return Whether the fieldValue field is set.
   */
  boolean hasFieldValue();
  /**
   * <code>.google.protobuf.StringValue fieldValue = 5;</code>
   * @return The fieldValue.
   */
  com.google.protobuf.StringValue getFieldValue();
  /**
   * <code>.google.protobuf.StringValue fieldValue = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFieldValueOrBuilder();

  /**
   * <code>.google.protobuf.Int32Value level = 6;</code>
   * @return Whether the level field is set.
   */
  boolean hasLevel();
  /**
   * <code>.google.protobuf.Int32Value level = 6;</code>
   * @return The level.
   */
  com.google.protobuf.Int32Value getLevel();
  /**
   * <code>.google.protobuf.Int32Value level = 6;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getLevelOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue validated = 7;</code>
   * @return Whether the validated field is set.
   */
  boolean hasValidated();
  /**
   * <code>.google.protobuf.BoolValue validated = 7;</code>
   * @return The validated.
   */
  com.google.protobuf.BoolValue getValidated();
  /**
   * <code>.google.protobuf.BoolValue validated = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getValidatedOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue serverValidated = 8;</code>
   * @return Whether the serverValidated field is set.
   */
  boolean hasServerValidated();
  /**
   * <code>.google.protobuf.BoolValue serverValidated = 8;</code>
   * @return The serverValidated.
   */
  com.google.protobuf.BoolValue getServerValidated();
  /**
   * <code>.google.protobuf.BoolValue serverValidated = 8;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getServerValidatedOrBuilder();

  /**
   * <code>.google.protobuf.StringValue cause = 9;</code>
   * @return Whether the cause field is set.
   */
  boolean hasCause();
  /**
   * <code>.google.protobuf.StringValue cause = 9;</code>
   * @return The cause.
   */
  com.google.protobuf.StringValue getCause();
  /**
   * <code>.google.protobuf.StringValue cause = 9;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCauseOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp createdDate = 10;</code>
   * @return Whether the createdDate field is set.
   */
  boolean hasCreatedDate();
  /**
   * <code>.google.protobuf.Timestamp createdDate = 10;</code>
   * @return The createdDate.
   */
  com.google.protobuf.Timestamp getCreatedDate();
  /**
   * <code>.google.protobuf.Timestamp createdDate = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedDateOrBuilder();
}
