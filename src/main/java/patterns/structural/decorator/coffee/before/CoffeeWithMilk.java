package patterns.structural.decorator.coffee.before;

/**
 *
 * @author Hany
 */
public class CoffeeWithMilk extends SimpleCoffee {

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
    
}
