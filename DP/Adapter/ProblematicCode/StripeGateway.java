package DP.Adapter.ProblematicCode;

public class StripeGateway {
    public void makePayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency + " via Stripe.");
    }
}
