package patterns.structural.bridge.orm.after;

/**
 *
 * @author Hany
 */
public class PersistenceProviderImpl implements PersistenceProvider{

    @Override
    public void save(Object obj) {
        System.out.println("PersistenceProviderImpl::save : " + obj);
    }

    @Override
    public void remove(Object obj) {
        System.out.println("PersistenceProviderImpl::delete : " + obj);
    }

    @Override
    public Object getById(int id) {
        System.out.println("PersistenceProviderImpl::getById : " + id);
        return "Sample";
    }
    
}
