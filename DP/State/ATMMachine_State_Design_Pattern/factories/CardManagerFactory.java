package DP.State.ATMMachine_State_Design_Pattern.factories;

import DP.State.ATMMachine_State_Design_Pattern.enums.CardType;
import DP.State.ATMMachine_State_Design_Pattern.services.CardManagerService;
import DP.State.ATMMachine_State_Design_Pattern.services.CreditCardManagerService;
import DP.State.ATMMachine_State_Design_Pattern.services.DebitCardManagerService;

public class CardManagerFactory {
    public static CardManagerService getCardManagerService(CardType cardType){
        if(cardType.equals(CardType.DEBIT)){
            return new DebitCardManagerService();
        }else if(cardType.equals(CardType.CREDIT)){
            return new CreditCardManagerService();
        }else{
            throw new IllegalArgumentException("Invalid card type");
        }
    }
}