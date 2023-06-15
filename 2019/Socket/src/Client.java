import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 12345);
            BufferedReader socketData =  new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(socketData.readLine());

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
