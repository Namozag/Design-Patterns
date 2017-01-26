package patterns.behavioral.mvc.store.after;

import java.util.List;

/**
 *
 * @author Hany
 */
public class StoreReportController {
    
    private Model model;
    private View view;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setView(View view) {
        this.view = view;
    }
    
    
    public void print() {
        List<Item> items = model.getData();
        view.print(items);
    }
    
}
