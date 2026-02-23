package controlflow.level1;
import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + (i % 2 == 0 ? " Even" : " Odd"));
        }
        input.close();
    }
}