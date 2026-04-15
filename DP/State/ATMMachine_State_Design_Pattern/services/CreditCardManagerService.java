package DP.State.ATMMachine_State_Design_Pattern.services;

import DP.State.ATMMachine_State_Design_Pattern.models.Card;

public class CreditCardManagerService implements CardManagerService{
    @Override
    public boolean validateCard(Card card, String pin) {
        throw new UnsupportedOperationException("Unimplemented method 'validateCard'");
    }

    @Override
    public boolean validateWithdrawal(int transactionId, double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'validateWithdrawal'");
    }

    @Override
    public boolean doTransaction(Card card, double amount, int transactionId) {
        throw new UnsupportedOperationException("Unimplemented method 'doTransaction'");
    }
}
