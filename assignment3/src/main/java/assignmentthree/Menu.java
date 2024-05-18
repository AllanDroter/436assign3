package assignmentthree;

import java.util.*;

public class Menu {
    ArrayList<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<MenuItem>();
    }

    // add menu item
    public void add(int itemNum, String description, double cost) {
        MenuItem item = new MenuItem(itemNum, description, cost);
        menuItems.add(item);
    }

    // Menu Iterator
    public MenuIterator getMenuIterator() {
        return new MenuItemsIterator();
    }
    private class MenuItemsIterator implements MenuIterator {
        int position = 0;

        public boolean hasNext() {
            if (position >= menuItems.size() || menuItems.get(position) == null) {
                return false;
            }
            return true;
        }

        public MenuItem next() {
            MenuItem item = menuItems.get(position);
            position += 1;
            return item;
        }
    }
}
