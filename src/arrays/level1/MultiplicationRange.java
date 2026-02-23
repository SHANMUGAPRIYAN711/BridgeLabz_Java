package arrays.level1;

import java.util.Scanner;

public class MultiplicationRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] result = new int[4];
        int index = 0;

        // Store results
        for (int i = 6; i <= 9; i++) {
            result[index++] = number * i;
        }

        // Display results
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index++]);
        }

        input.close();
    }
}
