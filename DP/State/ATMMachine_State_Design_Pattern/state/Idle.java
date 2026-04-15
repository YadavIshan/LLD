package DP.State.ATMMachine_State_Design_Pattern.state;
import DP.State.ATMMachine_State_Design_Pattern.enums.ATMState;
import DP.State.ATMMachine_State_Design_Pattern.models.Card;
public class Idle implements State {
    
    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while idle.");
    }

    @Override
    public boolean readCardDetailsAndPins(Card card , String pin)    {
        throw new IllegalStateException("Cannot read card details and pins while idle.");
    }

    @Override
    public int dispense(Card card , int amount , int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while idle.");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while idle.");
    }

    @Override
    public boolean readCashWithdrawlDetails(Card card , int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details while idle.");
    }

    @Override
    public ATMState getState() {
        return ATMState.READY_FOR_TRANSACTION;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel a transaction while idle.");
    }
}
