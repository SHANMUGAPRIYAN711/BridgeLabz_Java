package controlflow.level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int orginalNumber = number;
        if(number != 0){
            sum += number % 10;
            number = number/ 10;
        }
        if(orginalNumber % sum == 0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
        input.close();
    }
}
