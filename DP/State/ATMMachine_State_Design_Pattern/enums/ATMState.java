package DP.State.ATMMachine_State_Design_Pattern.enums;

public enum ATMState {
    IDLE,
    INSERT_CARD,
    INSERT_PIN,
    WITHDRAW,
    WITHDRAWN,
    RETURN_CARD,
    RETURNED_CARD,
    ERROR;
}
