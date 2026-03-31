package BridgeLabz_Java.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Handles reading from two files and writing to a third file
class MultiFileProcessor {

    public void combineFiles(String file1, String file2, String outputFile) {

        // Multiple resources in try-with-resources
        try (
                BufferedReader reader1 = new BufferedReader(new FileReader(file1));
                BufferedReader reader2 = new BufferedReader(new FileReader(file2));
                FileWriter writer = new FileWriter(outputFile)
        ) {

            String line;

            // Read first file
            while ((line = reader1.readLine()) != null) {
                writer.write(line + "\n");
            }

            // Read second file
            while ((line = reader2.readLine()) != null) {
                writer.write(line + "\n");
            }

            System.out.println("Files combined successfully into: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing files");
        }
    }
}

// Main class named based on problem
public class MultiFileProcessorApp {

    public static void main(String[] args) {

        MultiFileProcessor processor = new MultiFileProcessor();

        // Input files and output file
        processor.combineFiles("file1.txt", "file2.txt", "output.txt");
    }
}
