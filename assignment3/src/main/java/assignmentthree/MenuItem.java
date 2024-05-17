package assignmentthree;

public class MenuItem {
    int itemNum;
    String description;
    double cost;

    // public MenuItem() {
    //     name = null;
    //     category = 0;
    //     price = 0;
    // }
    
    public MenuItem(int itemNum, String description, double cost) {
        this.itemNum = itemNum;
        this.description = description;
        this.cost = cost;
    }

    public int getItemNumber() {
        return itemNum;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
