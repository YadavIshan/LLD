package DP.State.ATMMachine_State_Design_Pattern.services;

import DP.State.ATMMachine_State_Design_Pattern.models.Card;

public class DebitCardManagerService implements CardManagerService{
    @Override
    public boolean validateCard(Card card, String pin) {
        //Should connect with API and validate
        return false;
    }

    @Override
    public boolean validateWithdrawal(int transactionId, double amount) {
        //Should connect with API and validate
        throw new UnsupportedOperationException("Unimplemented method 'validateWithdrawal'");
    }

    @Override
    public boolean doTransaction(Card card, double amount, int transactionId) {
        ///Should connect with API and validate
        return false;
    }
}
