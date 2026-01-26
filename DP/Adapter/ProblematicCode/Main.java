package DP.Adapter.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        // We want to treat everything as a PaymentProcessor
        PaymentProcessor processor;

        // This is a 3rd party library we want to use
        StripeGateway stripe = new StripeGateway();

        // PROBLEM: Compile error! Stripe does not implement PaymentProcessor.
        // processor = stripe;

        stripe.makePayment(500, "USD");
    }
}
