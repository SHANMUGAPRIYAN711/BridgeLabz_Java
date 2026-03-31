package BridgeLabz_Java.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        // Try block: code that may throw checked exception (IOException)
        try {

            // Creating FileReader to read the file
            FileReader file = new FileReader("data.txt");

            // Wrapping FileReader with BufferedReader for efficient reading
            BufferedReader reader = new BufferedReader(file);

            String line;

            // Reading file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Closing resources (important to avoid memory leaks)
            reader.close();

        } catch (IOException e) {

            // Handling exception if file not found or any I/O error
            System.out.println("File not found");
        }
    }
}
