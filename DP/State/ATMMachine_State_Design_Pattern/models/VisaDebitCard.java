package DP.State.ATMMachine_State_Design_Pattern.models;

import DP.State.ATMMachine_State_Design_Pattern.enums.CardType;

public class VisaDebitCard extends Card implements Visa , Debit{
    public VisaDebitCard(long cardNumber, int pin, String name, CardType cardType, String bankName) {
        super(cardNumber, pin, name, cardType, bankName);
    }

    @Override
    public void connectToVisa() {
        System.out.println("Connecting to Visa Network");
    }

    @Override
    public void makePinPayment() {
        this.connectToVisa();
        System.out.println("Making Pin Payment");
    }
}
