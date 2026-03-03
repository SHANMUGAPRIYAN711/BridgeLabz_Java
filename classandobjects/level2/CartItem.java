package BridgeLabz_Java.classandobjects.level2;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Add item
    void addItem(int qty) {
        quantity += qty;
        System.out.println("Item added to cart");
    }

    // Remove item
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Item removed from cart");
        } else {
            System.out.println("Not enough items to remove");
        }
    }

    // Display total cost
    void displayTotalCost() {
        System.out.println("Item Name  : " + itemName);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Laptop", 50000, 1);
        cart.addItem(1);
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}
