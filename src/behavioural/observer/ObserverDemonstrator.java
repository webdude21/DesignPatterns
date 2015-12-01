package behavioural.observer;

import com.webdude.Demonstrator;

public class ObserverDemonstrator implements Demonstrator {
    @Override
    public void demonstrate() {

        Observable newspaper = new Newspaper();

        for (int i = 1; i < 6; i++) {
            newspaper.register(new Reader(i));
        }

        newspaper.change("December edition of the newspaper is out!!!");
    }
}
