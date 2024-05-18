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
        
        // for(int i=0; i<orderItems.size(); i++) {
        //     for(int j=0; j<menuItems.size(); j++) {
        //         if(menuItems.get(j).getItemNumber() == orderItems.get(i).getItemNum()) {
        //             // add iterator (including interface) to menu and order (remove their getter methods)
        //             // add getSize methods to menu and order
        //             // delete the for loops later and replace with iterator

        //             tabItems[i] = ""+orderItems.get(i).getItemNum()+" "+menuItems.get(j).getDescription()+" $"+menuItems.get(j).getCost();
        //         }
        //     }
        // }

        while(orderIterator.hasNext()) {
            OrderItem oItem = orderIterator.next();

            while (menuIterator.hasNext()) {
                MenuComponent mItem = menuIterator.next();

                if(mItem.getItemNumber() == oItem.getItemNum()) {
                    tabItems.add(mItem.toString());
                }
            }
        }

        return tabItems;
    }
}
