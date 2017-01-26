package patterns.behavioral.template.drink.before;

/**
 *
 * @author Hany
 */
public interface CoffeeMaker {
    
    void boilWater();
    void putCoffee();
    void putAddOns();
    void stir();
    Coffee take();
    
}
