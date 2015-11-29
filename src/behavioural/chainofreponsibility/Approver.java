package behavioural.chainofreponsibility;

public abstract class Approver {

    private Approver superior;

    private int maxAmountToApprove;

    protected Approver(Approver superior) {
        this.setSuperior(superior);
    }

    public Approver getSuperior() {
        return superior;
    }

    public void setSuperior(Approver superior) {
        this.superior = superior;
    }

    public boolean ApproveOrder(PurchaseOrder order) {
        if (getMaxAmountToApprove() >= order.getPurchaseOrderAmount()) {
            System.out.printf("Amount %d, approved by: %s%n", order.getPurchaseOrderAmount(), getClass().getSimpleName());
            return true;
        }
        return superior != null && superior.ApproveOrder(order);
    }

    public int getMaxAmountToApprove() {
        return maxAmountToApprove;
    }

    public void setMaxAmountToApprove(int maxAmountToApprove) {
        this.maxAmountToApprove = maxAmountToApprove;
    }
}
