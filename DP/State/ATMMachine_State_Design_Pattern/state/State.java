package DP.State.ATMMachine_State_Design_Pattern.state;

import DP.State.ATMMachine_State_Design_Pattern.enums.ATMState;
import DP.State.ATMMachine_State_Design_Pattern.models.Card;

public interface State {
    int initTransaction();

    boolean readCardDetailsAndPins(Card card , String pin);

    int dispense(Card card , int amount , int transactionId);    

    void ejectCard();

    boolean readCashWithdrawlDetails(Card card , int transactionId , int amount);

    ATMState getState();

    boolean cancelTransaction(int transactionId);

}
