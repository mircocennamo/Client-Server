package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author mirco.cennamo on 16/10/2024
 * @project Client-Server-TCP
 * Il server UDP riceve pacchetti da un client senza stabilire una connessione diretta.
 * In questo esempio, il client invia un messaggio al server utilizzando UDP.
 * Il server riceve il messaggio e lo stampa, ma non mantiene una connessione stabile con il client.
 */
public class UDPServer {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(9876)) {
            byte[] receiveData = new byte[1024];
            System.out.println("Server UDP in ascolto sulla porta 9876...");

            // Ricezione del pacchetto
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            // Lettura del messaggio
            String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Messaggio ricevuto: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
