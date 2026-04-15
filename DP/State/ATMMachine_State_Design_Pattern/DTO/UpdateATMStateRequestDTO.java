package DP.State.ATMMachine_State_Design_Pattern.DTO;

import DP.State.ATMMachine_State_Design_Pattern.enums.ATMState;

public class UpdateATMStateRequestDTO {
    private final String atmId;
    private final ATMState atmState;

    public UpdateATMStateRequestDTO(String atmId, ATMState atmState) {
        this.atmId = atmId;
        this.atmState = atmState;
    }

    public String getAtmId() {
        return atmId;
    }

    public ATMState getAtmState() {
        return atmState;
    }
}
