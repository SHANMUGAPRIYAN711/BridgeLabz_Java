package programmingelements.level1;
import java.util.Scanner;
public class HandShake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Students : ");
        int numberOfStudents = input.nextInt();
        int handShake = (numberOfStudents * (numberOfStudents - 1) / 2);
        System.out.println("The maximum  number of handshake is " + handShake);
    }

}
