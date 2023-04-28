import random
import grpc
from concurrent import futures
import time

# Importer le fichier de protocole
import guessing_game_pb2
import guessing_game_pb2_grpc

# Implémentation du service GRPC
class GuessingGameServicer(guessing_game_pb2_grpc.GuessingGameServicer):
    
    def __init__(self):
        self.secret_number = random.randint(1, 1000)
        self.winner = None

    def Guess(self, request_iterator, context):
        for guess_request in request_iterator:
            guess = guess_request.guess
            if guess < self.secret_number:
                result = guessing_game_pb2.GuessResponse.TOO_LOW
            elif guess > self.secret_number:
                result = guessing_game_pb2.GuessResponse.TOO_HIGH
            else:
                result = guessing_game_pb2.GuessResponse.CORRECT
                self.winner = guess_request.client_id
            yield guessing_game_pb2.GuessResponse(result=result, winner=self.winner)
            if result == guessing_game_pb2.GuessResponse.CORRECT:
                break

# Démarrer le serveur GRPC
def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    guessing_game_pb2_grpc.add_GuessingGameServicer_to_server(GuessingGameServicer(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    try:
        while True:
            time.sleep(86400)
    except KeyboardInterrupt:
        server.stop(0)

if __name__ == '__main__':
    serve()
