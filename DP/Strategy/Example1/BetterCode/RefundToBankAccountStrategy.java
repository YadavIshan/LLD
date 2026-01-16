package DP.Strategy.Example1.BetterCode;

public class RefundToBankAccountStrategy implements IRefundStrategy {
    @Override
    public void refund() {
        System.out.println("Refund functionality: Money will be refunded to the registered Bank Account.");
    }
}
