package behavioural.chainofreponsibility;

class TechnicalDirector extends Approver {
	TechnicalDirector(Approver superior, int maxAmount) {
		super(superior);
		setMaxAmountToApprove(maxAmount);
	}
}
