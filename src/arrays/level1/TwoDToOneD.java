package arrays.level1;

import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];
        int index = 0;

        // Input matrix
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = input.nextInt();

        // Copy to 1D array
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                array[index++] = matrix[i][j];

        for (int value : array)
            System.out.print(value + " ");

        input.close();
    }
}
