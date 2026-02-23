package controlflow.level1;
import java.util.Scanner;

// Class to find sum until user enters 0
class SumUntilZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0;

        double value = input.nextDouble();

        while (value != 0) {
            total += value;
            value = input.nextDouble();
        }

        System.out.println("Total sum is " + total);
        input.close();
    }
}