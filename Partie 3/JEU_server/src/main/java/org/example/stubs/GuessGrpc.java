package org.example.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: guess.proto")
public final class GuessGrpc {

  private GuessGrpc() {}

  public static final String SERVICE_NAME = "Guess";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.stubs.GuessOuterClass.Empty,
      org.example.stubs.GuessOuterClass.Result> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = org.example.stubs.GuessOuterClass.Empty.class,
      responseType = org.example.stubs.GuessOuterClass.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.stubs.GuessOuterClass.Empty,
      org.example.stubs.GuessOuterClass.Result> getStartMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.GuessOuterClass.Empty, org.example.stubs.GuessOuterClass.Result> getStartMethod;
    if ((getStartMethod = GuessGrpc.getStartMethod) == null) {
      synchronized (GuessGrpc.class) {
        if ((getStartMethod = GuessGrpc.getStartMethod) == null) {
          GuessGrpc.getStartMethod = getStartMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.GuessOuterClass.Empty, org.example.stubs.GuessOuterClass.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Guess", "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.GuessOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.GuessOuterClass.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new GuessMethodDescriptorSupplier("Start"))
                  .build();
          }
        }
     }
     return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.GuessOuterClass.GuessRequest,
      org.example.stubs.GuessOuterClass.Result> getGuessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Guess",
      requestType = org.example.stubs.GuessOuterClass.GuessRequest.class,
      responseType = org.example.stubs.GuessOuterClass.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.stubs.GuessOuterClass.GuessRequest,
      org.example.stubs.GuessOuterClass.Result> getGuessMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.GuessOuterClass.GuessRequest, org.example.stubs.GuessOuterClass.Result> getGuessMethod;
    if ((getGuessMethod = GuessGrpc.getGuessMethod) == null) {
      synchronized (GuessGrpc.class) {
        if ((getGuessMethod = GuessGrpc.getGuessMethod) == null) {
          GuessGrpc.getGuessMethod = getGuessMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.GuessOuterClass.GuessRequest, org.example.stubs.GuessOuterClass.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Guess", "Guess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.GuessOuterClass.GuessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.GuessOuterClass.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new GuessMethodDescriptorSupplier("Guess"))
                  .build();
          }
        }
     }
     return getGuessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.GuessOuterClass.Empty,
      org.example.stubs.GuessOuterClass.Result> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = org.example.stubs.GuessOuterClass.Empty.class,
      responseType = org.example.stubs.GuessOuterClass.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.GuessOuterClass.Empty,
      org.example.stubs.GuessOuterClass.Result> getStopMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.GuessOuterClass.Empty, org.example.stubs.GuessOuterClass.Result> getStopMethod;
    if ((getStopMethod = GuessGrpc.getStopMethod) == null) {
      synchronized (GuessGrpc.class) {
        if ((getStopMethod = GuessGrpc.getStopMethod) == null) {
          GuessGrpc.getStopMethod = getStopMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.GuessOuterClass.Empty, org.example.stubs.GuessOuterClass.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Guess", "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.GuessOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.GuessOuterClass.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new GuessMethodDescriptorSupplier("Stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GuessStub newStub(io.grpc.Channel channel) {
    return new GuessStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GuessBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GuessBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GuessFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GuessFutureStub(channel);
  }

  /**
   */
  public static abstract class GuessImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * The server generates a random number between 1 and 1000
     * </pre>
     */
    public void start(org.example.stubs.GuessOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * The client guesses a number and the server responds with a hint
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.GuessRequest> guess(
        io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.Result> responseObserver) {
      return asyncUnimplementedStreamingCall(getGuessMethod(), responseObserver);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public void stop(org.example.stubs.GuessOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.stubs.GuessOuterClass.Empty,
                org.example.stubs.GuessOuterClass.Result>(
                  this, METHODID_START)))
          .addMethod(
            getGuessMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.stubs.GuessOuterClass.GuessRequest,
                org.example.stubs.GuessOuterClass.Result>(
                  this, METHODID_GUESS)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.GuessOuterClass.Empty,
                org.example.stubs.GuessOuterClass.Result>(
                  this, METHODID_STOP)))
          .build();
    }
  }

  /**
   */
  public static final class GuessStub extends io.grpc.stub.AbstractStub<GuessStub> {
    private GuessStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GuessStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GuessStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GuessStub(channel, callOptions);
    }

    /**
     * <pre>
     * The server generates a random number between 1 and 1000
     * </pre>
     */
    public void start(org.example.stubs.GuessOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.Result> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The client guesses a number and the server responds with a hint
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.GuessRequest> guess(
        io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.Result> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGuessMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public void stop(org.example.stubs.GuessOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GuessBlockingStub extends io.grpc.stub.AbstractStub<GuessBlockingStub> {
    private GuessBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GuessBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GuessBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GuessBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * The server generates a random number between 1 and 1000
     * </pre>
     */
    public java.util.Iterator<org.example.stubs.GuessOuterClass.Result> start(
        org.example.stubs.GuessOuterClass.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public org.example.stubs.GuessOuterClass.Result stop(org.example.stubs.GuessOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GuessFutureStub extends io.grpc.stub.AbstractStub<GuessFutureStub> {
    private GuessFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GuessFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GuessFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GuessFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.GuessOuterClass.Result> stop(
        org.example.stubs.GuessOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START = 0;
  private static final int METHODID_STOP = 1;
  private static final int METHODID_GUESS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GuessImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GuessImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START:
          serviceImpl.start((org.example.stubs.GuessOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.Result>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((org.example.stubs.GuessOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.Result>) responseObserver);
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
        case METHODID_GUESS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.guess(
              (io.grpc.stub.StreamObserver<org.example.stubs.GuessOuterClass.Result>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GuessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GuessBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.stubs.GuessOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Guess");
    }
  }

  private static final class GuessFileDescriptorSupplier
      extends GuessBaseDescriptorSupplier {
    GuessFileDescriptorSupplier() {}
  }

  private static final class GuessMethodDescriptorSupplier
      extends GuessBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GuessMethodDescriptorSupplier(String methodName) {
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
      synchronized (GuessGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GuessFileDescriptorSupplier())
              .addMethod(getStartMethod())
              .addMethod(getGuessMethod())
              .addMethod(getStopMethod())
              .build();
        }
      }
    }
    return result;
  }
}
