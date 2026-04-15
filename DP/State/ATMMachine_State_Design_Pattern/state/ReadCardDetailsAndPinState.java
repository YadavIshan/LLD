package DP.State.ATMMachine_State_Design_Pattern.state;

import DP.State.ATMMachine_State_Design_Pattern.apis.BackendAPI;
import DP.State.ATMMachine_State_Design_Pattern.enums.ATMState;
import DP.State.ATMMachine_State_Design_Pattern.models.ATM;
import DP.State.ATMMachine_State_Design_Pattern.models.Card;
import DP.State.ATMMachine_State_Design_Pattern.services.CardManagerService;
import DP.State.ATMMachine_State_Design_Pattern.enums.CardType;
import DP.State.ATMMachine_State_Design_Pattern.factories.CardManagerFactory;

public class ReadCardDetailsAndPinState implements State{
    
    private final ATM atm ;

    public ReadCardDetailsAndPinState(ATM atm){
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while reading the card details.");
    }

    @Override
    public boolean readCardDetailsAndPins(Card card , String pin) {
        CardManagerService cardManagerService = CardManagerFactory.getCardManagerService(card.getCardType());
        boolean isCardValid = cardManagerService.validateCard(card, pin);
        if(isCardValid){
            this.atm.changeState(new ReadingCashWithdrawalDetailsState(this.atm));
        }else{
            this.atm.changeState(new EjectingCardState(this.atm));
        }
        return isCardValid;
    }

    @Override
    public int dispense(Card card , int amount , int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while reading the card details.");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while reading card details.");
    }

    @Override
    public boolean readCashWithdrawlDetails(Card card , int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details while reading the card details.");
    }

    @Override
    public ATMState getState() {
        return ATMState.READ_CARD_DETAILS_AND_PIN;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        this.atm.changeState(new ReadyForTransactionState(this.atm));
        return true;
    }
}
