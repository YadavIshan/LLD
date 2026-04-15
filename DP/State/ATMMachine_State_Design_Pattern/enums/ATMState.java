package DP.State.ATMMachine_State_Design_Pattern.enums;

public enum ATMState {
    READY_FOR_TRANSACTION,
    READ_CARD_DETAILS_AND_PIN,
    READING_CASH_WITHDRAWL_DETAILS,
    DISPENSE_CASH,
    EJECTING_CARD
}
