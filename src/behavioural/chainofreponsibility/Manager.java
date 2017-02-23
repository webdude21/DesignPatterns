package behavioural.chainofreponsibility;

class Manager extends Approver {
	Manager(Approver superior, int maxAmount) {
		super(superior);
		setMaxAmountToApprove(maxAmount);
	}
}
