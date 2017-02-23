package behavioural.chainofreponsibility;

import com.webdude.Demonstrator;

public class ChainOfResponsibilityDemonstrator implements Demonstrator {
	@Override
	public void demonstrate() {
		System.out.println("Started using the chain of responsibility: ");
		Approver technicalDirector = new TechnicalDirector(null, 100000000);
		Approver manager = new Manager(technicalDirector, 100000);
		Approver teamLead = new TeamLead(manager, 1000);
		teamLead.ApproveOrder(new PurchaseOrder(100));
		teamLead.ApproveOrder(new PurchaseOrder(100000));
		teamLead.ApproveOrder(new PurchaseOrder(1000000));
	}
}
