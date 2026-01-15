package SOLID.LSP.Example7.ProblematicCode;

public class VisaCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        System.out.println("Visa: Swiping and paying...");
    }

    @Override
    public void doRefund() {
        System.out.println("Visa: Processing refund...");
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
    public void upiPayment() {
        throw new UnsupportedOperationException("UPI payment not supported for Visa");
    }

    @Override
    public void internationalPayment() {
        System.out.println("Visa: Processing international payment...");
    }
}
