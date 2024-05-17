package assignmentthree;

import java.util.ArrayList;

public class Tab {
    Menu menu;
    Order order;

    public Tab(Menu menu, Order order) {
        this.menu = menu;
        this.order = order;
    }

    public String[] getTabItems() {
        ArrayList<MenuItem> menuItems = menu.getMenuItems();
        ArrayList<OrderItem> orderItems = order.getOrderItems();

        String[] tabItems = new String[orderItems.size()];
        
        for(int i=0; i<orderItems.size(); i++) {
            for(int j=0; j<menuItems.size(); j++) {
                if(menuItems.get(j).getItemNumber() == orderItems.get(i).getItemNum()) {
                    // add iterator (including interface) to menu and order (remove their getter methods)
                    // add getSize methods to menu and order
                    // delete the for loops later and replace with iterator

                    tabItems[i] = ""+orderItems.get(i).getItemNum()+" "+menuItems.get(j).getDescription()+" $"+menuItems.get(j).getCost();
                }
            }
        }

        return tabItems;
    }
}
