package string.level2;

import java.util.Scanner;

class CharacterType {

    static String check(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++)
            System.out.println(text.charAt(i) + "\t" + check(text.charAt(i)));
    }
}