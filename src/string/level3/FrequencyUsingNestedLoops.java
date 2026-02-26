package string.level3;
import java.util.Scanner;
public class FrequencyUsingNestedLoops {
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

    // Method to find and display frequency using nested loops
    static void findFrequency(String text) {

        int len = findLength(text);
        char[] chars = new char[len];
        int[] freq = new int[len];

        // Copy characters
        for (int i = 0; i < len; i++) {
            chars[i] = text.charAt(i);
            freq[i] = 1;
        }

        // Count frequency
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0')
                continue;

            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        // Display result
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                System.out.println(chars[i] + " : " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        findFrequency(text);
    }
}
