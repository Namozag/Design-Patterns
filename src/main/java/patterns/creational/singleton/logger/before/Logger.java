package patterns.creational.singleton.logger.before;

/**
 *
 * @author Hany
 */
public class Logger {
    
    public void log(String message) {
        System.out.println("Log #" + hashCode() + " | " + message);
    }
    
}
