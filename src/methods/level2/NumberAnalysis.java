package methods.level2;

import java.util.Scanner;

class NumberAnalysis {

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            if (isPositive(arr[i])) {
                System.out.println(isEven(arr[i]) ? "Positive Even" : "Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);
        System.out.println(result == 0 ? "Equal" : result > 0 ? "First Greater" : "Last Greater");

        input.close();
    }
}