package patterns.structural.flyweight.connection;

/**
 *
 * @author Hany
 */
public class Test12 {
    
    public static void main(String[] args) {
        
        ConnectionManager flyweightCM = new FlyweightConnectionManager();
        DatabaseTask task = new DatabaseTask(flyweightCM);
        task.run();
        
    }
    
}
