package behavioural.chainofreponsibility;

public class TeamLead extends Approver {

    public TeamLead(Approver superior, int maxAmount) {
        super(superior);
        setMaxAmountToApprove(maxAmount);
    }
}
