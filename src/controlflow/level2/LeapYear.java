package controlflow.level2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = input.nextInt();
        if(year >= 1582){
            if(year % 400 == 0){
                System.out.println("Year is a Leap Year");
            }
            else if(year % 100 == 0){
                System.out.println("Year is not a leap year");
            }
            else if(year % 4 == 0){
                System.out.println("Year is a leap Year");
            }
            else{
                System.out.println("Year is not a leap year");
            }
        }else{
            System.out.println("Year must be above 1582");
        }
        input.close();
    }
}
