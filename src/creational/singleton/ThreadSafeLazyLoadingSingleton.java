package creational.singleton;

public class ThreadSafeLazyLoadingSingleton {

    private static ThreadSafeLazyLoadingSingleton instance;

    private ThreadSafeLazyLoadingSingleton() {
    }

    public static ThreadSafeLazyLoadingSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazyLoadingSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazyLoadingSingleton();
                }
            }
        }

        return instance;
    }
}
