import grpc
import chat_pb2
import chat_pb2_grpc
from datetime import datetime

# Create a channel to the gRPC server
channel = grpc.insecure_channel('localhost:1809')

# Create a stub for the service
stub = chat_pb2_grpc.ChatStub(channel)

# Define a function to handle incoming messages
def handle_incoming_messages(response_iterator):
    for response in response_iterator:
        print(f"[{datetime.fromtimestamp(response.timestamp.seconds)}] {response.user_id}: {response.text}")

# Open a bidirectional stream and start sending messages
stream = stub.Chat()
while True:
    message_text = input("Enter a message (or 'exit' to quit): ")
    if message_text.lower() == 'exit':
        break
    message = chat_pb2.Message(user_id='1', text=message_text)
    stream.on_next(message)

# Close the stream
stream.on_completed()

# Wait for incoming messages to finish
handle_incoming_messages(stream)
