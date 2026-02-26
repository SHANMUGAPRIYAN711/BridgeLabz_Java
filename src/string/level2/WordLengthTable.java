package string.level2;

import java.util.Scanner;

class WordLengthTable {

    static int length(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c++);
            }
        } catch (Exception e) {
            return c - 1;
        }
    }

    static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        String[][] table = wordsWithLength(words);

        System.out.println("Word\tLength");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}