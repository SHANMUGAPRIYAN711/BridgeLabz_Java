package string.level3;
import java.util.Scanner;

class FrequencyUsingUniqueCharacters {

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

    // Method to find unique characters
    static char[] uniqueChars(String text) {

        int len = findLength(text);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count++] = ch;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Method to count frequency of a character
    static int countFrequency(String text, char ch) {
        int count = 0;
        int len = findLength(text);

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ch)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = uniqueChars(text);

        for (char ch : unique) {
            System.out.println(ch + " : " + countFrequency(text, ch));
        }
    }
}
