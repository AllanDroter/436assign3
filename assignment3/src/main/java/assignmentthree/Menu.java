package assignmentthree;

import java.util.*;

public class Menu extends MenuComponent{
    ArrayList<MenuComponent> menuItems = new ArrayList<MenuComponent>();
    String name;

    public Menu(String name) {
        this.name = name;
    }

    // add menu item
    public void add(MenuComponent menuComponent) {
        menuItems.add(menuComponent);
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("\n "+getName());
        System.out.println("------------------");

        MenuIterator iterator = getMenuIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
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

        public MenuComponent next() {
            MenuComponent item = menuItems.get(position);
            position += 1;
            return item;
        }
    }
}
