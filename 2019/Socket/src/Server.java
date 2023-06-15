import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(12345);
            Socket socket = ss.accept();
            System.out.println("Client is connected");
            //BufferedReader socketData = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);
            String sendingMessage ="Hello";
            while(true){
                for(int i =0;i<5;i++){
                    printWriter.println(sendingMessage);
                    printWriter.flush();
                }

            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
