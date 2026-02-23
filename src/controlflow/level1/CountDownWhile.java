package controlflow.level1;

import java.util.Scanner;

public class CountDownWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        input.close();
    }
}
