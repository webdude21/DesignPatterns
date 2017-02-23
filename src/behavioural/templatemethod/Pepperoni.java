package behavioural.templatemethod;

public class Pepperoni extends Pizza {

	@Override
	public void PrepareCrust() {
		System.out.println("Use white and full grain flour and some eggs");
	}

	@Override
	public void PrepareMainFilling() {
		System.out.println("Put peperoni and cheese");
	}

	@Override
	public void PrepareTopping() {
		System.out.println("Put some olives and greens and mushrooms on top");
	}

	@Override
	public void Bake() {
		System.out.println("Bake at 200 degrees for an 10 minutes");
	}
}
