package behavioural.strategy;

import com.webdude.Demonstrator;

public class StrategyDemonstrator implements Demonstrator {
	@Override
	public void demonstrate() {
		Rar rarStrategy = new Rar();
		SevenZip sevenZip = new SevenZip();
		BackUpCreator backUpCreator = new BackUpCreator(rarStrategy);
		backUpCreator.BackUpFolder(new Content());
		backUpCreator.setArchiveStrategy(sevenZip);
		backUpCreator.BackUpFolder(new Content());
	}
}
