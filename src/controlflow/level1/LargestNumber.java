package controlflow.level1;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int number1 = input.nextInt();
        System.out.println("Enter the Second Number :");
        int number2 = input.nextInt();
        System.out.println("Enter the third Number");
        int number3 = input.nextInt();
        System.out.println("Is the first number Largest ?" + (number1 > number2 && number1 > number3));
        System.out.println("Is the Second number Largest ? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number Largest ?" + (number3 > number1 && number3 > number2));
        input.close();
    }
}
