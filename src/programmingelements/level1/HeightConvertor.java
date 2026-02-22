package programmingelements.level1;
import java.util.Scanner;
public class HeightConvertor {
    public static void main(String[] args) {
        //create scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height in Centimeters :");
        double height;
        height = input.nextDouble();
        //convert cm to inches
        double totalInches = height/ 2.54;
        //calculate feet
        int feet = (int) (totalInches / 12);
        //calculate remainig inches
        double inches = totalInches % 2;
        System.out.println("Your height in centimenters  : " + " " + height + " " + "While in feet is : " + feet +" "+ "and inches is " + inches);
    }

}
