package assignmentthree;

public class SubmitOrder implements Command{
    Aggregator aggregator;
    int itemNum;

    public SubmitOrder(Aggregator aggregator, int itemNum){
        this.aggregator = aggregator;
        this.itemNum = itemNum;
    }

    public void execute() {
        aggregator.getOrder().add(itemNum);
    }
}
