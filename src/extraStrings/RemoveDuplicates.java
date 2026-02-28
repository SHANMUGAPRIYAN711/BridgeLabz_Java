package extraStrings;
import java.util.Scanner;
public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        String result = "";
        boolean[] visited = new boolean[256]; // ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!visited[ch]) {   // If character not seen before
                result += ch;
                visited[ch] = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("After removing duplicates: " + removeDuplicates(input));
    }
}
