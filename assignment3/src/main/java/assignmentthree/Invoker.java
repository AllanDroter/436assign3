package assignmentthree;

public class Invoker {
    Aggregator aggregator;

    public Invoker(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public void displayMenu() {
        Command command = new DisplayMenu(aggregator);
        command.execute();
    }

    public void submitOrder(int itemNum) {
        Command command = new SubmitOrder(aggregator, itemNum);
        command.execute();
    }

    public void displayTab() {
        Command command = new DisplayTab(aggregator);
        command.execute(); 
    }
}
