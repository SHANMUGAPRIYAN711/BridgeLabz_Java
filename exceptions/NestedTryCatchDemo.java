package BridgeLabz_Java.exceptions;

import java.util.Scanner;

public class NestedTryCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---- STEP 1: Initialize array ----
        int[] arr = {10, 20, 30, 40};

        try {
            // ---- STEP 2: Take index input ----
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            try {
                // ---- INNER TRY 1 ----
                // Access array element (may throw ArrayIndexOutOfBoundsException)
                int value = arr[index];

                // ---- STEP 3: Take divisor ----
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                try {
                    // ---- INNER TRY 2 ----
                    // Perform division (may throw ArithmeticException)
                    int result = value / divisor;

                    // If no exception
                    System.out.println("Result: " + result);

                } catch (ArithmeticException e) {

                    // Handles division by zero
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {

                // Handles invalid index
                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {

            // Handles any unexpected input errors
            System.out.println("Invalid input!");
        }

        sc.close(); // cleanup
    }
}