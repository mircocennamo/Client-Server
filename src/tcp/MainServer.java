package tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author mirco.cennamo on 16/10/2024
 * @project Default (Template) Project
 * Server TCP
 * Il seguente esempio crea un server che accetta connessioni TCP su una porta specifica e invia un messaggio al client connesso.
 * In questo esempio, il server è in ascolto sulla porta 1234 e accetta connessioni dal client.
 * Una volta stabilita la connessione, invia un messaggio al client e poi chiude la connessione.
 */
public class MainServer {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server in attesa sulla porta 1234...");

            // Accetta la connessione dal client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connessione accettata da " + clientSocket.getInetAddress());

            // Invio del messaggio al client
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            out.println("Benvenuto dal server!");

            // Chiudi la connessione
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}