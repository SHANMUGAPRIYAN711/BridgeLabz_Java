package BridgeLabz_Java.keywords;

class Product {

    // Static variable shared by all products
    static double discount = 10;   // 10% discount

    // Instance variables
    String productName;
    double price;
    int quantity;

    // Final variable (cannot be changed after assignment)
    final int productID;

    // Constructor
    Product(String productName, double price, int quantity, int productID) {

        // Using 'this' to resolve ambiguity
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Method to calculate total price after discount
    void displayProductDetails() {

        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discount / 100;
        double finalPrice = totalPrice - discountAmount;

        System.out.println("Product ID   : " + productID);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Discount (%) : " + discount);
        System.out.println("Final Price  : " + finalPrice);
        System.out.println("-----------------------------");
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    public static void main(String[] args) {

        // Creating product objects
        Product p1 = new Product("Laptop", 50000, 1, 101);
        Product p2 = new Product("Headphones", 2000, 2, 102);

        // Using instanceof to validate object type
        if (p1 instanceof Product) {
            p1.displayProductDetails();
        }

        if (p2 instanceof Product) {
            p2.displayProductDetails();
        }

        // Updating discount using static method
        Product.updateDiscount(15);

        // Display again after updating discount
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
