package org.example.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.service.Guess;

import java.io.IOException;

public class servergame {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(1809)
                .addService(new Guess())
                .build();
        server.start();
        server.awaitTermination();
    }
}
