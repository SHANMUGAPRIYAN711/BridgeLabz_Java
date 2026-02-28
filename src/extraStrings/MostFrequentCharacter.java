package extraStrings;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void findMostFrequent(String str) {

        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        char mostFrequent = ' ';

        // Find max frequency
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                mostFrequent = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        findMostFrequent(input);
    }
}
