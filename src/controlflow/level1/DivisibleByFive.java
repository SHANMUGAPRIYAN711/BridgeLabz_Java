package controlflow.level1;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = input.nextInt();
        if(number % 5 == 0){
            System.out.println("Is the number "+" " + number +" "+ "divisible by 5? Yes ");
        }
        else {
            System.out.println("Is the number "+" "+ number +" "+"divisible by 5? No");
        }
        input.close();
    }

    static class EmployeeBonus {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double salary = input.nextDouble();
            int years = input.nextInt();

            if (years > 5)
                System.out.println("Bonus is " + (salary * 0.05));
            else
                System.out.println("No bonus");

            input.close();
        }
    }
}
