package DP.State.ATMMachine_State_Design_Pattern.apis;

import DP.State.ATMMachine_State_Design_Pattern.DTO.CreateTransactionRequestDTO;
import DP.State.ATMMachine_State_Design_Pattern.DTO.UpdateATMStateRequestDTO;
import DP.State.ATMMachine_State_Design_Pattern.DTO.GetATMAmountRequestDTO;

public class NodeBackendAPI implements BackendAPI{
    //What if some part is supporting node backend and some are supporting python backend
    @Override
    public int createTransaction(CreateTransactionRequestDTO createTransactionDTO){
        //1. Validation
        if(createTransactionDTO.getAtmId() == null || createTransactionDTO.getAtmId().isEmpty()){
            throw new IllegalArgumentException("ATM ID cannot be null or empty.");
        }
        //2. Connect to the backend 
        // mImic the backend call 
        int transactionId = (int) (Math.random() * 1000000);

        //3. Return the response
        return transactionId;
    }

    @Override
    public boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO) {
        // Assume that there is an implementation that call the backend to update the state ;
        return true;
    }

    @Override
    public int getATMAmount(GetATMAmountRequestDTO getATMAmountRequestDTO) {
        return 100000;
    }
}
