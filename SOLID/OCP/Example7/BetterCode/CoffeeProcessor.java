package SOLID.OCP.Example7.BetterCode;

public class CoffeeProcessor {
    private final Coffee coffee;

    public CoffeeProcessor(Coffee coffee) {
        this.coffee = coffee;
    }

    public void brew() {
        coffee.brew();
    }
}
