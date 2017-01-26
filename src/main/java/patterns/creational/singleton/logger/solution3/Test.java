package patterns.creational.singleton.logger.solution3;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {

        for(int i=0; i<10; i++) {
            new Thread() {
                @Override
                public void run() {
                    Logger.getInstance().log("TEST");
                }
            }.start();
        }
        
    }
    
}
