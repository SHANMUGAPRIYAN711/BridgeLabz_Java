package methods.level2;

import java.util.Scanner;

class NaturalSumComparison {
    public static int recursiveSum(int numbers){
        if(numbers ==1){
            return 1;
        }
        return numbers + recursiveSum(numbers - 1);
    }
    public static int formulaSum(int numbers){
        return numbers * (numbers + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        if(numbers <= 0){
            System.out.println("Not a Natural Numbers");
            return;
        }
        int sum1 = recursiveSum(numbers);
        int sum2 = formulaSum(numbers);
        System.out.println("Recursive sum : " + sum1);
        System.out.println("Formula Sum : " + sum2);
        input.close();
    }
}
