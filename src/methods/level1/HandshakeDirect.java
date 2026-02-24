package methods.level1;

import java.util.Scanner;

public class HandshakeDirect {
    static int handShake(int numberOfStudent){
        return (numberOfStudent * (numberOfStudent - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Students :");
        int numberOfStudent = input.nextInt();
        int result = handShake(numberOfStudent);
        System.out.println("Display HandShake : " + result );
    }
}
