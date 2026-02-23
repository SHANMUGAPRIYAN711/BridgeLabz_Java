package arrays.level1;
import java.util.Scanner;
public class VotingEligibilityArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}
