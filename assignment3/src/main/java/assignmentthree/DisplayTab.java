package assignmentthree;

import java.util.ArrayList; 

public class DisplayTab implements Command{
    Aggregator aggregator;

    public DisplayTab(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public void execute() {
        ArrayList<String> tabItems = aggregator.getTab().getTabItems();
        System.out.println("The items on your tab:\n");
        
        for (String item : tabItems) {
            System.out.println(item);
        } 
    }
}
