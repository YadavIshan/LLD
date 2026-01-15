package SOLID.LSP.Example7.BetterCode;

public abstract class CreditCard implements ISwipeable, IOnlinePayable, ITapAndPayable {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    // Common methods accessible via CreditCard reference
    public abstract void swipeAndPay();

    public abstract void onlinePayment();

    public abstract void tapAndPay();
}
