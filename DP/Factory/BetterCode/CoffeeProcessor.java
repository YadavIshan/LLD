package DP.Factory.BetterCode;

public class CoffeeProcessor {
    private final Coffee coffee;

    public CoffeeProcessor(String coffee) {
        this.coffee = CoffeeFactory.getCoffee(coffee);
    }

    public void brew() {
        coffee.brew();
    }
}
