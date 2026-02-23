package controlflow.level1;
import java.util.Scanner;

// Class to check Spring Season
class SpringSeason {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read month from user
        System.out.println("Enter month:");
        int month = input.nextInt();

        // Read day from user
        System.out.println("Enter day:");
        int day = input.nextInt();

        // Check Spring Season condition
        boolean isSpring =
                (month == 3 && day >= 20) ||
                        (month == 4) ||
                        (month == 5) ||
                        (month == 6 && day <= 20);

        // Display result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        input.close();
    }
}