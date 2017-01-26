package patterns.behavioral.template.drink.before;

/**
 *
 * @author Hany
 */
public class BlackCoffeeMaker extends AbstractCoffeeMaker {

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
