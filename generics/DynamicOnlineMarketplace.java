package BridgeLabz_Java.generics;

import java.util.ArrayList;
import java.util.List;

// Base class for product
abstract class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " - Price: " + price);
    }
}

// Different product types
class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }
}

class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price);
    }
}


// Generic Catalog class
class Catalog<T extends Product> {   // T bounded to Product

    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }
}


// Utility class
class MarketplaceUtils {

    // Generic method to apply discount
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        product.price = product.price - (product.price * percentage / 100);
    }

    // Wildcard method to display all products
    public static void displayAll(List<? extends Product> products) {
        for (Product p : products) {
            p.display();
        }
    }
}


// Main class (Question Name)
public class DynamicOnlineMarketplace {

    public static void main(String[] args) {

        Catalog<Book> bookCatalog = new Catalog<>();
        bookCatalog.addProduct(new Book("Java Basics", 500));
        bookCatalog.addProduct(new Book("DSA Guide", 700));

        Catalog<Clothing> clothingCatalog = new Catalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 300));
        clothingCatalog.addProduct(new Clothing("Jeans", 800));

        Catalog<Gadget> gadgetCatalog = new Catalog<>();
        gadgetCatalog.addProduct(new Gadget("Mobile", 15000));
        gadgetCatalog.addProduct(new Gadget("Laptop", 50000));

        // Apply discount using generic method
        MarketplaceUtils.applyDiscount(bookCatalog.getProducts().get(0), 10);

        // Display all products
        System.out.println("Books:");
        MarketplaceUtils.displayAll(bookCatalog.getProducts());

        System.out.println("\nClothing:");
        MarketplaceUtils.displayAll(clothingCatalog.getProducts());

        System.out.println("\nGadgets:");
        MarketplaceUtils.displayAll(gadgetCatalog.getProducts());
    }
}