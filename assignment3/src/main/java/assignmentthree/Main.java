package assignmentthree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MenuComponent mainDishMenu = new Menu("MAIN DISH MENU");
        MenuComponent appetizerMenu = new Menu("APPETIZER MENU");
        MenuComponent dessertMenu = new Menu("DESSERT MENU");

        MenuComponent fullMenu = new Menu("FULL MENU");

        fullMenu.add(mainDishMenu);
        fullMenu.add(appetizerMenu);
        fullMenu.add(dessertMenu);

        mainDishMenu.add(new MenuItem(1, "Roast Beef", 13.75));
        mainDishMenu.add(new MenuItem(2, "Chicken Korma", 10.75));
        mainDishMenu.add(new MenuItem(3, "4-Cheese Pierogis",  9));
        mainDishMenu.add(new MenuItem(4, "Lemon Grilled Chicken", 9.50));
        mainDishMenu.add(new MenuItem(5, "Chicken Biryani", 10.75));
        mainDishMenu.add(new MenuItem(6, "Peking Roast Duck", 13.25));
        mainDishMenu.add(new MenuItem(7, "Mama Yan's Scramble", 8.75));
        mainDishMenu.add(new MenuItem(8, "Martin Yan's Golden Fried Rice", 12.75));

        appetizerMenu.add(new MenuItem(9, "Jiaozi", 9.25));
        appetizerMenu.add(new MenuItem(10, "Greek Salad", 6));
        appetizerMenu.add(new MenuItem(11, "Fruit Salad", 4.50));
        appetizerMenu.add(new MenuItem(12, "Breadsticks", 2.50));
        appetizerMenu.add(new MenuItem(13, "Jalapeno Poppers", 5.75));
        appetizerMenu.add(new MenuItem(14, "Breadsticks & Crab Dip", 8.25));
        appetizerMenu.add(new MenuItem(15, "Scotch Egg", 5.25));

        dessertMenu.add(new MenuItem(16, "Vanilla Gelato", 7));
        dessertMenu.add(new MenuItem(17, "German Chocolate Cake", 5.50));
        dessertMenu.add(new MenuItem(18, "Tiramisu", 7.50));
        dessertMenu.add(new MenuItem(19, "Red Bean Bao", 6.75));
        dessertMenu.add(new MenuItem(20, "Tanghulu", 5.75));
        dessertMenu.add(new MenuItem(21, "Pecan Pie Slice", 6.25));

        // to display options
        Scanner in = new Scanner(System.in);
        int option = displayOptions(in);

        Aggregator aggregator = new Aggregator(fullMenu);
        Invoker invoker = new Invoker(aggregator);

        while (option != 0) {
            System.out.println();

            switch (option) {
                case 1: // display the menus
                    SystemInterface.displayMenu(invoker);
                    break;

                case 2: // submit your order
                    System.out.print("Please enter your order (item number): ");
                    int itemNum = in.nextInt();

                    SystemInterface.submitOrder(invoker, itemNum);
                    System.out.println("Order submitted");
                    break;

                case 3: // display the tab
                    SystemInterface.displayTab(invoker); 
                    break;

                default:
                    System.out.println("Invalid range! Must be 0 through 3");
                    break;
            }
            option = displayOptions(in);
        }
    }

    // to display the options and return the user choice
    public static int displayOptions(Scanner in) {
        System.out.println();
        System.out.println("Your options are:");
        System.out.println("------------------------");
        System.out.println("1 - Display the menus");
        System.out.println("2 - Submit your order");
        System.out.println("3 - Display the tab");
        System.out.println("0 - EXIT");
        System.out.println();
        System.out.print("Please enter your option: ");
        return in.nextInt();
    }
}