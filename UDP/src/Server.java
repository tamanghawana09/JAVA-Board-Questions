import java.io.IOError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args)throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String message = "Hey There !";
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(message.getBytes(),message.length(),address,12345);
        System.out.println("Sending message ....");
        socket.send(packet);
    }
}
