package DP.State.ATMMachine_State_Design_Pattern.apis;

import DP.State.ATMMachine_State_Design_Pattern.DTO.CreateTransactionRequestDTO;
import DP.State.ATMMachine_State_Design_Pattern.DTO.GetATMAmountRequestDTO;
import DP.State.ATMMachine_State_Design_Pattern.DTO.UpdateATMStateRequestDTO;

public interface BackendAPI {
    int createTransaction(CreateTransactionRequestDTO createTransactionDTO);

    boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO);

    int getATMAmount(GetATMAmountRequestDTO getATMAmountRequestDTO);
}