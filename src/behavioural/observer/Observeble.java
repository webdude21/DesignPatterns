package behavioural.observer;

public interface Observeble {

    void register(Observer observer);

    void deregister(Observer observer);

    void change(String string);
}
