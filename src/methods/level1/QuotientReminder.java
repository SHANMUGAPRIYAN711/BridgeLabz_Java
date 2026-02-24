package methods.level1;

import java.util.Scanner;

public class QuotientReminder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int divisor = input.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient : " + result[0]);
        System.out.println("Reminder : " + result[1]);
        input.close();
    }
}
