import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(12345);
            Socket socket = ss.accept();

            BufferedReader socketData = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            String sendingMessage, receivingMessage;
            while(true){
                sendingMessage = userInput.readLine();
                printWriter.println(sendingMessage);
                printWriter.flush();

                receivingMessage = socketData.readLine();
                System.out.println("Client: " + receivingMessage);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
