# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import guess_pb2 as guess__pb2


class GuessingGameStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Guess = channel.stream_unary(
                '/GuessingGame/Guess',
                request_serializer=guess__pb2.GuessRequest.SerializeToString,
                response_deserializer=guess__pb2.GuessResponse.FromString,
                )


class GuessingGameServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Guess(self, request_iterator, context):
        """La méthode pour deviner le nombre secret
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_GuessingGameServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Guess': grpc.stream_unary_rpc_method_handler(
                    servicer.Guess,
                    request_deserializer=guess__pb2.GuessRequest.FromString,
                    response_serializer=guess__pb2.GuessResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'GuessingGame', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class GuessingGame(object):
    """Missing associated documentation comment in .proto file."""

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
        return grpc.experimental.stream_unary(request_iterator, target, '/GuessingGame/Guess',
            guess__pb2.GuessRequest.SerializeToString,
            guess__pb2.GuessResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
