package creational.abstractfactory;

import creational.factory.Car;
import creational.factory.CarType;

class AudiFactory extends CarFactory {

	@Override
	public Car getCar(CarType carType) {
		switch (carType) {
			case ESTATE:
				return new AudiEstateCar();
			case SPORT:
				return new AudiSportsCar();
			case COMPACT:
				return new AudiCompactCar();
			default:
				return null;
		}
	}
}
