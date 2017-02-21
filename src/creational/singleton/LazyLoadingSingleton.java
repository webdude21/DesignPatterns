package creational.singleton;

public class LazyLoadingSingleton {

    private static LazyLoadingSingleton instance;

    private LazyLoadingSingleton() {
    }

    public static LazyLoadingSingleton getInstance() {
        if (instance == null){
            instance = new LazyLoadingSingleton();
        }

        return instance;
    }
}
