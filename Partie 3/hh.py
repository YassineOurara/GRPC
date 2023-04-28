import random
import grpc
import guess_pb2
import guess_pb2_grpc

class GuessingGameServicer(guess_pb2_grpc.GuessingGameServicer):

    def __init__(self):
        self.secret_number = random.randint(1, 1000)
        self.winner = None
        self.game_over = False

    def Guess(self, request, context):
        if self.game_over:
            return guess_pb2.GuessResponse(message="Le jeu est terminé !")

        guess = request.guess
        if guess == self.secret_number:
            self.winner = request.name
            self.game_over = True
            return guess_pb2.GuessResponse(message="BRAVO, vous avez gagné !")
        elif guess > self.secret_number:
            return guess_pb2.GuessResponse(message="Votre nombre est plus grand")
        else:
            return guess_pb2.GuessResponse(message="Votre nombre est plus petit")

    def GetWinner(self, request, context):
        if self.game_over:
            return guess_pb2.WinnerResponse(winner=self.winner)
        else:
            return guess_pb2.WinnerResponse(winner="Le jeu est toujours en cours")

def serve():
    server = grpc.server(concurrent.futures.ThreadPoolExecutor(max_workers=10))
    guess_pb2_grpc.add_GuessingGameServicer_to_server(GuessingGameServicer(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    print("Le serveur est en marche...")
    server.wait_for_termination()

if __name__ == '__main__':
    serve()
