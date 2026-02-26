package string.level1;

import java.util.Scanner;

class LowercaseConversion {

    static String toLowerManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                result += (char) (ch + 32);
            else
                result += ch;
        }
        return result;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String manual = toLowerManual(text);
        String builtIn = text.toLowerCase();

        System.out.println("Result same: " + compare(manual, builtIn));
    }
}