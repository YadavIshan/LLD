package SOLID.LSP.Example7.ProblematicCode;

public class DinersCard extends CreditCard{
    
    @Override
    public void swipeAndPay() {
        System.out.println("DinersCard: Swiping and paying...");
    }

    @Override
    public void doRefund() {
        throw new UnsupportedOperationException("Refund not supported for DinersCard");
    }

    @Override
    public void onlinePayment() {
        System.out.println("DinersCard: Processing online payment...");
    }

    @Override
    public void tapAndPay() {
        System.out.println("DinersCard: Tapping and paying...");
    }

    @Override
    public void upiPayment() {
        throw new UnsupportedOperationException("UPI payment not supported for DinersCard");
    }

    @Override
    public void internationalPayment() {
        System.out.println("DinersCard: Processing international payment...");
    }
}
