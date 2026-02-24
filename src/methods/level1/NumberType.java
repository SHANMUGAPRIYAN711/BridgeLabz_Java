package methods.level1;

import java.util.Scanner;

public class NumberType {
    static int numberType(int number){
        if(number < 0){
            return -1;
        } else if (number > 0) {
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = numberType(number);
        System.out.println("The Number Type is : " + result);
        input.close();
    }
}
