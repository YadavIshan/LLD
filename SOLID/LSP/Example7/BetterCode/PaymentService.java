package SOLID.LSP.Example7.BetterCode;

import java.util.ArrayList;
import java.util.List;

// 1. Define the specific capability interface
interface IUPIPayable {
    void upiPayment();
}

// 2. Concrete class implements both the base class and the specific capability
class RupayCard extends CreditCard implements IUPIPayable {

    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Rupay Card...");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Paying Online with Rupay...");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tapping Rupay Card...");
    }

    // Specific feature only for Rupay
    @Override
    public void upiPayment() {
        System.out.println("Processing UPI Payment for Rupay...");
    }
}

class VisaCard extends CreditCard {
    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Visa...");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Paying Online with Visa...");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tapping Visa...");
    }
}

public class PaymentService {

    public void processPayments(List<CreditCard> cards) {
        for (CreditCard card : cards) {
            // Standard polymorphism works for common methods
            card.swipeAndPay();

            // CAPABILITY CHECK (The Solution)
            // Instead of checking "is this RupayCard?", check "can this do UPI?"
            if (card instanceof IUPIPayable) {
                ((IUPIPayable) card).upiPayment();
            }
        }
    }

    public static void main(String[] args) {
        List<CreditCard> cards = new ArrayList<>();
        cards.add(new RupayCard());
        cards.add(new VisaCard());

        new PaymentService().processPayments(cards);
    }
}
