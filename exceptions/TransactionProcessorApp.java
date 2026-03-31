package BridgeLabz_Java.exceptions;

// Custom exception for transaction failure
class TransactionException extends Exception {
    public TransactionException(String message) {
        super(message);
    }
}

class TransactionProcessor {

    // Method that performs transaction
    public void processTransaction(String user, double amount) throws TransactionException {

        try {
            // Simulating failure condition
            if (amount <= 0) {
                throw new TransactionException("Invalid transaction amount");
            }

            System.out.println("Transaction successful for " + user);

        } catch (TransactionException e) {

            // Rethrow with additional context
            throw new TransactionException(
                    "Transaction failed for user: " + user + " | Reason: " + e.getMessage()
            );
        }
    }
}

// Main class named based on problem
public class TransactionProcessorApp {

    public static void main(String[] args) {

        TransactionProcessor processor = new TransactionProcessor();

        try {
            processor.processTransaction("John", -500); // change value to test

        } catch (TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}
