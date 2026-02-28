package extraStrings;
import java.util.Scanner;
public class CountVowelsConsonants {
    public static void countVC(String str) {
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase(); // Convert to lowercase for easy comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is alphabet
            if (Character.isLetter(ch)) {

                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        countVC(input);
    }
}
