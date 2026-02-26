package string.level2;

import java.util.Scanner;

class ShortestLongestWord {

    static int length(String s) {
        int c = 0;
        try {
            while (true) s.charAt(c++);
        } catch (Exception e) {
            return c - 1;
        }
    }

    static int[] findMinMax(String[] words) {
        int min = 0, max = 0;
        for (int i = 1; i < words.length; i++) {
            if (length(words[i]) < length(words[min])) min = i;
            if (length(words[i]) > length(words[max])) max = i;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        int[] result = findMinMax(words);
        System.out.println("Shortest: " + words[result[0]]);
        System.out.println("Longest: " + words[result[1]]);
    }
}