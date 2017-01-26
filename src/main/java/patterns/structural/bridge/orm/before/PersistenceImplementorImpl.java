package patterns.structural.bridge.orm.before;

/**
 *
 * @author Hany
 */
public class PersistenceImplementorImpl implements PersistenceImplementor{

    @Override
    public void persist(Object obj) {
        System.out.println("PersistenceProviderImpl::persist : " + obj);
    }

    @Override
    public void delete(Object obj) {
        System.out.println("PersistenceProviderImpl::delete : " + obj);
    }

    @Override
    public Object get(int id) {
        System.out.println("PersistenceProviderImpl::get : " + id);
        return "Sample";
    }
    
}
