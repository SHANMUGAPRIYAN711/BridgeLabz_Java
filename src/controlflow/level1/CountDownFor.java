package controlflow.level1;

import java.util.Scanner;

public class CountDownFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }

        input.close();
    }
}
