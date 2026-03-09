package BridgeLabz_Java.objectmodeling;

import java.util.ArrayList;

class product{
    String name;
    double price;
    int quantity;
    product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    double getPrice(){
        return  quantity * price;
    }
}
class Customers1{
    String name;
    ArrayList<product> products = new ArrayList<>();
    Customers1(String name){
        this.name = name;
    }
    void addProducts(product product1){
        products.add(product1);
    }
}
class BillGenerator{
    double generateBill(Customers1 customer){
        double total = 0;
        for(product p : customer.products){
            total += p.getPrice();
        }
        return total;
    }
}
public class GroceryStoreSystem {
    public static void main(String[] args) {
        Customers1 customer = new Customers1("Shanmugapriyan");
        product p1 = new product("Laptop",70000, 5);
        product p2 = new product("Iphone", 70000, 5);
        customer.addProducts(p1);
        customer.addProducts(p2);
        BillGenerator bill = new BillGenerator();
        double totalbill = bill.generateBill(customer);
        System.out.println("Customer Name : " + customer.name);
        System.out.println("Total Bill : " + totalbill);
    }
}

