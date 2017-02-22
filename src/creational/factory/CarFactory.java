package creational.factory;

class CarFactory {

    Car getCar(CarType carType) {
        switch (carType) {
            case ESTATE:
                return new EstateCar();
            case SPORT:
                return new SportsCar();
            case COMPACT:
                return new CompactCar();
            default:
                return null;
        }
    }
}
