package creational.factory;

public class CompactCar extends Car {
    @Override
    public void createCar() {
        topSpeed = 2;
        looks = 6;
        cargoSpace = 2;
        acceleration = 4;
        economy = 10;
    }
}
