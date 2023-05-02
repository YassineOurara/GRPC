package org.example.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.service.GuessService;

import java.io.IOException;

public class GuessServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server= ServerBuilder.forPort(1809)
                .addService(new GuessService())
                .build();
        server.start();
        server.awaitTermination();
    }
}