package programmingelements.level1;
import java.util.Scanner;
public class DistanceInYards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance in feet : " );
        double feet = input.nextDouble();
        //distance in yards
        double yards = feet/ 3;
        //distance in miles
        double miles = yards / 1760;
        System.out.println("Your height in cm is : " +  feet + " " + "in yard is" +" "+ yards + "and miles is " + " " + miles);
    }

}
