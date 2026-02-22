package programmingelements.level1;
import java.util.Scanner;
public class CalculateTotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit price : ");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter quantity : ");
        double quantity = sc.nextDouble();

        double total = unitPrice * quantity;
        System.out.println("The total purchase price in INR  : " + total + " "+ "if the quantity" + quantity + " "+ "and unit price is " + unitPrice);
    }

}
