package patterns.behavioral.template.drink.after;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        CoffeeMakerTemplate maker = new BlackCoffeeMaker();
        maker.make();
        System.out.println(maker.take());
        
        System.out.println("=================");
        
        maker = new WhiteCoffeeMaker();
        maker.make();
        System.out.println(maker.take());
        
        
    }
    
}
