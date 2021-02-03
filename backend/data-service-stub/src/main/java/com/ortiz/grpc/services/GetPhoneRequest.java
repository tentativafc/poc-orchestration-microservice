// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data-service.proto

package com.ortiz.grpc.services;

/**
 * Protobuf type {@code services.GetPhoneRequest}
 */
public final class GetPhoneRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.GetPhoneRequest)
    GetPhoneRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPhoneRequest.newBuilder() to construct.
  private GetPhoneRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPhoneRequest() {
    phoneId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPhoneRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetPhoneRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            phoneId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ortiz.grpc.services.DataServiceOuterClass.internal_static_services_GetPhoneRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ortiz.grpc.services.DataServiceOuterClass.internal_static_services_GetPhoneRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ortiz.grpc.services.GetPhoneRequest.class, com.ortiz.grpc.services.GetPhoneRequest.Builder.class);
  }

  public static final int PHONEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object phoneId_;
  /**
   * <code>string phoneId = 1;</code>
   * @return The phoneId.
   */
  @java.lang.Override
  public java.lang.String getPhoneId() {
    java.lang.Object ref = phoneId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phoneId_ = s;
      return s;
    }
  }
  /**
   * <code>string phoneId = 1;</code>
   * @return The bytes for phoneId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhoneIdBytes() {
    java.lang.Object ref = phoneId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phoneId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPhoneIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phoneId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPhoneIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phoneId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ortiz.grpc.services.GetPhoneRequest)) {
      return super.equals(obj);
    }
    com.ortiz.grpc.services.GetPhoneRequest other = (com.ortiz.grpc.services.GetPhoneRequest) obj;

    if (!getPhoneId()
        .equals(other.getPhoneId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PHONEID_FIELD_NUMBER;
    hash = (53 * hash) + getPhoneId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ortiz.grpc.services.GetPhoneRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ortiz.grpc.services.GetPhoneRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code services.GetPhoneRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.GetPhoneRequest)
      com.ortiz.grpc.services.GetPhoneRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ortiz.grpc.services.DataServiceOuterClass.internal_static_services_GetPhoneRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ortiz.grpc.services.DataServiceOuterClass.internal_static_services_GetPhoneRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ortiz.grpc.services.GetPhoneRequest.class, com.ortiz.grpc.services.GetPhoneRequest.Builder.class);
    }

    // Construct using com.ortiz.grpc.services.GetPhoneRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      phoneId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ortiz.grpc.services.DataServiceOuterClass.internal_static_services_GetPhoneRequest_descriptor;
    }

    @java.lang.Override
    public com.ortiz.grpc.services.GetPhoneRequest getDefaultInstanceForType() {
      return com.ortiz.grpc.services.GetPhoneRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ortiz.grpc.services.GetPhoneRequest build() {
      com.ortiz.grpc.services.GetPhoneRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ortiz.grpc.services.GetPhoneRequest buildPartial() {
      com.ortiz.grpc.services.GetPhoneRequest result = new com.ortiz.grpc.services.GetPhoneRequest(this);
      result.phoneId_ = phoneId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ortiz.grpc.services.GetPhoneRequest) {
        return mergeFrom((com.ortiz.grpc.services.GetPhoneRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ortiz.grpc.services.GetPhoneRequest other) {
      if (other == com.ortiz.grpc.services.GetPhoneRequest.getDefaultInstance()) return this;
      if (!other.getPhoneId().isEmpty()) {
        phoneId_ = other.phoneId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ortiz.grpc.services.GetPhoneRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ortiz.grpc.services.GetPhoneRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object phoneId_ = "";
    /**
     * <code>string phoneId = 1;</code>
     * @return The phoneId.
     */
    public java.lang.String getPhoneId() {
      java.lang.Object ref = phoneId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phoneId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string phoneId = 1;</code>
     * @return The bytes for phoneId.
     */
    public com.google.protobuf.ByteString
        getPhoneIdBytes() {
      java.lang.Object ref = phoneId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phoneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string phoneId = 1;</code>
     * @param value The phoneId to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phoneId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string phoneId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoneId() {
      
      phoneId_ = getDefaultInstance().getPhoneId();
      onChanged();
      return this;
    }
    /**
     * <code>string phoneId = 1;</code>
     * @param value The bytes for phoneId to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phoneId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:services.GetPhoneRequest)
  }

  // @@protoc_insertion_point(class_scope:services.GetPhoneRequest)
  private static final com.ortiz.grpc.services.GetPhoneRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ortiz.grpc.services.GetPhoneRequest();
  }

  public static com.ortiz.grpc.services.GetPhoneRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPhoneRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPhoneRequest>() {
    @java.lang.Override
    public GetPhoneRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetPhoneRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPhoneRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPhoneRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ortiz.grpc.services.GetPhoneRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
