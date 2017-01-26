package patterns.creational.singleton.logger.solution3;

/**
 *
 * @author Hany
 */
public class Logger {
    
    private static Logger instance = new Logger();

    // Get the only instance
    // Double locking mechanism
    public static Logger getInstance() {
        if(instance == null) {
            synchronized(Logger.class) {
                try {Thread.sleep(10);} catch (InterruptedException ex) {}
                if(instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    // Stop creating instances outside me
    private Logger() {
    }
    
    public void log(String message) {
        System.out.println("Log #" + hashCode() + " | " + message);
    }
    
}
