package methods.level2;

import java.util.Scanner;

public class FactorsCalculator {
    public static int[]findfactors(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for(int i = 1; i<= number; i++){
            if(number % i == 0){
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int sumOfFactors(int[] factors){
        int sum = 0;
        for(int f : factors){
            sum += f;
        }
        return sum;
    }
    public static int productOfFactors(int[] factors){
        int product = 1;
        for(int p : factors){
            product *= p;
        }
        return product;
    }
    public static int sumOfSquares(int[] factors){
        int sum = 0;
        for(int s : factors){
            sum += Math.pow(s,2);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        int number = input.nextInt();
        int[] factors = findfactors(number);

        System.out.println("Sum : " + sumOfFactors(factors));
        System.out.println("Product : " + productOfFactors(factors));
        System.out.println("Sum of Squares : " + sumOfSquares(factors));

        input.close();
    }
}
