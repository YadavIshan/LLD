package DP.State.ATMMachine_State_Design_Pattern.services;

import DP.State.ATMMachine_State_Design_Pattern.models.ATM;
import DP.State.ATMMachine_State_Design_Pattern.apis.BackendAPI;
import DP.State.ATMMachine_State_Design_Pattern.apis.NodeBackendAPI;
import DP.State.ATMMachine_State_Design_Pattern.DTO.GetATMAmountRequestDTO;

public class CashDispenserServiceImpl implements CashDispenserService {
    private final BackendAPI backendAPI;

    public CashDispenserServiceImpl() {
        this.backendAPI = new NodeBackendAPI();
    }
    @Override
    public boolean dispenseCash(ATM atm , int amount) {
        int atmAmount = this.backendAPI.getATMAmount(new GetATMAmountRequestDTO(atm.getAtmId()));
        if(atmAmount < amount){
            throw new RuntimeException("Insufficient cash in ATM");
        }
        System.out.println("Dispensing cash "+ amount);
        return true;
    }
}