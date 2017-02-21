package creational.factory;

public abstract class Car {

    int topSpeed;
    int cargoSpace;
    int acceleration;
    int looks;
    int economy;

    Car() {
        this.createCar();
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCargoSpace() {
        return cargoSpace;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getLooks() {
        return looks;
    }

    public int getEconomy() {
        return economy;
    }

    public abstract void createCar();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "topSpeed=" + topSpeed +
                ", cargoSpace=" + cargoSpace +
                ", acceleration=" + acceleration +
                ", looks=" + looks +
                '}';
    }
}
