package patterns.behavioral.mvc.store.before;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        StoreReport report1 = new StoreReport();
        report1.print();
        
        TopItemsInStoreReport report2 = new TopItemsInStoreReport();
        report2.print();
        
        StoreReportWithPrettyUI report3 = new StoreReportWithPrettyUI();
        report3.print();
        
    }
    
}
