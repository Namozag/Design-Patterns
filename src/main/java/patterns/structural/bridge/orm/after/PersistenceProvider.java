package patterns.structural.bridge.orm.after;

/**
 *
 * @author Hany
 */
public interface PersistenceProvider {
    
    void save(Object obj);
    void remove(Object obj);
    Object getById(int id);
    
}
