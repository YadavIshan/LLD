package DP.State.ATMMachine_State_Design_Pattern.services;

import DP.State.ATMMachine_State_Design_Pattern.models.Card;

public interface CardManagerService {
    boolean validateCard(Card card , String pin);
    boolean validateWithdrawal(int transactionId , double amount);
    boolean doTransaction(Card card , double amount , int transactionId);
}
