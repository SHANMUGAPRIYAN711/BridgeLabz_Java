package string.level1;

import java.util.Scanner;

public class CreateSubString {
    public static String  substringUsingCharAt(String s1, int start, int end){
        String result = "";
        for (int i = start; i < end; i++){
            result += s1.charAt(i);
        }
        return result;
    }
    static boolean compareStrings(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        int start = input.nextInt();
        int end = input.nextInt();

        String manual = substringUsingCharAt(s1, start, end);
        String builtin = s1.substring(start, end);
        System.out.println("Result Name : " + compareStrings(manual, builtin));
    }
}
