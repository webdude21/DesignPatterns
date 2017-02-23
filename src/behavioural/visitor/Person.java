package behavioural.visitor;

import java.util.ArrayList;

public class Person implements Asset {

	private final ArrayList<Asset> assets;

	Person(ArrayList<Asset> assets) {
		this.assets = assets;
	}

	@Override
	public void accept(Visitor visitor) {
		assets.forEach(x -> x.accept(visitor));
	}
}
