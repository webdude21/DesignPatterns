package behavioural.visitor;

import com.webdude.Demonstrator;

import java.util.ArrayList;

public class VisitorDemonstrator implements Demonstrator {
	@Override
	public void demonstrate() {

		ArrayList<Asset> assets = new ArrayList<>();
		assets.add(new BankAccount(1000, 0.03));
		assets.add(new BankAccount(3000, 0.5));
		assets.add(new RealEstate(100000, 500));
		assets.add(new Loan(40000, 40));

		IncomeVisitor incomeVisitor = new IncomeVisitor();
		Person person = new Person(assets);
		person.accept(incomeVisitor);

		System.out.println(incomeVisitor.getAmount());
	}
}
