package com.ortiz.grpc.services.vfs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: validation-fields-service.proto")
public final class ValidationFieldsServiceGrpc {

  private ValidationFieldsServiceGrpc() {}

  public static final String SERVICE_NAME = "services.ValidationFieldsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ortiz.grpc.services.vfs.VerfieldFields,
      com.ortiz.grpc.services.vfs.VerfieldFields> getSaveVerifiedFieldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveVerifiedFields",
      requestType = com.ortiz.grpc.services.vfs.VerfieldFields.class,
      responseType = com.ortiz.grpc.services.vfs.VerfieldFields.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ortiz.grpc.services.vfs.VerfieldFields,
      com.ortiz.grpc.services.vfs.VerfieldFields> getSaveVerifiedFieldsMethod() {
    io.grpc.MethodDescriptor<com.ortiz.grpc.services.vfs.VerfieldFields, com.ortiz.grpc.services.vfs.VerfieldFields> getSaveVerifiedFieldsMethod;
    if ((getSaveVerifiedFieldsMethod = ValidationFieldsServiceGrpc.getSaveVerifiedFieldsMethod) == null) {
      synchronized (ValidationFieldsServiceGrpc.class) {
        if ((getSaveVerifiedFieldsMethod = ValidationFieldsServiceGrpc.getSaveVerifiedFieldsMethod) == null) {
          ValidationFieldsServiceGrpc.getSaveVerifiedFieldsMethod = getSaveVerifiedFieldsMethod =
              io.grpc.MethodDescriptor.<com.ortiz.grpc.services.vfs.VerfieldFields, com.ortiz.grpc.services.vfs.VerfieldFields>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveVerifiedFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ortiz.grpc.services.vfs.VerfieldFields.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ortiz.grpc.services.vfs.VerfieldFields.getDefaultInstance()))
              .setSchemaDescriptor(new ValidationFieldsServiceMethodDescriptorSupplier("SaveVerifiedFields"))
              .build();
        }
      }
    }
    return getSaveVerifiedFieldsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValidationFieldsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidationFieldsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidationFieldsServiceStub>() {
        @java.lang.Override
        public ValidationFieldsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidationFieldsServiceStub(channel, callOptions);
        }
      };
    return ValidationFieldsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValidationFieldsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidationFieldsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidationFieldsServiceBlockingStub>() {
        @java.lang.Override
        public ValidationFieldsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidationFieldsServiceBlockingStub(channel, callOptions);
        }
      };
    return ValidationFieldsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValidationFieldsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ValidationFieldsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ValidationFieldsServiceFutureStub>() {
        @java.lang.Override
        public ValidationFieldsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ValidationFieldsServiceFutureStub(channel, callOptions);
        }
      };
    return ValidationFieldsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ValidationFieldsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveVerifiedFields(com.ortiz.grpc.services.vfs.VerfieldFields request,
        io.grpc.stub.StreamObserver<com.ortiz.grpc.services.vfs.VerfieldFields> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveVerifiedFieldsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveVerifiedFieldsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ortiz.grpc.services.vfs.VerfieldFields,
                com.ortiz.grpc.services.vfs.VerfieldFields>(
                  this, METHODID_SAVE_VERIFIED_FIELDS)))
          .build();
    }
  }

  /**
   */
  public static final class ValidationFieldsServiceStub extends io.grpc.stub.AbstractAsyncStub<ValidationFieldsServiceStub> {
    private ValidationFieldsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationFieldsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidationFieldsServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveVerifiedFields(com.ortiz.grpc.services.vfs.VerfieldFields request,
        io.grpc.stub.StreamObserver<com.ortiz.grpc.services.vfs.VerfieldFields> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveVerifiedFieldsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ValidationFieldsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ValidationFieldsServiceBlockingStub> {
    private ValidationFieldsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationFieldsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidationFieldsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ortiz.grpc.services.vfs.VerfieldFields saveVerifiedFields(com.ortiz.grpc.services.vfs.VerfieldFields request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveVerifiedFieldsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ValidationFieldsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ValidationFieldsServiceFutureStub> {
    private ValidationFieldsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidationFieldsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ValidationFieldsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ortiz.grpc.services.vfs.VerfieldFields> saveVerifiedFields(
        com.ortiz.grpc.services.vfs.VerfieldFields request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveVerifiedFieldsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_VERIFIED_FIELDS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ValidationFieldsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ValidationFieldsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_VERIFIED_FIELDS:
          serviceImpl.saveVerifiedFields((com.ortiz.grpc.services.vfs.VerfieldFields) request,
              (io.grpc.stub.StreamObserver<com.ortiz.grpc.services.vfs.VerfieldFields>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ValidationFieldsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValidationFieldsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ortiz.grpc.services.vfs.ValidationFieldsServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ValidationFieldsService");
    }
  }

  private static final class ValidationFieldsServiceFileDescriptorSupplier
      extends ValidationFieldsServiceBaseDescriptorSupplier {
    ValidationFieldsServiceFileDescriptorSupplier() {}
  }

  private static final class ValidationFieldsServiceMethodDescriptorSupplier
      extends ValidationFieldsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ValidationFieldsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ValidationFieldsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValidationFieldsServiceFileDescriptorSupplier())
              .addMethod(getSaveVerifiedFieldsMethod())
              .build();
        }
      }
    }
    return result;
  }
}