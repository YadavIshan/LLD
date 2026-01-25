package DP.Factory.BetterCode;

public class CoffeeFactory {
    public static Coffee getCoffee(String coffeeType) {
        if (coffeeType.equals("Espresso")) {
            return new Espresso();
        } else if (coffeeType.equals("Capuccino")) {
            return new Capuccino();
        } else if (coffeeType.equals("VietnameseLatte")) {
            return new VietnameseLatte();
        }
        return null; // Or throw exception
    }
}
