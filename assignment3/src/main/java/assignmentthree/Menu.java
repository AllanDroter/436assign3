package assignmentthree;

import java.util.*;

public class Menu {
    ArrayList<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<MenuItem>();
    }

    public void add(int itemNum, String description, double cost) {
        MenuItem item = new MenuItem(itemNum, description, cost);
        menuItems.add(item);
    }

    // replace with iterator
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
