package BridgeLabz_Java.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

// Class responsible for processing files
class FileProcessor {

    // Method to process multiple files
    // Accepts list of file paths
    public void processFiles(List<String> filePaths) {

        // Loop through each file path
        for (String filePath : filePaths) {

            System.out.println("\nReading file: " + filePath);

            // try-with-resources → ensures BufferedReader is auto-closed
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

                String line;

                // Read file line by line
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {

                // Handles file not found or read errors
                System.out.println("Error reading file: " + filePath);
            }
        }
    }
}

// ---------------- MAIN CLASS ----------------

public class TryWithResourcesMultipleFiles {

    public static void main(String[] args) {

        // Creating list of file paths
        List<String> files = List.of(
                "file1.txt",
                "file2.txt",
                "file3.txt"
        );

        // Creating FileProcessor object
        FileProcessor processor = new FileProcessor();

        // Calling method to process all files
        processor.processFiles(files);
    }
}