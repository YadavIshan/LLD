package SOLID.LSP.Example7.ProblematicCode;

public abstract class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    // ISP Violation: Forcing subclasses to implement methods they don't support
    // (fat interface).
    // LSP Violation: Subclasses will throw exceptions for unsupported methods,
    // breaking substitutability.
    public abstract void swipeAndPay();

    public abstract void doRefund();

    public abstract void onlinePayment();

    public abstract void tapAndPay();

    public abstract void upiPayment();

    public abstract void internationalPayment();
}
