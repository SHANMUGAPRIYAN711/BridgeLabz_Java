package BridgeLabz_Java.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

// Handles reading multiple files
class FileProcessors {

    public void processFiles(List<String> filePaths) {

        for (String path : filePaths) {

            System.out.println("\nReading: " + path);

            // Auto-closes BufferedReader after use
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + path);
            }
        }
    }
}

// Main class named based on problem
public class FileProcessorApp {

    public static void main(String[] args) {

        List<String> files = List.of(
                "file1.txt",
                "file2.txt",
                "file3.txt"
        );

        FileProcessors processor = new FileProcessors();
        processor.processFiles(files);
    }
}
