package string.level3;

import java.util.Scanner;

class CharacterFrequency {

    // Method to find length without using length()
    static int findLength(String text) {
        int c = 0;
        try {
            while (true) {
                text.charAt(c);
                c++;
            }
        } catch (Exception e) {
        }
        return c;
    }

    // Method to find character frequency
    static void frequency(String text) {

        int len = findLength(text);
        boolean[] visited = new boolean[len];

        for (int i = 0; i < len; i++) {

            if (visited[i])
                continue;

            char ch = text.charAt(i);
            int count = 1;

            for (int j = i + 1; j < len; j++) {
                if (text.charAt(j) == ch) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch + " : " + count);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        frequency(text);
    }
}