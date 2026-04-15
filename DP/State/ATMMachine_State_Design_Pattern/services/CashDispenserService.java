package DP.State.ATMMachine_State_Design_Pattern.services;

import DP.State.ATMMachine_State_Design_Pattern.models.ATM;

public interface CashDispenserService {
    boolean dispenseCash(ATM atm , int amount);
}
