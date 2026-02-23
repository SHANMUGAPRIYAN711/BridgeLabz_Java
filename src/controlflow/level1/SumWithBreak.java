package controlflow.level1;
import java.util.Scanner;

// Class to sum until zero or negative using break
class SumWithBreak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0;

        while (true) {
            double value = input.nextDouble();

            if (value <= 0) {
                break;
            }

            total += value;
        }

        System.out.println("Total sum is " + total);
        input.close();
    }
}