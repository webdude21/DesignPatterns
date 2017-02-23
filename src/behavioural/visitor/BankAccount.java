package behavioural.visitor;

public class BankAccount implements Asset {

	private int amount;

	private double monthlyInterest;

	BankAccount(int amount, double monthlyInterest) {
		this.amount = amount;
		this.monthlyInterest = monthlyInterest;
	}

	int getAmount() {
		return amount;
	}

	double getMonthlyInterest() {
		return monthlyInterest;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
