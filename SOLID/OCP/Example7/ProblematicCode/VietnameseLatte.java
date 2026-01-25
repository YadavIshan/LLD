package SOLID.OCP.Example7.ProblematicCode;
public class VietnameseLatte implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Vietnamese Latte");
    }
}
