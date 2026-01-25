package SOLID.OCP.Example7.BetterCode;

public class Espresso implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }
}
