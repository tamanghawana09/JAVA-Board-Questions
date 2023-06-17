import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        File file = new File("Note.txt");
        file.createNewFile();

        FileWriter fileWriter = new FileWriter("Note.txt");
        System.out.println("Enter the text: ");
        String content = input.nextLine();
        fileWriter.write(content);
        fileWriter.close();

    }
}