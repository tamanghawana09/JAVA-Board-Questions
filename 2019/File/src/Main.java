import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        File file = new File("Note.txt");
        file.createNewFile();

        FileInputStream fileInputStream = new FileInputStream("Note.txt");
        FileWriter fileWriter = new FileWriter("Note.txt");
        System.out.println("Enter the text:");
        String content1 = input.nextLine();
        fileWriter.write(content1);
        fileWriter.close();

        FileReader fileReader = new FileReader("Note.txt");
        BufferedReader buffRead = new BufferedReader(fileReader);
        String content = buffRead.readLine();
        System.out.println(content);

    }
}