package BridgeLabz_Java.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        // try-with-resources:
        // Resource (BufferedReader) is declared inside try()
        // It will be automatically closed after execution
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {

            // Reading the first line of the file
            String firstLine = reader.readLine();

            // Checking if file is empty or not
            if (firstLine != null) {
                System.out.println(firstLine);
            } else {
                System.out.println("File is empty");
            }

        } catch (IOException e) {

            // Handles file not found or any I/O error
            System.out.println("Error reading file");
        }
    }
}
