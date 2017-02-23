package creational.builder;

public class Order {

	private final String bread;

	private final String dressing;

	private final String salad;

	private final String meat;

	private final String beverage;

	private final String desert;

	private Order(Builder builder) {
		bread = builder.bread;
		salad = builder.salad;
		meat = builder.meat;
		dressing = builder.dressing;
		beverage = builder.beverage;
		desert = builder.desert;
	}

	@Override
	public String toString() {
		return "Order{" +
				"bread='" + bread + '\'' +
				", dressing='" + dressing + '\'' +
				", salad='" + salad + '\'' +
				", meat='" + meat + '\'' +
				", beverage='" + beverage + '\'' +
				", desert='" + desert + '\'' +
				'}';
	}

	public String getBread() {
		return bread;
	}

	public String getDressing() {
		return dressing;
	}

	public String getSalad() {
		return salad;
	}

	public String getMeat() {
		return meat;
	}

	public String getBeverage() {
		return beverage;
	}

	public String getDesert() {
		return desert;
	}

	public static class Builder {

		private String bread;

		private String dressing;

		private String salad;

		private String meat;

		private String beverage;

		private String desert;

		public Order order() {
			return new Order(this);
		}

		public Builder setBread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder setDressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder setSalad(String salad) {
			this.salad = salad;
			return this;
		}

		public Builder setMeat(String meat) {
			this.meat = meat;
			return this;
		}

		public Builder setBeverage(String beverage) {
			this.beverage = beverage;
			return this;
		}

		public Builder setDesert(String desert) {
			this.desert = desert;
			return this;
		}
	}
}
