package programmingelements.level1;
import java.util.Scanner;
public class UniversityFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User input for fee
        System.out.println("Enter Your Fee Amount : ");
        //user input for discount percentage
        double fee = input.nextDouble();
        System.out.println("Enter Your Discount Percentage : ");
        double discountpercent = input.nextDouble();
        double discount = (fee * discountpercent) / 100;
        double finalfeee = fee - discount;
        System.out.println("The discount amount in INR  : " + " " + discount +" "+"and final discounted fee in INR : " + " " + finalfeee);

    }

}
