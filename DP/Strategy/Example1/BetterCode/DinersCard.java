package DP.Strategy.Example1.BetterCode;

public class DinersCard extends CreditCard implements IInternationalPayable {

    @Override
    public void swipeAndPay() {
        System.out.println("DinersCard: Swiping and paying...");
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
    public void internationalPayment() {
        System.out.println("DinersCard: Processing international payment...");
    }
}
