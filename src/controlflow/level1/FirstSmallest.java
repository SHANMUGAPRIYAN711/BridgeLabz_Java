package controlflow.level1;

import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number1 : ");
        int number1 = input.nextInt();
        System.out.println("Enter Number2 : ");
        int number2 = input.nextInt();
        System.out.println("Enter Number3 : ");
        int number3 = input.nextInt();
        if(number1 < number2 && number1 < number3){
            System.out.println("Is the First Number Smallest ? Yes");
        }
        else{
            System.out.println("Is the First Number Smallest ? No");
        }
        input.close();
    }
}
