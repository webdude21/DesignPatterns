package creational.abstractfactory;

import creational.factory.Car;
import creational.factory.CarType;

abstract class CarFactory {

	static CarFactory getCarFactory(Manufacturer manufacturer) {
		switch (manufacturer) {
			case AUDI:
				return new AudiFactory();
			case BMW:
				return new BmwFactory();
			case MERCEDES:
				return new MercedesFactory();
			default:
				return null;
		}
	}

	public abstract Car getCar(CarType carType);
}
