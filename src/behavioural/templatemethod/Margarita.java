package behavioural.templatemethod;

public class Margarita extends Pizza {

	@Override
	public void PrepareCrust() {
		System.out.println("Use white flour and an egg");
	}

	@Override
	public void PrepareMainFilling() {
		System.out.println("Put tomatoes and chess");
	}

	@Override
	public void PrepareTopping() {
		System.out.println("Put some olives and greens on top");
	}
}
