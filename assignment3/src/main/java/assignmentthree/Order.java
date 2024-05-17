package assignmentthree;

import java.util.*;

public class Order {
    ArrayList<OrderItem> orderItems;

    public Order() {
        orderItems = new ArrayList<OrderItem>();
    }

    // add

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }
}
