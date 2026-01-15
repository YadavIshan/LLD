package SOLID.LSP.Example7.BetterCode;

public class RupayCard extends CreditCard implements IRefundable, IUPIPayable {

    @Override
    public void swipeAndPay() {
        System.out.println("Rupay: Swiping and paying...");
    }

    @Override
    public void doRefund() {
        System.out.println("Rupay: Processing refund...");
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
