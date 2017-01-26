package patterns.structural.bridge.orm.before;

/**
 *
 * @author Hany
 */
public interface PersistenceImplementor {
    
    void persist(Object obj);
    void delete(Object obj);
    Object get(int id);
    
}
