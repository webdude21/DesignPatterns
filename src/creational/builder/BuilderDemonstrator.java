package creational.builder;

import com.webdude.Demonstrator;

public class BuilderDemonstrator implements Demonstrator {
	@Override
	public void demonstrate() {
		Order.Builder builder = new Order.Builder();

		builder.setBeverage("Beer")
				.setBread("White bread")
				.setDressing("Ranch Dressing")
				.setSalad("Cabbage")
				.setMeat("Pork")
				.setDesert("Cake");

		System.out.println(builder.order());
	}
}
