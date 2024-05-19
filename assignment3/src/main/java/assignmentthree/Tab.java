package assignmentthree;

import java.util.ArrayList;

public class Tab {
    MenuComponent menuComponent;
    Order order;

    public Tab(MenuComponent menuComponent, Order order) {
        this.menuComponent = menuComponent;
        this.order = order;
    }

    public ArrayList<String> getTabItems() {
        MenuIterator menuIterator = menuComponent.getMenuIterator();
        OrderIterator orderIterator = order.getOrderIterator();

        ArrayList<String> tabItems = new ArrayList<String>();

        while(orderIterator.hasNext()) {
            OrderItem oItem = orderIterator.next();

            while (menuIterator.hasNext()) {
                MenuComponent mItem = menuIterator.next();

                MenuIterator menuIterator2 = mItem.getMenuIterator();

                while (menuIterator2.hasNext()) {
                    MenuComponent mItem2 = menuIterator2.next();

                    if(mItem2.getItemNumber() == oItem.getItemNum()) {
                        tabItems.add(mItem2.toString());
                    }
                }
            }
        }
        return tabItems;
    }
}
