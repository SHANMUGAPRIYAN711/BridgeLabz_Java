package BridgeLabz_Java.classandobjects.level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    void displayItemDetails(int quantity) {
        System.out.println("Item Code   : " + itemCode);
        System.out.println("Item Name   : " + itemName);
        System.out.println("Price       : " + price);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Total Cost  : " + calculateTotalCost(quantity));
    }

    public static void main(String[] args) {
        Item item = new Item(501, "Notebook", 45.50);
        item.displayItemDetails(4);
    }
}
