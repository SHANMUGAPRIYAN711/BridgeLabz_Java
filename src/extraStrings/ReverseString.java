package extraStrings;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str) {
        String reversed = "";

        // Traverse string from end to beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append character
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Reversed String: " + reverse(input));
    }
}
