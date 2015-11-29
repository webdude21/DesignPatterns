package behavioural.chainofreponsibility;

public class TechnicalDirector extends Approver {
    public TechnicalDirector(Approver superior, int maxAmount) {
        super(superior);
        setMaxAmountToApprove(maxAmount);
    }
}
