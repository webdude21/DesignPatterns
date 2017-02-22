package creational.abstractfactory;

import creational.factory.Car;

abstract class CarFactory {

	public static CarFactory getCarFactory(Manufacturer manufacturer) {
		switch (manufacturer) {
			case AUDI:
				return new AudiFactory();
			case BMW:
				return new BwwFactory();
			case MERCEDES:
				return new MercedesFactory();
			default:
				return null;
		}
	}

	public abstract Car getCar();
}
