package SOLID.LSP.Example7.ProblematicCode;

public class MasterCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        System.out.println("MasterCard: Swiping and paying...");
    }

    @Override
    public void doRefund() {
        System.out.println("MasterCard: Processing refund...");
    }

    @Override
    public void onlinePayment() {
        System.out.println("MasterCard: Processing online payment...");
    }

    @Override
    public void tapAndPay() {
        System.out.println("MasterCard: Tapping and paying...");
    }

    @Override
    public void upiPayment() {
        throw new UnsupportedOperationException("UPI payment not supported for MasterCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("MasterCard: Processing international payment...");
    }
}
