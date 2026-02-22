package programmingelements.level1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        double num1 = input.nextFloat();
        System.out.println("Enter Second Number :");
        double num2 = input.nextFloat();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1/ num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + " " + num1 + "and"+ " "+ num2 + " " +"is " + " " + addition +"," + subtraction+","+ multiplication+ ","+ "and"+" "+ division);
    }

}
