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
public final class gameGrpc {

  private gameGrpc() {}

  public static final String SERVICE_NAME = "game";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Guess.Empty,
      org.example.stubs.Guess.Result> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = org.example.stubs.Guess.Empty.class,
      responseType = org.example.stubs.Guess.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.stubs.Guess.Empty,
      org.example.stubs.Guess.Result> getStartMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Guess.Empty, org.example.stubs.Guess.Result> getStartMethod;
    if ((getStartMethod = gameGrpc.getStartMethod) == null) {
      synchronized (gameGrpc.class) {
        if ((getStartMethod = gameGrpc.getStartMethod) == null) {
          gameGrpc.getStartMethod = getStartMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Guess.Empty, org.example.stubs.Guess.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "game", "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Guess.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Guess.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new gameMethodDescriptorSupplier("Start"))
                  .build();
          }
        }
     }
     return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Guess.GuessRequest,
      org.example.stubs.Guess.Result> getGuessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Guess",
      requestType = org.example.stubs.Guess.GuessRequest.class,
      responseType = org.example.stubs.Guess.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.stubs.Guess.GuessRequest,
      org.example.stubs.Guess.Result> getGuessMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Guess.GuessRequest, org.example.stubs.Guess.Result> getGuessMethod;
    if ((getGuessMethod = gameGrpc.getGuessMethod) == null) {
      synchronized (gameGrpc.class) {
        if ((getGuessMethod = gameGrpc.getGuessMethod) == null) {
          gameGrpc.getGuessMethod = getGuessMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Guess.GuessRequest, org.example.stubs.Guess.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "game", "Guess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Guess.GuessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Guess.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new gameMethodDescriptorSupplier("Guess"))
                  .build();
          }
        }
     }
     return getGuessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.Guess.Empty,
      org.example.stubs.Guess.Winner> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = org.example.stubs.Guess.Empty.class,
      responseType = org.example.stubs.Guess.Winner.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.Guess.Empty,
      org.example.stubs.Guess.Winner> getStopMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.Guess.Empty, org.example.stubs.Guess.Winner> getStopMethod;
    if ((getStopMethod = gameGrpc.getStopMethod) == null) {
      synchronized (gameGrpc.class) {
        if ((getStopMethod = gameGrpc.getStopMethod) == null) {
          gameGrpc.getStopMethod = getStopMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.Guess.Empty, org.example.stubs.Guess.Winner>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "game", "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Guess.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.Guess.Winner.getDefaultInstance()))
                  .setSchemaDescriptor(new gameMethodDescriptorSupplier("Stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gameStub newStub(io.grpc.Channel channel) {
    return new gameStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gameBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gameBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gameFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gameFutureStub(channel);
  }

  /**
   */
  public static abstract class gameImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * The server generates a random number between 1 and 1000
     * </pre>
     */
    public void start(org.example.stubs.Guess.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.Guess.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * The client guesses a number and the server responds with a hint
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.stubs.Guess.GuessRequest> guess(
        io.grpc.stub.StreamObserver<org.example.stubs.Guess.Result> responseObserver) {
      return asyncUnimplementedStreamingCall(getGuessMethod(), responseObserver);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public void stop(org.example.stubs.Guess.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.Guess.Winner> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.stubs.Guess.Empty,
                org.example.stubs.Guess.Result>(
                  this, METHODID_START)))
          .addMethod(
            getGuessMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.stubs.Guess.GuessRequest,
                org.example.stubs.Guess.Result>(
                  this, METHODID_GUESS)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.Guess.Empty,
                org.example.stubs.Guess.Winner>(
                  this, METHODID_STOP)))
          .build();
    }
  }

  /**
   */
  public static final class gameStub extends io.grpc.stub.AbstractStub<gameStub> {
    private gameStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gameStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gameStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gameStub(channel, callOptions);
    }

    /**
     * <pre>
     * The server generates a random number between 1 and 1000
     * </pre>
     */
    public void start(org.example.stubs.Guess.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.Guess.Result> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The client guesses a number and the server responds with a hint
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.stubs.Guess.GuessRequest> guess(
        io.grpc.stub.StreamObserver<org.example.stubs.Guess.Result> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGuessMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public void stop(org.example.stubs.Guess.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.Guess.Winner> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class gameBlockingStub extends io.grpc.stub.AbstractStub<gameBlockingStub> {
    private gameBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gameBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gameBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gameBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * The server generates a random number between 1 and 1000
     * </pre>
     */
    public java.util.Iterator<org.example.stubs.Guess.Result> start(
        org.example.stubs.Guess.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public org.example.stubs.Guess.Winner stop(org.example.stubs.Guess.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class gameFutureStub extends io.grpc.stub.AbstractStub<gameFutureStub> {
    private gameFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gameFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gameFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gameFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.Guess.Winner> stop(
        org.example.stubs.Guess.Empty request) {
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
    private final gameImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gameImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START:
          serviceImpl.start((org.example.stubs.Guess.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Guess.Result>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((org.example.stubs.Guess.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.Guess.Winner>) responseObserver);
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
              (io.grpc.stub.StreamObserver<org.example.stubs.Guess.Result>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class gameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gameBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.stubs.Guess.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("game");
    }
  }

  private static final class gameFileDescriptorSupplier
      extends gameBaseDescriptorSupplier {
    gameFileDescriptorSupplier() {}
  }

  private static final class gameMethodDescriptorSupplier
      extends gameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gameMethodDescriptorSupplier(String methodName) {
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
      synchronized (gameGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gameFileDescriptorSupplier())
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
