package DP.Adapter.ProblematicCode;

public class LegacyBank implements PaymentProcessor {
    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of $" + amount + " via Legacy Bank.");
    }
}
