package creational.singleton;

public class StaticSingleton {

	private static StaticSingleton instance = new StaticSingleton();

	private StaticSingleton() {
	}

	public static StaticSingleton getInstance() {
		return instance;
	}
}
