package patterns.creational.singleton.logger.solution1;

/**
 *
 * @author Hany
 */
public class Logger {
    
    private static Logger instance;

    // Get the only instance
    public static Logger getInstance() {
        if(instance == null) {
            try {Thread.sleep(50);} catch (InterruptedException ex) {}
            instance = new Logger();
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
