import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(9999);
            Socket socket = ss.accept();
            System.out.println("Server listening on port 9999.....");

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
                System.out.println("Client:" + receivingMessage);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
