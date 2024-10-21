package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author mirco.cennamo on 16/10/2024
 * @project Client-Server-TCP
 */
public class UDPClient {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            String message = "Ciao dal client UDP!";
            byte[] sendData = message.getBytes();

            // Invio del pacchetto al server
            InetAddress serverAddress = InetAddress.getByName("localhost");
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9876);
            socket.send(sendPacket);

            System.out.println("Messaggio inviato al server UDP");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
