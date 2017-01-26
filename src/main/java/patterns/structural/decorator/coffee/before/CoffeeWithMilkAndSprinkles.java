package patterns.structural.decorator.coffee.before;

/**
 *
 * @author Hany
 */
public class CoffeeWithMilkAndSprinkles extends CoffeeWithMilk {

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sprinkles";
    }
    
}
