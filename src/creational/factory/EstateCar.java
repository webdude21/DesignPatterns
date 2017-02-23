package creational.factory;

public class EstateCar extends Car {
	@Override
	public void createCar() {
		topSpeed = 4;
		looks = 3;
		cargoSpace = 10;
		acceleration = 5;
		economy = 4;
	}
}
