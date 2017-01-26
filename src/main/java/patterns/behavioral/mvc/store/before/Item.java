package patterns.behavioral.mvc.store.before;

/**
 *
 * @author Hany
 */
public class Item {
    
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
}
