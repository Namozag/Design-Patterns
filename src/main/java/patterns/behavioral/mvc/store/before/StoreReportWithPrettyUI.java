package patterns.behavioral.mvc.store.before;

import java.util.List;

/**
 *
 * @author Hany
 */
public class StoreReportWithPrettyUI {
    
    private Store store = new Store();
    
    public void print() {
        
        List<Item> items = store.selectAllItems();
        
        System.out.println("---------------------------");
        System.out.println("###### Store report  ######");
        System.out.println("---------------------------");
        for(Item item : items) {
            System.out.println( "| " + item.getName() + "\t | " + item.getPrice() + " |");
        }
        System.out.println("---------------------------");
        
        
    }
    
}
