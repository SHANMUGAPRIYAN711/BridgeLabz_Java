package BridgeLabz_Java.exceptions;

import java.util.Scanner;

public class MultipleCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Change this to 'null' to test NullPointerException
            int[] arr = {10, 20, 30, 40};

            // ---- STEP 2: Take index input ----
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            // ---- STEP 3: Access array element ----
            int value = arr[index];   // May throw:
            // ArrayIndexOutOfBoundsException
            // NullPointerException

            // ---- STEP 4: Print value ----
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Handles invalid index
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {

            // Handles null array
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}