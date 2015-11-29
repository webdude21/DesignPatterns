package behavioural.chainofreponsibility;

public class PurchaseOrder {

    private int purchaseOrderAmount;

    public PurchaseOrder(int amount) {
        setPurchaseOrderAmount(amount);
    }

    public int getPurchaseOrderAmount() {
        return purchaseOrderAmount;
    }

    public void setPurchaseOrderAmount(int purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }
}
