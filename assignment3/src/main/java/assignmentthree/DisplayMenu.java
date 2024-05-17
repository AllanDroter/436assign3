package assignmentthree;

import java.util.ArrayList;

public class DisplayMenu implements Command{
    Aggregator aggregator;

    public DisplayMenu(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public void execute() {
        // change after adding iterator
        ArrayList<MenuItem> menuItems = aggregator.getMenu().getMenuItems();
        System.out.println("Our menu items:\n");

        for (MenuItem item : menuItems) {
            System.out.println(item.toString());
        }
    }
}
