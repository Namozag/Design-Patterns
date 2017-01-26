package patterns.structural.bridge.orm.before;

/**
 *
 * @author Hany
 */
public class Main {

    public static void main(String[] args) {
    
        PersistenceImplementor repo = new PersistenceImplementorImpl();
        
        repo.persist("Bogy");
        repo.persist("Tamtam");
        repo.delete("Bogy");
        System.out.println(repo.get(1)); 
        
    }
    
}
