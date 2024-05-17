package assignmentthree;

import java.util.*;

public class Order {
    ArrayList<OrderItem> orderItems;

    public Order() {
        orderItems = new ArrayList<OrderItem>();
    }

    public void add(int itemNum) {
        OrderItem item = new OrderItem(itemNum);
        orderItems.add(item);
    }

    // replace wwith iterator later
    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }
}
