package programmingelements.level1;

public class FeeDiscount {
    public static void main(String[] args) {
        double studentFee = 125000;
        double discountPercent = 10;
        double discount = studentFee * discountPercent / 100;
        double finalFees = studentFee - discount;
        System.out.println("The discount amount is INR : " + " " + discount + " " + "and final discounted fee in INR is : " + finalFees);
    }
}
