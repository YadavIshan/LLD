package DP.Adapter.BetterCode;

import DP.Adapter.ProblematicCode.PaymentProcessor;
import DP.Adapter.ProblematicCode.StripeGateway;

public class StriperAdapter implements PaymentProcessor {

    private StripeGateway stripeGateway;

    public StriperAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void pay(int amount) {
        stripeGateway.makePayment(amount, "USD");
    }
}