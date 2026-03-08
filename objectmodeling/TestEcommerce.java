package BridgeLabz_Java.objectmodeling;

import java.util.ArrayList;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {

    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    void displayOrder() {

        System.out.println("Order Details:");

        for (Product p : products) {
            System.out.println(p.name + " - " + p.price);
        }
    }
}

class Customer {

    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {

        System.out.println(name + " placed an order.");
        o.displayOrder();
    }
}

public class TestEcommerce {

    public static void main(String[] args) {

        Customer c = new Customer("Shanmugapriyan");

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);

        Order order = new Order();

        order.addProduct(p1);
        order.addProduct(p2);

        c.placeOrder(order);
    }
}