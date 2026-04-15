package DP.State.ATMMachine_State_Design_Pattern.state;

import DP.State.ATMMachine_State_Design_Pattern.enums.ATMState;
import DP.State.ATMMachine_State_Design_Pattern.factories.CardManagerFactory;
import DP.State.ATMMachine_State_Design_Pattern.models.Card;
import DP.State.ATMMachine_State_Design_Pattern.services.CardManagerService;
import DP.State.ATMMachine_State_Design_Pattern.models.ATM;

public class ReadingCashWithdrawalDetailsState implements State{

    private final ATM atm;

    public ReadingCashWithdrawalDetailsState(ATM atm){
        this.atm = atm;
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while reading cash withdrawal details.");
    }

    @Override
    public boolean readCardDetailsAndPins(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pins while reading cash withdrawal details.");
    }

    @Override
    public int dispense(Card card , int amount , int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while reading cash withdrawal details.");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while reading cash withdrawal details.");
    }

    @Override
    public boolean readCashWithdrawlDetails(Card card , int transactionId, int amount) {
        CardManagerService cardManagerService = CardManagerFactory.getCardManagerService(card.getCardType());
        boolean isWithdrawalValid = cardManagerService.validateWithdrawal(transactionId, amount);
        if(isWithdrawalValid){
            this.atm.changeState(new DispenseCashState(this.atm));
        }else{
            this.atm.changeState(new EjectingCardState(this.atm));
        }
        return isWithdrawalValid;
    }

    @Override
    public ATMState getState() {
        return ATMState.READING_CASH_WITHDRAWL_DETAILS;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        this.atm.changeState(new ReadyForTransactionState(this.atm));
        return true;
    }
}
