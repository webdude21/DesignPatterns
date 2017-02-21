package behavioural.chainofreponsibility;

public abstract class Approver {

    private Approver superior;

    private int maxAmountToApprove;

    Approver(Approver superior) {
        this.setSuperior(superior);
    }

    public Approver getSuperior() {
        return superior;
    }

    private void setSuperior(Approver superior) {
        this.superior = superior;
    }

    boolean ApproveOrder(PurchaseOrder order) {
        if (getMaxAmountToApprove() >= order.getPurchaseOrderAmount()) {
            System.out.printf("Amount %d, approved by: %s%n", order.getPurchaseOrderAmount(), getClass().getSimpleName());
            return true;
        }
        return superior != null && superior.ApproveOrder(order);
    }

    private int getMaxAmountToApprove() {
        return maxAmountToApprove;
    }

    void setMaxAmountToApprove(int maxAmountToApprove) {
        this.maxAmountToApprove = maxAmountToApprove;
    }
}
