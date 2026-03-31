package BridgeLabz_Java.exceptions;

public class RethrowExceptionDemo {

    // Performs division and throws ArithmeticException if denominator is zero
    static int performDivision(int numerator, int denominator) {

        // Check for divide by zero
        if (denominator == 0) {

            // Throwing exception manually
            throw new ArithmeticException("Denominator cannot be zero");
        }

        // Return division result
        return numerator / denominator;
    }

    // Calls performDivision and rethrows exception with additional context
    static int calculate(int numerator, int denominator) {

        try {
            // Calling method that may throw exception
            return performDivision(numerator, denominator);

        } catch (ArithmeticException e) {

            // Adding more context and rethrowing exception
            throw new ArithmeticException(
                    "Error in calculate(): " + e.getMessage()
            );
        }
    }

    // Handles the rethrown exception
        public static void main(String[] args) {

        try {
            // Change values to test
            int result = calculate(10, 0);

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // Handling rethrown exception
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}
