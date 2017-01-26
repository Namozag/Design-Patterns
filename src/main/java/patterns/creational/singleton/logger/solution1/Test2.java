package patterns.creational.singleton.logger.solution1;

import patterns.creational.singleton.logger.solution3.Logger;

/**
 *
 * @author Hany
 */
public class Test2 {
    
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
