package patterns.creational.factory.restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hany
 */
public class Test3 {
    
    public static void main(String[] args) {
        
        orderMyMeal(new AlphaRestaurant());
        orderMyMeal(new BetaRestaurant());
        
    }
    
    private static void orderMyMeal(Restaurant rest) {
        List<Food> order = new ArrayList<>();
        order.add(rest.createFood("chicken"));
        order.add(rest.createFood("rice"));
        System.out.println(order);
    }
    
}
