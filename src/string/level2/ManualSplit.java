package string.level2;

import java.util.Scanner;

public class ManualSplit {
    static String[] splitText(String text){
        int count = 1;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                count++;
            }
        }
        String[] words = new String[count];
        int index = 0;
        String word = "";
        for(int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            }else{
                word += text.charAt(i);
            }
        }
        words[index] =word;
        return words;
    }
    static boolean comapre(String[] a, String[] b){
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i < a.length; i++){
            if(!a[i].equals(b[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] manual = splitText(text);
        String[] builtin = text.split(text);
        System.out.println("Result : " + comapre(manual, builtin));
        input.close();
    }
}
