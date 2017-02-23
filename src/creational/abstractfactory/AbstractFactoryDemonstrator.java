package creational.abstractfactory;

import com.webdude.Demonstrator;
import creational.factory.CarType;

import java.util.stream.Stream;

public class AbstractFactoryDemonstrator implements Demonstrator {
	@Override
	public void demonstrate() {
		CarFactory carFactory = CarFactory.getCarFactory(Manufacturer.MERCEDES);

		Stream.of(CarType.values())
				.map(carFactory::getCar)
				.forEach(System.out::println);
	}
}
