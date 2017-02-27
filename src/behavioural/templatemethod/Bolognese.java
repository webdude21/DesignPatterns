package behavioural.templatemethod;

public class Bolognese extends Pizza {
	@Override
	public void prepareCrust() {
		System.out.println("Use white flour and two eggs");
	}

	@Override
	public void prepareMainFilling() {
		System.out.println("Put tomatoes, cheese and ground meat");
	}

	@Override
	public void prepareTopping() {
		System.out.println("Put some olives and mushrooms on top");
	}

	@Override
	public void bake() {
		System.out.println("Bake at 300 degrees for an 15 minutes");
	}
}
