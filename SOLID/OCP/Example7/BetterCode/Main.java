package SOLID.OCP.Example7.BetterCode;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        CoffeeProcessor service1 = new CoffeeProcessor(espresso);
        service1.brew();

        Coffee capuccino = new Capuccino();
        CoffeeProcessor service2 = new CoffeeProcessor(capuccino);
        service2.brew();
    }
}
