import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        String fileName = "purbanchal.dat";
        String data = "I am a student of BIT VI Semester";
        try{
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName));
            outputStream.writeUTF(data);
            outputStream.close();
            System.out.println("Data has been written to " + fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}