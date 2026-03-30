package BridgeLabz_Java.collections;

import java.util.*;

public class ShoppingCart {

    // 1. Store product prices (Product → Price)
    static Map<String, Double> productPrices = new HashMap<>();

    // 2. Maintain cart order (Product → Quantity)
    static Map<String, Integer> cart = new LinkedHashMap<>();

    public static void main(String[] args) {

        // Initialize product catalog
        productPrices.put("Laptop", 50000.0);
        productPrices.put("Phone", 20000.0);
        productPrices.put("Headphones", 2000.0);
        productPrices.put("Mouse", 500.0);

        // Add items to cart
        addToCart("Laptop", 1);
        addToCart("Mouse", 2);
        addToCart("Phone", 1);
        addToCart("Headphones", 3);

        // Display cart (in insertion order)
        displayCart();

        // Display sorted by price
        displaySortedByPrice();

        // Calculate total bill
        calculateTotal();
    }

    // Add product to cart
    static void addToCart(String product, int quantity) {

        // Check if product exists
        if (!productPrices.containsKey(product)) {
            System.out.println("Product not found: " + product);
            return;
        }

        // Update quantity (LinkedHashMap maintains order)
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    // Display cart items
    static void displayCart() {
        System.out.println("\nCart Items (Insertion Order):");

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int qty = entry.getValue();
            double price = productPrices.get(product);

            System.out.println(product + " | Qty: " + qty + " | Price: " + price);
        }
    }

    // Display items sorted by price using TreeMap
    static void displaySortedByPrice() {

        System.out.println("\nItems Sorted by Price:");

        // Custom TreeMap sorting by price
        TreeMap<String, Double> sorted = new TreeMap<>(
                (p1, p2) -> {
                    int cmp = productPrices.get(p1).compareTo(productPrices.get(p2));
                    return (cmp != 0) ? cmp : p1.compareTo(p2); // avoid duplicates
                }
        );

        // Add only cart items
        for (String product : cart.keySet()) {
            sorted.put(product, productPrices.get(product));
        }

        for (Map.Entry<String, Double> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Calculate total bill
    static void calculateTotal() {

        double total = 0;

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int qty = entry.getValue();
            double price = productPrices.get(product);

            total += price * qty;
        }

        System.out.println("\nTotal Bill: " + total);
    }
}
