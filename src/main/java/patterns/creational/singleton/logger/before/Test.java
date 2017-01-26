package patterns.creational.singleton.logger.before;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        Logger logger = new Logger();
        logger.log("one");
        
        Logger logger2 = new Logger();
        logger2.log("two");
        
        Logger logger3 = new Logger();
        logger3.log("three");
        
    }
    
}
