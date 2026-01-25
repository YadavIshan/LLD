package SOLID.OCP.Example7.BetterCode;

public class Capuccino implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Capuccino");
    }
}
