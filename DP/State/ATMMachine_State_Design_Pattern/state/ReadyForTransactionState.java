package DP.State.ATMMachine_State_Design_Pattern.state;
import DP.State.ATMMachine_State_Design_Pattern.apis.BackendAPI;
import DP.State.ATMMachine_State_Design_Pattern.apis.NodeBackendAPI;
import DP.State.ATMMachine_State_Design_Pattern.enums.ATMState;
import DP.State.ATMMachine_State_Design_Pattern.models.Card;
import DP.State.ATMMachine_State_Design_Pattern.models.ATM;
import DP.State.ATMMachine_State_Design_Pattern.DTO.CreateTransactionRequestDTO;

public class ReadyForTransactionState implements State {


    private final ATM atm ;
    private final BackendAPI atmBackendAPI;

    public ReadyForTransactionState(ATM atm ){
        this.atm = atm;
        this.atmBackendAPI = new NodeBackendAPI();
    }

    @Override
    public int initTransaction() {
        CreateTransactionRequestDTO createTransactionDTO = new CreateTransactionRequestDTO(this.atm.getAtmId());
        int trasactionId = this.atmBackendAPI.createTransaction(createTransactionDTO);

        if(trasactionId == 0 ){
            throw new RuntimeException("Transaction id cannot be null.");
        }

        // Now that we have the transaction id from backend we should move the atm to the next state
        this.atm.changeState(new ReadCardDetailsAndPinState(this.atm));

        return trasactionId;
    }

    @Override
    public boolean readCardDetailsAndPins(Card card , String ping) {
        throw new IllegalStateException("Cannot read card details and pins without inserting the card.");
    }

    @Override
    public int dispense(Card card , int amount , int transactionId) {
        throw new IllegalStateException("Cannot dispense cash without reading the card details.");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card without reading the card details.");
    }

    @Override
    public boolean readCashWithdrawlDetails(Card card , int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdrawal details without reading the card details.");
    }

    @Override
    public ATMState getState() {
        return ATMState.READY_FOR_TRANSACTION;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel a transaction while ready for transaction.");
    }
    
}
