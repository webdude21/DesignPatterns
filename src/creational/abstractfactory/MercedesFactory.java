package creational.abstractfactory;

import creational.factory.Car;
import creational.factory.CarType;

public class MercedesFactory extends CarFactory {
	@Override
	public Car getCar(CarType carType) {
		switch (carType) {
			case ESTATE:
				return new MercedesEstateCar();
			case SPORT:
				return new MercedesSportsCar();
			case COMPACT:
				return new MercedesCompactCar();
			default:
				return null;
		}
	}
}
