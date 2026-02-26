package string.level3;

import java.util.Scanner;

public class UniqueCharacter {
    static int findLength(String text){
        int c = 0;
        try {
            while (true) {
                text.charAt(c);
                c++;
            }
        }
            catch(Exception e){}
            return c;
    }
    static char[] findUniqueCharacter(String text){
        int len = findLength(text);
        char[] temp = new char[len];
        int count = 0;
        for(int i = 0; i< len; i++){
            char ch = text.charAt(i);
            boolean isunique = true;

            for(int j = 0; j < i; j++){
                if(text.charAt(j) == ch){
                    isunique = false;
                    break;
                }
            }
            if(isunique){
                temp[count++] = ch;
            }
        }
        char[] result = new char[count];
        for(int i = 0; i < count ;i++){
            result[i] = temp[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Text : ");
        String text = input.next();

        char[] unique = findUniqueCharacter(text);
        System.out.println("Unique Characters : " );
        for(char c : unique){
            System.out.println(c + " ");
        }
        input.close();
    }
}
