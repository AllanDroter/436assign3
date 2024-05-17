package assignmentthree;

public class SubmitOrder implements Command{
    Aggregator aggregator;

    public SubmitOrder(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public void execute() {
        // submit order code
    }
}
