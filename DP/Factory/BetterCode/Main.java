package DP.Factory.BetterCode;

public class Main {
    public static void main(String[] args) {
        CoffeeProcessor service1 = new CoffeeProcessor("Espresso");
        service1.brew();

        CoffeeProcessor service2 = new CoffeeProcessor("Capuccino");
        service2.brew();
    }
}
