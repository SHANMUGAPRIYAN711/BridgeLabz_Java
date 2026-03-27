package BridgeLabz_Java.generics;
import java.util.ArrayList;
import java.util.List;
abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) {
        this.name = name;
    }
    public abstract void display();
}
// Electronics item
class Electronics extends WarehouseItem {

    public Electronics(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Electronics Item: " + name);
    }
}

// Grocery item
class Groceries extends WarehouseItem {

    public Groceries(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Grocery Item: " + name);
    }
}

// Furniture item
class Furniture extends WarehouseItem {

    public Furniture(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Furniture Item: " + name);
    }
}

// GENERIC STORAGE CLASS
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    // Add item into storage
    public void addItem(T item) {
        items.add(item);
    }

    // Return all stored items
    public List<T> getItems() {
        return items;
    }
}
class WarehouseUtils {

    // Wildcard method to display any type of WarehouseItem list
    public static void displayAllItems(List<? extends WarehouseItem> items) {

        System.out.println("\nDisplaying items:");

        // Loop through items and call display()
        for (WarehouseItem item : items) {
            item.display();  // Runtime polymorphism
        }
    }
}
public class SmartWarehouseManagementSystem {

    public static void main(String[] args) {

        // Create storage for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        // Create storage for Groceries
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        // Create storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Display all items using wildcard method
        WarehouseUtils.displayAllItems(electronicsStorage.getItems());
        WarehouseUtils.displayAllItems(groceryStorage.getItems());
        WarehouseUtils.displayAllItems(furnitureStorage.getItems());
    }
}