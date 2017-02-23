package behavioural.visitor;

public class Loan implements Asset {
	private int owed;

	private int monthlyPayment;

	Loan(int owed, int monthlyPayment) {
		this.owed = owed;
		this.monthlyPayment = monthlyPayment;
	}

	public int getOwed() {
		return owed;
	}

	int getMonthlyPayment() {
		return monthlyPayment;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
