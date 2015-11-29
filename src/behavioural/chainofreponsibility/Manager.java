package behavioural.chainofreponsibility;

public class Manager extends Approver {
    public Manager(Approver superior, int maxAmount) {
        super(superior);
        setMaxAmountToApprove(maxAmount);
    }
}
