package patterns.behavioral.mvc.store.after.view;

import java.util.List;
import patterns.behavioral.mvc.store.after.Item;
import patterns.behavioral.mvc.store.after.View;

/**
 *
 * @author Hany
 */
public class SimpleView implements View{

    @Override
    public void print(List<Item> items) {
        System.out.println("==== Store report ====");
        for(Item item : items) {
            System.out.println(item.getName() + "\t" + item.getPrice());
        }
        System.out.println("======================");
    }
    
}
