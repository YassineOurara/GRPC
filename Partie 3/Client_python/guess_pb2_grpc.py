# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import guess_pb2 as guess__pb2


class GuessStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Start = channel.unary_stream(
                '/Guess/Start',
                request_serializer=guess__pb2.Empty.SerializeToString,
                response_deserializer=guess__pb2.Result.FromString,
                )
        self.Guess = channel.stream_stream(
                '/Guess/Guess',
                request_serializer=guess__pb2.GuessRequest.SerializeToString,
                response_deserializer=guess__pb2.Result.FromString,
                )
        self.Stop = channel.unary_unary(
                '/Guess/Stop',
                request_serializer=guess__pb2.Empty.SerializeToString,
                response_deserializer=guess__pb2.Result.FromString,
                )


class GuessServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Start(self, request, context):
        """The server generates a random number between 1 and 1000
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Guess(self, request_iterator, context):
        """The client guesses a number and the server responds with a hint
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Stop(self, request, context):
        """The server announces the winner and the game is over
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_GuessServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Start': grpc.unary_stream_rpc_method_handler(
                    servicer.Start,
                    request_deserializer=guess__pb2.Empty.FromString,
                    response_serializer=guess__pb2.Result.SerializeToString,
            ),
            'Guess': grpc.stream_stream_rpc_method_handler(
                    servicer.Guess,
                    request_deserializer=guess__pb2.GuessRequest.FromString,
                    response_serializer=guess__pb2.Result.SerializeToString,
            ),
            'Stop': grpc.unary_unary_rpc_method_handler(
                    servicer.Stop,
                    request_deserializer=guess__pb2.Empty.FromString,
                    response_serializer=guess__pb2.Result.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'Guess', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Guess(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def Start(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/Guess/Start',
            guess__pb2.Empty.SerializeToString,
            guess__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Guess(request_iterator,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.stream_stream(request_iterator, target, '/Guess/Guess',
            guess__pb2.GuessRequest.SerializeToString,
            guess__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Stop(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/Guess/Stop',
            guess__pb2.Empty.SerializeToString,
            guess__pb2.Result.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)