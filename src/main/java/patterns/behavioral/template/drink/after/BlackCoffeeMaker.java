package patterns.behavioral.template.drink.after;

/**
 *
 * @author Hany
 */
public class BlackCoffeeMaker extends CoffeeMakerTemplate {

    @Override
    public void boilWater() {
        System.out.println("Boiling water (80) ...");
        coffee.boilWater(80);
    }

    @Override
    public void putCoffee() {
        System.out.println("Putting Coffee (15) ...");
        coffee.addCoffee(15);
    }

    @Override
    public void putAddOns() {
        System.out.println("Putting Sugar (2) ...");
        coffee.addSugar(2);
    }
    
}
