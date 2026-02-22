package programmingelements.level1;
import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        double km ;
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles : "+" "+ miles+ " " + "for the given " + " " + km + "km");
    }
}
