import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String filePath = "sample_output.txt";
        String contentToWriter = "Hello, Alfido Tech!\nThis is a file handling demonstration in Java.";

        // Writing to a File using FileWriter
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(contentToWriter);
            System.out.println("Data successfully written to " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a File using FileReader
        System.out.println("\n--- Reading Content From File ---");
        try (FileReader reader = new FileReader(filePath)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
