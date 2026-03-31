package BridgeLabz_Java.exceptions;

public class ThrowVsThrowsDemo {

    // Method to calculate simple interest
    // "throws" → declares that this method may throw IllegalArgumentException
    static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        // Validation: amount and rate must be positive
        if (amount < 0 || rate < 0) {

            // "throw" → actually creates and throws the exception
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        // Formula: Simple Interest = (P * R * T) / 100
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {
            // Calling method (may throw exception)
            double interest = calculateInterest(-1000, 5, 2); // change values to test

            // If no exception → print result
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {

            // Handling propagated exception
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
