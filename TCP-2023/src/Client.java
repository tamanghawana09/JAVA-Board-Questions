import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost",12345);

            BufferedReader socketData = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);
            String sendingMessage, receivingMessage;

            while(true){
                receivingMessage = socketData.readLine();
                System.out.println("Server: " + receivingMessage);

                sendingMessage = userInput.readLine();
                printWriter.println(sendingMessage);
                if(sendingMessage.equals("goodbye")){
                    System.exit(0);
                }
                printWriter.flush();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
