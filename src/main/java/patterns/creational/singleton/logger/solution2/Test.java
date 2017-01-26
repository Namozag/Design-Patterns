package patterns.creational.singleton.logger.solution2;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        new Thread() {
            @Override
            public void run() {
                Logger.getInstance().log("one");
            }
        }.start();
        
        new Thread() {
            @Override
            public void run() {
                Logger.getInstance().log("two");
            }
        }.start();
        
        new Thread() {
            @Override
            public void run() {
                Logger.getInstance().log("three");
            }
        }.start();
        
    }
    
}
