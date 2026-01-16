package DP.Strategy.Example1.ProblematicCode;

public class VisaCard extends CreditCard implements IRefundable, IInternationalPayable {

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
    public void internationalPayment() {
        System.out.println("Visa: Processing international payment...");
    }
}
