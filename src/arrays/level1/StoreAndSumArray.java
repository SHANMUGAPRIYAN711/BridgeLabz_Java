package arrays.level1;
import java.util.Scanner;
public class StoreAndSumArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        // Store values until limit or invalid input
        while (true) {

            double value = input.nextDouble();

            if (value <= 0 || index == values.length)
                break;

            values[index++] = value;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += values[i];
        }

        System.out.println("Total sum is " + total);
        input.close();
    }
}
