package com.vpclub.provider.rpc.api;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: Roles.proto")
public class RolesServiceGrpc {

  private RolesServiceGrpc() {}

  public static final String SERVICE_NAME = "RolesService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.vpclub.provider.rpc.api.RolesProto.RolesDTO,
      com.vpclub.provider.rpc.api.RolesProto.RolesResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "RolesService", "add"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.vpclub.provider.rpc.api.RolesProto.RolesDTO,
      com.vpclub.provider.rpc.api.RolesProto.RolesResponse> METHOD_QUERY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "RolesService", "query"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.vpclub.provider.rpc.api.RolesProto.RolesDTO,
      com.vpclub.provider.rpc.api.RolesProto.RolesResponse> METHOD_UPDATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "RolesService", "update"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.vpclub.provider.rpc.api.RolesProto.RolesDTO,
      com.vpclub.provider.rpc.api.RolesProto.RolesResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "RolesService", "delete"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesDTO.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.vpclub.provider.rpc.api.RolesProto.RolesRequest,
      com.vpclub.provider.rpc.api.RolesProto.RolesPageResponse> METHOD_PAGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "RolesService", "page"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.vpclub.provider.rpc.api.RolesProto.RolesPageResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RolesServiceStub newStub(io.grpc.Channel channel) {
    return new RolesServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RolesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RolesServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static RolesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RolesServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RolesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    /**
     */
    public void query(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY, responseObserver);
    }

    /**
     */
    public void update(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void delete(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void page(com.vpclub.provider.rpc.api.RolesProto.RolesRequest request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesPageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PAGE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD,
            asyncUnaryCall(
              new MethodHandlers<
                com.vpclub.provider.rpc.api.RolesProto.RolesDTO,
                com.vpclub.provider.rpc.api.RolesProto.RolesResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            METHOD_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                com.vpclub.provider.rpc.api.RolesProto.RolesDTO,
                com.vpclub.provider.rpc.api.RolesProto.RolesResponse>(
                  this, METHODID_QUERY)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.vpclub.provider.rpc.api.RolesProto.RolesDTO,
                com.vpclub.provider.rpc.api.RolesProto.RolesResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.vpclub.provider.rpc.api.RolesProto.RolesDTO,
                com.vpclub.provider.rpc.api.RolesProto.RolesResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_PAGE,
            asyncUnaryCall(
              new MethodHandlers<
                com.vpclub.provider.rpc.api.RolesProto.RolesRequest,
                com.vpclub.provider.rpc.api.RolesProto.RolesPageResponse>(
                  this, METHODID_PAGE)))
          .build();
    }
  }

  /**
   */
  public static final class RolesServiceStub extends io.grpc.stub.AbstractStub<RolesServiceStub> {
    private RolesServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RolesServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RolesServiceStub(channel, callOptions);
    }

    /**
     */
    public void add(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void query(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void page(com.vpclub.provider.rpc.api.RolesProto.RolesRequest request,
        io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesPageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PAGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RolesServiceBlockingStub extends io.grpc.stub.AbstractStub<RolesServiceBlockingStub> {
    private RolesServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RolesServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RolesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vpclub.provider.rpc.api.RolesProto.RolesResponse add(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }

    /**
     */
    public com.vpclub.provider.rpc.api.RolesProto.RolesResponse query(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY, getCallOptions(), request);
    }

    /**
     */
    public com.vpclub.provider.rpc.api.RolesProto.RolesResponse update(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public com.vpclub.provider.rpc.api.RolesProto.RolesResponse delete(com.vpclub.provider.rpc.api.RolesProto.RolesDTO request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public com.vpclub.provider.rpc.api.RolesProto.RolesPageResponse page(com.vpclub.provider.rpc.api.RolesProto.RolesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PAGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RolesServiceFutureStub extends io.grpc.stub.AbstractStub<RolesServiceFutureStub> {
    private RolesServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RolesServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RolesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> add(
        com.vpclub.provider.rpc.api.RolesProto.RolesDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> query(
        com.vpclub.provider.rpc.api.RolesProto.RolesDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> update(
        com.vpclub.provider.rpc.api.RolesProto.RolesDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vpclub.provider.rpc.api.RolesProto.RolesResponse> delete(
        com.vpclub.provider.rpc.api.RolesProto.RolesDTO request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vpclub.provider.rpc.api.RolesProto.RolesPageResponse> page(
        com.vpclub.provider.rpc.api.RolesProto.RolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PAGE, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_QUERY = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_PAGE = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RolesServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(RolesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.vpclub.provider.rpc.api.RolesProto.RolesDTO) request,
              (io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((com.vpclub.provider.rpc.api.RolesProto.RolesDTO) request,
              (io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.vpclub.provider.rpc.api.RolesProto.RolesDTO) request,
              (io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.vpclub.provider.rpc.api.RolesProto.RolesDTO) request,
              (io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesResponse>) responseObserver);
          break;
        case METHODID_PAGE:
          serviceImpl.page((com.vpclub.provider.rpc.api.RolesProto.RolesRequest) request,
              (io.grpc.stub.StreamObserver<com.vpclub.provider.rpc.api.RolesProto.RolesPageResponse>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_ADD,
        METHOD_QUERY,
        METHOD_UPDATE,
        METHOD_DELETE,
        METHOD_PAGE);
  }

}
