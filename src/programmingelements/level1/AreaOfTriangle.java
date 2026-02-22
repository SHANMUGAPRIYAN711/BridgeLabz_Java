package programmingelements.level1;
import java.util.Scanner;
public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //user input for base
        System.out.println("Enter the base in cm:");
        double baseCm = input.nextDouble();

        // user input for height
        System.out.println("Enter the height in cm:");
        double heightCm = input.nextDouble();

        // Calculate area in square centimeters using triangle formula
        double areaInSquareCm = 0.5 * baseCm * heightCm;

        // Conversion factor from square centimeters to square inches
        double squareCmToSquareInch = 1 / (2.54 * 2.54);

        // Convert area to square inches
        double areaInSquareInches = areaInSquareCm * squareCmToSquareInch;

        System.out.println(
                "The area of the triangle is " + areaInSquareCm + " square cm " + "and " + areaInSquareInches + " square inches"
        );
    }

}
