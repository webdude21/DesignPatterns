package behavioural.visitor;

public class RealEstate implements Asset {
	private int estimatedValue;

	private int MonthlyRent;

	RealEstate(int estimatedValue, int monthlyRent) {
		this.estimatedValue = estimatedValue;
		MonthlyRent = monthlyRent;
	}

	public int getEstimatedValue() {
		return estimatedValue;
	}

	int getMonthlyRent() {
		return MonthlyRent;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
