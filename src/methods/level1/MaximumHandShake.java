package methods.level1;

import java.util.Scanner;

public class MaximumHandShake {
    public static int CountHandShake(int numberOfStudent){
        int combination =  (numberOfStudent * (numberOfStudent - 1)) / 2;
        return combination;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudent =input.nextInt();
        int result = CountHandShake(numberOfStudent);
        System.out.println("The maximum number of Handshake "+ result);
        input.close();
    }
}
