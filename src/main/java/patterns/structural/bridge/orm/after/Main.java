package patterns.structural.bridge.orm.after;

/**
 *
 * @author Hany
 */
public class Main {

    public static void main(String[] args) {
    
        PersistenceAbstraction persistenceWithA = new ConcretePersistence(new PersistenceImplementorA());
        testPersistence(persistenceWithA);
        
        PersistenceAbstraction persistenceWithB = new ConcretePersistence(new PersistenceImplementorB());
        testPersistence(persistenceWithB);
        
    }
    
    private static void testPersistence(PersistenceAbstraction persistence) {
        persistence.persist("Bogy");
        persistence.persist("Tamtam");
        persistence.delete("Bogy");
        System.out.println(persistence.get(1)); 
    }
    
}
