package assignmentthree;

public class Aggregator {
    MenuComponent menuComponent;
    Order order;

    public Aggregator(MenuComponent menuComponent, Order order) {
        this.menuComponent = menuComponent;
        this.order = order;
    }

    public MenuComponent getMenu() {
        return menuComponent;
    }

    public Order getOrder() {
        return order;
    }

    public Tab getTab() {
        return new Tab(menuComponent, order);
    }
}
