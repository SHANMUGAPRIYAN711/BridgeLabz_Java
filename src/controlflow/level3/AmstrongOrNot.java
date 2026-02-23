package controlflow.level3;

import java.util.Scanner;

public class AmstrongOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int orginalNumber = number;
        while (number != 0){
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }
        if(sum == orginalNumber){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
        input.close();
    }
}
