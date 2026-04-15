package DP.State.ATMMachine_State_Design_Pattern.DTO;

public class CreateTransactionRequestDTO {
    private final String atmId;

    public CreateTransactionRequestDTO(String atmId) {
        this.atmId = atmId;
    }

    public String getAtmId() {
        return atmId;
    }
}
