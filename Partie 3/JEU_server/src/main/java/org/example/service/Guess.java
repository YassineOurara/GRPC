package org.example.service;

import io.grpc.stub.StreamObserver;
import org.example.stubs.gameGrpc;
import org.example.stubs.Guess.Empty;
import org.example.stubs.Guess.Result;
import org.example.stubs.Guess.GuessRequest;
import org.example.stubs.Guess.Winner;


import java.util.Random;


public class Guess  extends gameGrpc.gameImplBase {
    private int secretNumber;
    private String winnerName;

    @Override
    public void start(Empty request, StreamObserver<Result> responseObserver) {
        // Generate a random number between 1 and 1000
        Random random = new Random();
        secretNumber = random.nextInt(1000) + 1;

        System.out.println("Le nombre secret: " + secretNumber);

        responseObserver.onNext(Result.newBuilder().setMessage("Le jeu a commencé : devinez un nombre entre 1 et 1000!").build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<GuessRequest> guess(StreamObserver<Result> responseObserver) {
        // Create a new stream observer that will receive guess requests from the client
        StreamObserver<GuessRequest> requestObserver = new StreamObserver<GuessRequest>() {
            private int guessCount = 0;

            @Override
            public void onNext(GuessRequest guessRequest) {
                guessCount++;

                // Check if the guess is correct
                int guess = guessRequest.getGuess();
                if (guess == secretNumber) {
                    winnerName = "Joueur " + guessCount;
                    responseObserver.onNext(Result.newBuilder().setMessage("BRAVO, vous avez gagné!").build());
                    responseObserver.onNext(Result.newBuilder().setMessage("Jeu terminé, le gagnant est " + winnerName).build());
                    responseObserver.onCompleted();
                    return;
                }

                // Check if the guess is higher or lower than the secret number
                String message;
                if (guess < secretNumber) {
                    message = "Votre nombre est plus petit";
                } else {
                    message = "Votre nombre est plus grand";
                }

                responseObserver.onNext(Result.newBuilder().setMessage(message).build());
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error in guess() method: " + throwable);
            }

            @Override
            public void onCompleted() {
                // Do nothing
            }
        };

        // Return the new stream observer that will receive guess requests from the client
        return requestObserver;
    }
    @Override
    public void stop(Empty request, StreamObserver<Winner> responseObserver) {
        int winnerNumber = Integer.parseInt(winnerName.replaceAll("[^\\d]", ""));
        Winner winner = Winner.newBuilder().setWinner(winnerNumber).build();
        responseObserver.onNext(winner);
        responseObserver.onCompleted();
        System.out.println("Jeu terminé, le gagnant est " + winnerName+" et le nombre secret était "+secretNumber);
    }
}