package controlflow.level1;
import java.util.Scanner;

// Class to check number type
class NumberTypeCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        input.close();
    }
}
