package DP.State.ATMMachine_State_Design_Pattern.entity;


public class Card {
    private final long cardNumber;
    private final int pin;
    private final String cardHolderName;
    private final String expiryDate;
    private final String cvv;
    private final String bankName;  
    
    public Card(long cardNumber, int pin, String cardHolderName, String expiryDate, String cvv, String bankName) {
        this.cardNumber = cardNumber;
        this.pin = pin; 
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.bankName = bankName;
    }

    public long getCardNumber() {
        return cardNumber;
    }
    public int getPin() {
        return pin;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public String getCvv() {
        return cvv;
    }
    public String getBankName() {
        return bankName;
    }
}
