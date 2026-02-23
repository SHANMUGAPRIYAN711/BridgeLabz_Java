package controlflow.level1;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n >= 1){
            int sum = n * (n+1) / 2;
            System.out.println("The sum of "+" "+ n+" "+"Natural Numbers" + " "+ sum);
        }
        else{
            System.out.println("The number" + n + "is not a natural number");
        }
        input.close();
    }
}
