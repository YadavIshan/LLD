package SOLID.OCP.Example7.ProblematicCode;

public class Espresso implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }
}
