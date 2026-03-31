package BridgeLabz_Java.exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Asking user to enter two numbers
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();   // may throw InputMismatchException

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();   // may throw InputMismatchException

            // Performing division
            int result = num1 / num2;  // may throw ArithmeticException

            // Printing result if no exception occurs
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // Handles division by zero
            System.out.println("Error: Cannot divide by zero");

        } catch (InputMismatchException e) {

            // Handles non-numeric input
            System.out.println("Error: Please enter valid numbers only");

        } finally {

            // Always executes (cleanup)
            sc.close();
            System.out.println("Program finished");
        }
    }
}