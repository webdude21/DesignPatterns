package creational.factory;

public class SportsCar extends Car {
    @Override
    public void createCar() {
        acceleration = 10;
        cargoSpace = 1;
        looks = 9;
        topSpeed = 10;
        economy = 1;
    }
}
