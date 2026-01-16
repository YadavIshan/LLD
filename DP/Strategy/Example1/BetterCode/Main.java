package DP.Strategy.Example1.BetterCode;

public class Main {
    public static void main(String[] args) {
        // 1. Create Strategies
        IRefundStrategy bankStrategy = new RefundToBankAccountStrategy();
        IRefundStrategy walletStrategy = new RefundToWalletStrategy();
        IRefundStrategy sourceStrategy = new RefundToSourceStrategy();

        // 2. Visa Card with Default Strategy (Bank)
        VisaCard visa = new VisaCard(bankStrategy);
        System.out.println("--- Visa Card ---");
        visa.doRefund();

        // Change Strategy at runtime
        System.out.println("Changing Visa strategy to Wallet...");
        visa.setRefundStrategy(walletStrategy);
        visa.doRefund();

        // 3. Rupay Card with Source Strategy
        RupayCard rupay = new RupayCard(sourceStrategy);
        System.out.println("\n--- Rupay Card ---");
        rupay.doRefund();
    }
}
