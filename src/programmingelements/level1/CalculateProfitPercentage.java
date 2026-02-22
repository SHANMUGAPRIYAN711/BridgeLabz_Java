package programmingelements.level1;

public class CalculateProfitPercentage {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercentage = profit/ costPrice * 100;
        System.out.println("The Cost Price in INR : "+ " " + costPrice + " "+ "and Selling Price in INR : " +" "+ sellingPrice+"\n "+"enThe profit in INR : " + " "+ profit +" "+ "and the profit percentage is : " + profitPercentage);
    }
}
