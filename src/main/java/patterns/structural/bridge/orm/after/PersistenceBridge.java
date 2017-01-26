package patterns.structural.bridge.orm.after;

/**
 *
 * @author Hany
 */
public interface PersistenceBridge {
    void persist(Object obj);
    void delete(Object obj);
    Object get(int id);
}
