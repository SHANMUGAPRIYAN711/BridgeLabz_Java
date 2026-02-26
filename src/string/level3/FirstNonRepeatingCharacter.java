package string.level3;

// Question: Find the first non-repeating character in a string using charAt()

import java.util.Scanner;

class FirstNonRepeatingCharacter {

    // Method to find length without using length()
    static int findLength(String text) {
        int c = 0;
        try {
            while (true) {
                text.charAt(c);
                c++;
            }
        } catch (Exception e) {}
        return c;
    }

    // Method to find first non-repeating character
    static char firstNonRepeating(String text) {

        int len = findLength(text);

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < len; j++) {
                if (i != j && text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return ch;
            }
        }
        return '\0'; // no non-repeating character
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = firstNonRepeating(text);

        if (result != '\0')
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No Non-Repeating Character Found");
    }
}