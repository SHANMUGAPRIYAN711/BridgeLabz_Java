package BridgeLabz_Java.Inheritance;

class Order {

    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus() {
        System.out.println("Order Placed");
    }
}

class ShippedOrder extends Order {

    String trackingNumber;

    ShippedOrder(int orderId, String date, String trackingNumber) {
        super(orderId, date);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus() {
        System.out.println("Order Shipped");
    }
}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    DeliveredOrder(int orderId, String date, String trackingNumber, String deliveryDate) {
        super(orderId, date, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        System.out.println("Order Delivered");
    }
}

public class OrderTest {

    public static void main(String[] args) {

        DeliveredOrder order =
                new DeliveredOrder(101, "10 Feb", "TRK123", "15 Feb");

        order.getOrderStatus();
    }
}
