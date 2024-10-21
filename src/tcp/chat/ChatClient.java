package tcp.chat;

/**
 * @author mirco.cennamo on 16/10/2024
 * @project Client-Server-TCP
 */
import java.io.*;
import java.net.*;

public class ChatClient {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public ChatClient(String serverAddress, int port) {
        try {
            socket = new Socket(serverAddress, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // Thread per leggere i messaggi dal server
            new Thread(new IncomingMessagesHandler()).start();

            // Legge l'input da console e invia messaggi al server
            BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            while ((userInput = consoleIn.readLine()) != null) {
                out.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class IncomingMessagesHandler implements Runnable {
        public void run() {
            String message;
            try {
                while ((message = in.readLine()) != null) {
                    System.out.println("Messaggio dal server: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ChatClient("localhost", 12345); // Connessione al server sulla porta 12345
    }
}

