package string.level2;

import java.util.Scanner;

public class StringLengthWithoutMethod {
    static int findlength(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch (StringIndexOutOfBoundsException e){
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        System.out.println("Calculated Length : " + findlength(text));
        System.out.println("Built-in Length : " + text.length());
    }
}
