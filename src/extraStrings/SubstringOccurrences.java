package extraStrings;
import java.util.Scanner;
public class SubstringOccurrences {
    public static int countOccurrences(String str, String sub) {
        int count = 0;

        // Loop till possible substring positions
        for (int i = 0; i <= str.length() - sub.length(); i++) {

            // Extract substring of same length
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        System.out.println("Occurrences: " + countOccurrences(str, sub));
    }
}
