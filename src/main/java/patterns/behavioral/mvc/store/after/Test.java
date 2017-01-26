package patterns.behavioral.mvc.store.after;

import patterns.behavioral.mvc.store.after.view.SimpleView;
import patterns.behavioral.mvc.store.after.view.PrettyView;
import patterns.behavioral.mvc.store.after.model.AllItemsModel;
import patterns.behavioral.mvc.store.after.model.TopSellingItemsModel;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        StoreReportController controller = new StoreReportController();
        controller.setModel(new AllItemsModel());
        controller.setView(new SimpleView());
        controller.print();
        
        controller.setView(new PrettyView());
        controller.setModel(new TopSellingItemsModel());
        controller.print();
        
    }
    
}
