package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author mirco.cennamo on 16/10/2024
 * @project Client-Server-TCP
 *
 * Client TCP
 * Il client si connette al server TCP e riceve il messaggio.
 * Il client si connette al server sulla porta 1234 e legge il messaggio inviato dal server.
 */
public class MainClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            // Lettura del messaggio dal server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverMessage = in.readLine();
            System.out.println("Messaggio dal server: " + serverMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
