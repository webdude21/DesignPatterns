package behavioural.visitor;

interface Visitor {
	void visit(RealEstate asset);

	void visit(BankAccount asset);

	void visit(Loan asset);
}
