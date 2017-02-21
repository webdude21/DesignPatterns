package creational.factory;

import com.webdude.Demonstrator;

import java.util.stream.Stream;

public class FactoryDemonstrator implements Demonstrator {
    @Override
    public void demonstrate() {
        CarFactory carFactory = new CarFactory();

        Stream.of(CarType.values())
                .map(carFactory::getCar)
                .forEach(System.out::println);
    }
}
