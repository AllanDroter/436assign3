package assignmentthree;

public class Aggregator {
    MenuComponent menuComponent;
    Order order;

    public Aggregator(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
        order = new Order();
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
