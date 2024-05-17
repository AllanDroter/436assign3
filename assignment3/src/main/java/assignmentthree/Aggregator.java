package assignmentthree;

public class Aggregator {
    Menu menu;
    Order order;

    public Aggregator(Menu menu, Order order) {
        this.menu = menu;
        this.order = order;
    }

    public Menu getMenu() {
        return menu;
    }

    public Order getOrder() {
        return order;
    }

    // add getter for tab maybe
}
