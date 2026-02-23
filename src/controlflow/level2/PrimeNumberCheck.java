package controlflow.level2;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = input.nextInt();

        boolean isprime = true;
        if(number <= 1) {
            isprime = false;
        }
        else{
            for(int i = 2; i*i< number; i++){
                if(number % i == 0){
                    isprime = false;
                    break;
                }
            }
        }
        System.out.println(isprime? "Prime Number" : "Not  a prime Number");
        input.close();
    }
}
