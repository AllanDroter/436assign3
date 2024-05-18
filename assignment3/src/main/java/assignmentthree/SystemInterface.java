package assignmentthree;

public class SystemInterface {
    public static void displayMenu(Invoker invoker) {
        invoker.displayMenu();
    }

    public static void submitOrder(Invoker invoker, int itemNum) {
        invoker.submitOrder(itemNum);
    }

    public static void displayTab(Invoker invoker) {
        invoker.displayTab();
    }
}
