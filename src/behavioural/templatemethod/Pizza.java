package behavioural.templatemethod;

public abstract class Pizza {

	public abstract void prepareCrust();

	public abstract void prepareMainFilling();

	public abstract void prepareTopping();

	public void bake() {
		System.out.println("bake at 250 degrees for an 12 minutes");
	}

	public Pizza prepare() {
		System.out.printf("Preparing %s pizza!!!%n", getClass().getSimpleName());
		prepareCrust();
		prepareMainFilling();
		prepareTopping();
		bake();
		return this;
	}
}
