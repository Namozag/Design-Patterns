package patterns.behavioral.mvc.store.before;

import java.util.List;

/**
 *
 * @author Hany
 */
public class TopItemsInStoreReport {
    
    private Store store = new Store();
    
    public void print() {
        
        List<Item> items = store.selectTopSellingItems();
        items = items.subList(0, 3);
        
        System.out.println("==== Store report ====");
        
        for(Item item : items) {
            System.out.println(item.getName() + "\t " + item.getPrice());
        }
        
        System.out.println("======================");
        
        
    }
    
}
