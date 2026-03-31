package BridgeLabz_Java.exceptions;

public class RethrowExceptionDemos {

    // Performs division
    static int performDivision(int numerator, int denominator) {

        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }

        return numerator / denominator;
    }

    // Calls performDivision and rethrows with extra context
    static int calculate(int numerator, int denominator) {

        try {
            return performDivision(numerator, denominator);

        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error in calculation: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            int result = calculate(10, 0); // change values to test
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}