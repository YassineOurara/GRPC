package org.example.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.service.ChatGrpcService;

import java.io.IOException;

public class ChatGrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(1809)
                .addService(new ChatGrpcService())
                .build();
        server.start();
        server.awaitTermination();
    }
}
