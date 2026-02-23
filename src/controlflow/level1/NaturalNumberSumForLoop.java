package controlflow.level1;

import java.util.Scanner;
class NaturalNumberSumForLoop {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Read the number from user
        int n = input.nextInt();

        // Check if the number is a natural number
        if (n > 0) {

            // Calculate sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Variable to store sum using for loop
            int loopSum = 0;

            // Calculate sum using for loop
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Compare both results
            if (formulaSum == loopSum) {
                System.out.println("Both results are correct and equal.");
            }

        } else {
            // If input is not a natural number
            System.out.println("The number " + n + " is not a natural number.");
        }

        // Close Scanner
        input.close();
    }
}