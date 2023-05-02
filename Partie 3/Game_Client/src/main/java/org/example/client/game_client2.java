package org.example.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.stubs.GuessGrpc;
import org.example.stubs.GuessOuterClass.Empty;
import org.example.stubs.GuessOuterClass.GuessRequest;
import org.example.stubs.GuessOuterClass.Result;

import java.util.Scanner;


public class game_client2 {
    private static boolean gameOver = false;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 1809)
                .usePlaintext()
                .build();

        GuessGrpc.GuessStub stub = GuessGrpc.newStub(channel);

        // Prompt the user for their name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String playerName = scanner.nextLine();


        // Start the game and get the initial message from the server
        stub.start(Empty.newBuilder().build(), new StreamObserver<Result>() {
            @Override
            public void onNext(Result result) {
                System.out.println(result.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error in start() method: " + throwable);
            }

            @Override
            public void onCompleted() {
                // Do nothing
            }
        });

        StreamObserver<GuessRequest> requestObserver = stub.guess(new StreamObserver<Result>() {

            @Override
            public void onNext(Result result) {
                System.out.println(result.getMessage());
                if (result.getMessage().startsWith("Jeu terminé") || result.getMessage().startsWith("BRAVO")) {
                    gameOver = true;
                    // If the game is over, call the stop method on the server
                    stub.stop(Empty.newBuilder().build(), new StreamObserver<Result>() {
                        @Override
                        public void onNext(Result result) {
                            System.out.println(result.getMessage());
                        }
                        @Override
                        public void onError(Throwable throwable) {
                            System.err.println("Error in stop() method: " + throwable);
                        }
                        @Override
                        public void onCompleted() {

                        }
                    });
                }}

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error in guess() method: " + throwable);
            }

            @Override
            public void onCompleted() {
            }
        });

        // Loop to get the user's guesses
        while (!gameOver) {
            int guess = scanner.nextInt();

            // Send the guess along with the player name
            GuessRequest guessRequest = GuessRequest.newBuilder()
                    .setGuess(guess)
                    .setUsername(playerName)
                    .build();
            requestObserver.onNext(guessRequest);
        }
    }
}
