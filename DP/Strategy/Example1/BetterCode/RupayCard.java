package DP.Strategy.Example1.BetterCode;

public class RupayCard extends CreditCard implements IRefundable, IUPIPayable {

    private IRefundStrategy refundStrategy;

    public RupayCard(IRefundStrategy refundStrategy) {
        this.refundStrategy = refundStrategy;
    }

    public void setRefundStrategy(IRefundStrategy refundStrategy) {
        this.refundStrategy = refundStrategy;
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay: Swiping and paying...");
    }

    @Override
    public void doRefund() {
        if (refundStrategy == null) {
            System.out.println("No refund strategy set!");
        } else {
            refundStrategy.refund();
        }
    }

    @Override
    public void onlinePayment() {
        System.out.println("Rupay: Processing online payment...");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Rupay: Tapping and paying...");
    }

    @Override
    public void upiPayment() {
        System.out.println("Rupay: Processing UPI payment...");
    }
}
