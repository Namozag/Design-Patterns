package patterns.structural.decorator.coffee.after;

/**
 *
 * @author Hany
 */
public class Main {
    
    public static void main(String[] args) {
        
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee);
        
        Coffee coffee2 = new Milk(coffee);
        System.out.println(coffee2);
        
        Coffee coffee3 = new Sprinkles(coffee2);
        System.out.println(coffee3);
        
        Coffee coffee4 = new Sprinkles(coffee);
        System.out.println(coffee4);
        
        Coffee coffee5 = new Milk(coffee4);
        System.out.println(coffee5);
        
    }
    
}
