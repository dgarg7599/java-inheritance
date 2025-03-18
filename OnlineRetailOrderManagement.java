// Base class: Order
class Order {
    int orderId;
    String orderDate;

    // Constructor for Order
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status (basic for Order class)
    public String getOrderStatus() {
        return "Order placed";
    }
}

// Subclass: ShippedOrder (inherits from Order)
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor for ShippedOrder
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);  // Call the constructor of the superclass Order
        this.trackingNumber = trackingNumber;
    }

    // Override the getOrderStatus() method to indicate it's shipped
    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder (inherits from ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor for DeliveredOrder
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);  // Call the constructor of ShippedOrder
        this.deliveryDate = deliveryDate;
    }

    // Override the getOrderStatus() method to indicate it's delivered
    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Creating an instance of DeliveredOrder
        DeliveredOrder deliveredOrder = new DeliveredOrder(101, "2025-03-10", "XYZ123", "2025-03-14");

        // Displaying the current order status
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
