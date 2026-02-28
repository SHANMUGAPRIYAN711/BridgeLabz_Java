package extraStrings;
import java.util.Scanner;
public class LexicographicalCompare {
    public static void compareStrings(String str1, String str2) {

        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {

            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
                return;
            }
            else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
                return;
            }
        }

        // If all characters same
        if (str1.length() < str2.length()) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
        }
        else if (str1.length() > str2.length()) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
        }
        else {
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        compareStrings(str1, str2);
    }
}
