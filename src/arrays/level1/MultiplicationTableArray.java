package arrays.level1;
import java.util.Scanner;
public class MultiplicationTableArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] table = new int[10];

        // Store multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}
