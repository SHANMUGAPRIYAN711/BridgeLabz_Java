package string.level3;
import java.util.Scanner;
public class PalindromeCheck {
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

    // Method to check palindrome
    static boolean isPalindrome(String text) {

        int len = findLength(text);
        int start = 0;
        int end = len - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        if (isPalindrome(text))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
