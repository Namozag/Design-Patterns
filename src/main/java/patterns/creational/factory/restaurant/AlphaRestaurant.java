package patterns.creational.factory.restaurant;

/**
 *
 * @author Hany
 */
public class AlphaRestaurant implements Restaurant{
    
    public Food createFood(String what) {
        switch(what) {
            case "chicken" :
                Chicken chicken = new Chicken();
                chicken.setPrice(50);
                chicken.setDiscount(10);
                return chicken;
            case "rice" :
                Rice rice = new Rice();
                rice.setPrice(20);
                rice.setDiscount(10);
                return rice;
        }
        return null;
    }
    
}
