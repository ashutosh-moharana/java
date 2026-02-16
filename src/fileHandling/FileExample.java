package fileHandling;


import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {

        String data = "Hello, Java File Writing! This line will be in the file.";

        // Use try-with-resources to ensure the FileWriter is closed automatically
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(data); // Write the string to the file
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

    }
}
