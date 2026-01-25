package SOLID.OCP.Example7.ProblematicCode;

public class CoffeeProcessor {
    private Coffee coffee;

    public CoffeeProcessor(String coffee) {
        if(coffee.equals("Espresso")) {
            this.coffee = new Espresso();
        } else if(coffee.equals("Capuccino")) {
            this.coffee = new Capuccino();
        } else if(coffee.equals("VietnameseLatte")) {
            this.coffee = new VietnameseLatte();
        }
    }

    public void brew() {
        coffee.brew();
    }
    
}
