package DP.Adapter.BetterCode;

import DP.Adapter.ProblematicCode.LegacyBank;
import DP.Adapter.ProblematicCode.PaymentProcessor;
import DP.Adapter.ProblematicCode.StripeGateway;

public class Main {

    public static void main(String[] args) {

        // 1. Existing flow working with PaymentProcessor
        PaymentProcessor bank = new LegacyBank();
        bank.pay(100);

        // 2. The new incompatible class
        StripeGateway stripe = new StripeGateway();

        // 3. Using the Adapter to make it compatible
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);

        stripeAdapter.pay(200);
    }
}
