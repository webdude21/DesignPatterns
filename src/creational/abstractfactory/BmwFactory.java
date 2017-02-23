package creational.abstractfactory;

import creational.factory.Car;
import creational.factory.CarType;

public class BmwFactory extends CarFactory {
	@Override
	public Car getCar(CarType carType) {
		switch (carType) {
			case ESTATE:
				return new BmwEstateCar();
			case SPORT:
				return new BmwSportsCar();
			case COMPACT:
				return new BmwCompactCar();
			default:
				return null;
		}
	}
}
