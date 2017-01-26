package patterns.behavioral.mvc.store.before;

import java.util.List;

/**
 *
 * @author Hany
 */
public class StoreReport {
    
    private Store store = new Store();
    
    public void print() {
        
        List<Item> items = store.selectAllItems();
        
        System.out.println("==== Store report ====");
        for(Item item : items) {
            System.out.println(item.getName() + "\t" + item.getPrice());
        }
        System.out.println("======================");
        
        
    }
    
}
