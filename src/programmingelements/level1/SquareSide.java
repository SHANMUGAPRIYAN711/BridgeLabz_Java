package programmingelements.level1;
import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Perimeter of the Square : " );
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is : " + perimeter + " " +"Whose perimeter is : " + side);
    }
}
