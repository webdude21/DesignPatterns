package behavioural.chainofreponsibility;

class TeamLead extends Approver {
	TeamLead(Approver superior, int maxAmount) {
		super(superior);
		setMaxAmountToApprove(maxAmount);
	}
}
