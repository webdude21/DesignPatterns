package behavioural.templatemethod;

public class Pepperoni extends Pizza {

	@Override
	public void prepareCrust() {
		System.out.println("Use white and full grain flour and some eggs");
	}

	@Override
	public void prepareMainFilling() {
		System.out.println("Put peperoni and cheese");
	}

	@Override
	public void prepareTopping() {
		System.out.println("Put some olives and greens and mushrooms on top");
	}

	@Override
	public void bake() {
		System.out.println("bake at 200 degrees for an 10 minutes");
	}
}
