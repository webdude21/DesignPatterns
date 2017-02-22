package creational.abstractfactory;

import com.webdude.Demonstrator;

public class AbstractFactoryDemonstrator implements Demonstrator {
	@Override
	public void demonstrate() {
		CarFactory carFactory = new BwwFactory();
	}
}
