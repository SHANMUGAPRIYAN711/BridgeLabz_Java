package BridgeLabz_Java.exceptions;
import java.util.Scanner;

public class FinallyBlockDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // ---- STEP 1: Take input from user ----
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // ---- STEP 2: Perform division ----
            int result = num1 / num2;   // May throw ArithmeticException

            // ---- STEP 3: Print result if no exception ----
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // ---- Handles division by zero ----
            System.out.println("Error: Cannot divide by zero");

        } finally {

            // ---- ALWAYS executes ----
            // Used for cleanup or final message
            System.out.println("Operation completed");

            // Closing resource
            sc.close();
        }
    }
}
