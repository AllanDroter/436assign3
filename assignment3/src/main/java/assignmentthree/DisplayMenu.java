package assignmentthree;

public class DisplayMenu implements Command {
    Aggregator aggregator;

    public DisplayMenu(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public void execute() {
        // change after adding iterator
        // MenuIterator menuIterator = aggregator.getMenu().getMenuIterator();
        // // ArrayList<MenuItem> menuItems = aggregator.getMenu().getMenuItems();
        // System.out.println("Our menu items:\n");

        // // for (MenuItem item : menuItems) {
        // //     System.out.println(item.toString());
        // // }

        // while (menuIterator.hasNext()) {
        //     System.out.println(menuIterator.next().toString());
        // }
        aggregator.getMenu().print();
    }
}
