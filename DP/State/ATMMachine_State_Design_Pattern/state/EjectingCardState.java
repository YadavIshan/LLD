package DP.State.ATMMachine_State_Design_Pattern.state;

import DP.State.ATMMachine_State_Design_Pattern.enums.ATMState;
import DP.State.ATMMachine_State_Design_Pattern.models.ATM;
import DP.State.ATMMachine_State_Design_Pattern.models.Card;

public class EjectingCardState implements State{

    private final ATM atm;

    public EjectingCardState(ATM atm){
        this.atm = atm;
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while ejecting card.");
    }

    @Override
    public boolean readCardDetailsAndPins(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pins while ejecting card.");
    }

    @Override
    public int dispense(Card card , int amount , int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while ejecting card.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting card");
        this.atm.changeState(new ReadyForTransactionState(this.atm));
    }

    @Override
    public boolean readCashWithdrawlDetails(Card card , int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details while ejecting card.");
    }

    @Override
    public ATMState getState() {
        return ATMState.EJECTING_CARD;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel a transaction while ejecting card.");
    }
}
