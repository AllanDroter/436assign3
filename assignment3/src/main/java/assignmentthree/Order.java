package assignmentthree;

import java.util.*;

public class Order {
    ArrayList<OrderItem> orderItems;

    public Order() {
        orderItems = new ArrayList<OrderItem>();
    }

    // add order
    public void add(int itemNum) {
        OrderItem item = new OrderItem(itemNum);
        orderItems.add(item);
    }

    // Orders Iterator
    public OrderIterator getOrderIterator() {
        return new OrderItemsIterator();
    }
    private class OrderItemsIterator implements OrderIterator {
        int position = 0;

        public boolean hasNext() {
            if (position >= orderItems.size() || orderItems.get(position) == null) {
                return false;
            }
            return true;
        }

        public OrderItem next() {
            OrderItem item = orderItems.get(position);
            position += 1;
            return item;
        }
    }
}
