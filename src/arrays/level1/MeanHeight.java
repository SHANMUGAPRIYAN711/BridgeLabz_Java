package arrays.level1;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        // Input heights
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean height is " + mean);

        input.close();
    }
}

