package behavioural.observer;

import com.webdude.Demonstrator;

public class ObserverDeomonstrator implements Demonstrator {
    @Override
    public void demonstrate() {

        Observeble newspaper = new Newspaper();

        for (int i = 1; i < 6; i++) {
            newspaper.register(new Reader(i));
        }

        newspaper.change("December edition of the newspaper is out!!!");
    }
}
