package behavioural.observer;

import java.util.ArrayList;

public class Newspaper implements Observable {

	private ArrayList<Observer> observers;

	Newspaper() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void change(String string) {
		System.out.printf("We've published: %s%n", string);
		observers.forEach(observer -> observer.update(string));
	}
}
