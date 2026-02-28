package extrabuiltinmethods;
import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    static String getFeedback(Scanner sc) {
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;

        System.out.println("Think of a number between 1 and 100");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is it " + guess + "? (high / low / correct)");

            String feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly!");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }
}