package DP.State.ATMMachine_State_Design_Pattern.state;

import DP.State.ATMMachine_State_Design_Pattern.enums.ATMState;
import DP.State.ATMMachine_State_Design_Pattern.models.ATM;
import DP.State.ATMMachine_State_Design_Pattern.models.Card;
import DP.State.ATMMachine_State_Design_Pattern.services.CardManagerService;
import DP.State.ATMMachine_State_Design_Pattern.services.CashDispenserService;
import DP.State.ATMMachine_State_Design_Pattern.services.CashDispenserServiceImpl;
import DP.State.ATMMachine_State_Design_Pattern.factories.CardManagerFactory;
public class DispenseCashState implements State{

    private final ATM atm;
    private final CashDispenserService cashDispenserService;

    public DispenseCashState(ATM atm ){
        this.atm = atm;
        this.cashDispenserService = new CashDispenserServiceImpl();
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while dispensing cash.");
    }

    @Override
    public boolean readCardDetailsAndPins(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pins while dispensing cash.");
    }

    @Override
    public int dispense(Card card , int amount , int transactionId) {
        CardManagerService cardManagerService = CardManagerFactory.getCardManagerService(card.getCardType());
        boolean isTxnSuccessful = cardManagerService.doTransaction(card, amount, transactionId);
        if(isTxnSuccessful){
            cashDispenserService.dispenseCash(atm, amount);
        }
        this.atm.changeState(new EjectingCardState(this.atm));
        return 0;
    }

    @Override
    public void ejectCard() {
        throw new UnsupportedOperationException("Unimplemented method 'ejectCard'");
    }

    @Override
    public boolean readCashWithdrawlDetails(Card card , int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details while dispensing cash.");
    }

    @Override
    public ATMState getState() {
        return ATMState.DISPENSE_CASH;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel a transaction while dispensing cash.");
    }
}
