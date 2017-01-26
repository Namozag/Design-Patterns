package patterns.behavioral.mvc.store.after.model;

import java.util.List;
import patterns.behavioral.mvc.store.after.Item;
import patterns.behavioral.mvc.store.after.Model;

/**
 *
 * @author Hany
 */
public class AllItemsModel implements Model {
    
    private Store store = new Store();
    
    @Override
    public List<Item> getData() {
        return store.selectAllItems();
    }
    
}
