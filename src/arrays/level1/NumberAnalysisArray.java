package arrays.level1;

import java.util.Scanner;

public class NumberAnalysisArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Store user input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Analyze each number
        for (int num : numbers) {

            if (num > 0) {
                System.out.println(num + (num % 2 == 0 ? " is Positive Even" : " is Positive Odd"));
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        // Compare first and last elements
        if (numbers[0] == numbers[numbers.length - 1])
            System.out.println("First and last elements are equal");
        else if (numbers[0] > numbers[numbers.length - 1])
            System.out.println("First element is greater");
        else
            System.out.println("Last element is greater");

        input.close();
    }
}