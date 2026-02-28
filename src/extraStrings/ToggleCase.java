package extraStrings;
import java.util.Scanner;
public class ToggleCase {
    public static String toggle(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If uppercase convert to lowercase
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            }
            // If lowercase convert to uppercase
            else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            }
            else {
                result += ch; // Keep other characters unchanged
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.println("Toggled Case: " + toggle(input));
    }
}
