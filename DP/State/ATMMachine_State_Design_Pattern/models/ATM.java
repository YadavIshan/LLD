package DP.State.ATMMachine_State_Design_Pattern.models;

import DP.State.ATMMachine_State_Design_Pattern.apis.BackendAPI;
import DP.State.ATMMachine_State_Design_Pattern.apis.NodeBackendAPI;
import DP.State.ATMMachine_State_Design_Pattern.state.State;
import DP.State.ATMMachine_State_Design_Pattern.state.ReadyForTransactionState;
import DP.State.ATMMachine_State_Design_Pattern.DTO.UpdateATMStateRequestDTO;

public class ATM {
    private final String atmId;
    private State atmState;
    private final BackendAPI backendAPI;
    ATM(String atmId){
        this.atmId = atmId;
        this.backendAPI = new NodeBackendAPI();
        this.atmState = new ReadyForTransactionState(this);
    }

    public String getAtmId() {
        return atmId;
    }

    public void changeState(State atmState) {
        this.atmState = atmState;
        //Now call the server to store the state on server
        this.backendAPI.updateState(new UpdateATMStateRequestDTO(this.atmId, atmState.getState()));
    }
}
