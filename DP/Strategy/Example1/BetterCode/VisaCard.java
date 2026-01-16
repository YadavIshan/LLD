package DP.Strategy.Example1.BetterCode;

public class VisaCard extends CreditCard implements IRefundable, IInternationalPayable {

    private IRefundStrategy refundStrategy;

    public VisaCard(IRefundStrategy refundStrategy) {
        this.refundStrategy = refundStrategy;
    }

    public void setRefundStrategy(IRefundStrategy refundStrategy) {
        this.refundStrategy = refundStrategy;
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Visa: Swiping and paying...");
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
        System.out.println("Visa: Processing online payment...");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Visa: Tapping and paying...");
    }

    @Override
    public void internationalPayment() {
        System.out.println("Visa: Processing international payment...");
    }
}
