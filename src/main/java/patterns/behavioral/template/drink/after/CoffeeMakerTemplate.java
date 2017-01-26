package patterns.behavioral.template.drink.after;

/**
 *
 * @author Hany
 */
public abstract class CoffeeMakerTemplate  {
    
    protected Coffee coffee = new Coffee();
    
    protected void stir() {
        coffee.stir();
    }
    
    public void make() {
        boilWater();
        putCoffee();
        putAddOns();
        stir();
        stir();
        stir();
    }

    public Coffee take() {
        if(coffee.ready()) {
            return coffee;
        }
        throw new RuntimeException("Cofee is not ready");
    }
    
    abstract void boilWater();
    abstract void putCoffee();
    abstract void putAddOns();
    
}
