package string.level1;

import java.util.Scanner;

public class StringEquals {
    static boolean compressingCharAt(String s1, String s2){
        //compare using CharAt
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Name : ");
        String s1 = input.next();
        System.out.println("Enter a Name : " );
        String s2 = input.next();
        boolean charResult = compressingCharAt(s1,s2);
        //Compare using Equals
        boolean equalsResult = s1.equals(s2);
        System.out.println("CharAt Comparison : " + charResult);
        System.out.println("Equals Comparison : " + equalsResult);
    }
}
