// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validation-fields-service.proto

package com.ortiz.grpc.services.vfs;

public final class ValidationFieldsServiceOuterClass {
  private ValidationFieldsServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_VerfieldFields_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_VerfieldFields_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_VerifiedField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_VerifiedField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037validation-fields-service.proto\022\010servi" +
      "ces\032\037google/protobuf/timestamp.proto\"A\n\016" +
      "VerfieldFields\022/\n\016verifiedFields\030\001 \003(\0132\027" +
      ".services.VerifiedField\"\271\001\n\rVerifiedFiel" +
      "d\022\n\n\002id\030\001 \001(\003\022\020\n\010tenantId\030\002 \001(\t\022\020\n\010perso" +
      "nId\030\003 \001(\t\022\021\n\tfieldName\030\004 \001(\t\022\022\n\nfieldVal" +
      "ue\030\005 \001(\t\022\r\n\005level\030\006 \001(\005\022\021\n\tvalidated\030\007 \001" +
      "(\010\022/\n\013createdDate\030\010 \001(\0132\032.google.protobu" +
      "f.Timestamp2e\n\027ValidationFieldsService\022J" +
      "\n\022SaveVerifiedFields\022\030.services.Verfield" +
      "Fields\032\030.services.VerfieldFields\"\000B\037\n\033co" +
      "m.ortiz.grpc.services.vfsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_services_VerfieldFields_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_VerfieldFields_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_VerfieldFields_descriptor,
        new java.lang.String[] { "VerifiedFields", });
    internal_static_services_VerifiedField_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_VerifiedField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_VerifiedField_descriptor,
        new java.lang.String[] { "Id", "TenantId", "PersonId", "FieldName", "FieldValue", "Level", "Validated", "CreatedDate", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}