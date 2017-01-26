package patterns.structural.bridge.orm.after;

/**
 *
 * @author Hany
 */
public class PersistenceBridgeImpl implements PersistenceBridge{
    
    PersistenceProvider persistenceProvider = new PersistenceProviderImpl();

    @Override
    public void persist(Object obj) {
        persistenceProvider.save(obj);
    }

    @Override
    public void delete(Object obj) {
        persistenceProvider.remove(obj);
    }

    @Override
    public Object get(int id) {
        return persistenceProvider.getById(id);
    }

    
    
    
    
}
