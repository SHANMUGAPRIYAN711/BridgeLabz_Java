package string.level3;
import java.util.Scanner;
public class AnagramCheck {

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

    // Method to check anagram
    static boolean isAnagram(String s1, String s2) {

        int len1 = findLength(s1);
        int len2 = findLength(s2);

        if (len1 != len2)
            return false;

        boolean[] visited = new boolean[len2];

        for (int i = 0; i < len1; i++) {
            char ch = s1.charAt(i);
            boolean found = false;

            for (int j = 0; j < len2; j++) {
                if (!visited[j] && ch == s2.charAt(j)) {
                    visited[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
    }
}
