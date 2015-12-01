package behavioural.observer;

public class Reader implements Observer {

    private int readerNumber;

    Reader(int readerNumber) {

        this.readerNumber = readerNumber;
    }

    @Override
    public void update(String string) {
        System.out.printf("Reader %d read the %s%n", readerNumber, string);
    }
}
