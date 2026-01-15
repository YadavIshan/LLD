package SOLID.LSP.Example7.ProblematicCode;

public abstract class CreditCard {
    
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    //Even though different cards have different features, we are making a common interface for all of them
    //which is violation of ISP AND LSP
    public abstract void swipeAndPay();
    public abstract void doRefund();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
    public abstract void upiPayment();
    public abstract void internationalPayment();
}
