package behavioural.templatemethod;

public class Margarita extends Pizza {

	@Override
	public void prepareCrust() {
		System.out.println("Use white flour and an egg");
	}

	@Override
	public void prepareMainFilling() {
		System.out.println("Put tomatoes and chess");
	}

	@Override
	public void prepareTopping() {
		System.out.println("Put some olives and greens on top");
	}
}
