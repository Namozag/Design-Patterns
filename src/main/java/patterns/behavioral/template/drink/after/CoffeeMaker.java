package patterns.behavioral.template.drink.after;

/**
 *
 * @author Hany
 */
public interface CoffeeMaker {
    
    void boilWater();
    void putCoffee();
    void putAddOns();
    void stir();
    void make();
    Coffee take();
    
}
