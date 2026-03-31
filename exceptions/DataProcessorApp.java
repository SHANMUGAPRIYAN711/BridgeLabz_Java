package BridgeLabz_Java.exceptions;

import java.io.IOException;

// Custom checked exception
class DataProcessingException extends Exception {
    public DataProcessingException(String message) {
        super(message);
    }
}

class DataProcessor {

    // Method that throws both checked and unchecked exceptions
    public void processData(String data) throws DataProcessingException {

        // Unchecked exception (Runtime)
        if (data == null) {
            throw new NullPointerException("Data cannot be null");
        }

        // Checked exception
        if (data.isEmpty()) {
            throw new DataProcessingException("Data cannot be empty");
        }

        System.out.println("Processing data: " + data);
    }
}

// Main class named based on problem
public class DataProcessorApp {

    public static void main(String[] args) {

        DataProcessor processor = new DataProcessor();

        try {
            processor.processData("");   // try: null, "", "Hello"

        } catch (DataProcessingException e) {
            System.out.println("Checked Exception: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }
}