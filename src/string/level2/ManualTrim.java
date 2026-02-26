package string.level2;

import java.util.Scanner;

class ManualTrim {

    static int[] findIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    static String substring(String text, int s, int e) {
        String res = "";
        for (int i = s; i <= e; i++)
            res += text.charAt(i);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = findIndexes(text);
        String manual = substring(text, idx[0], idx[1]);

        System.out.println(manual.equals(text.trim()));
    }
}