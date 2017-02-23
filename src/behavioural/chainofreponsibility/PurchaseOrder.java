package behavioural.chainofreponsibility;

class PurchaseOrder {

	private int purchaseOrderAmount;

	PurchaseOrder(int amount) {
		setPurchaseOrderAmount(amount);
	}

	int getPurchaseOrderAmount() {
		return purchaseOrderAmount;
	}

	private void setPurchaseOrderAmount(int purchaseOrderAmount) {
		this.purchaseOrderAmount = purchaseOrderAmount;
	}
}
