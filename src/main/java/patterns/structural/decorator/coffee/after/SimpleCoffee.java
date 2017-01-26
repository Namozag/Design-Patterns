package patterns.structural.decorator.coffee.after;

/**
 *
 * @author Hany
 */
public class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
    
}
