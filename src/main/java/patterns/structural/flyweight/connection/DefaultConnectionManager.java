package patterns.structural.flyweight.connection;


/**
 *
 * @author Hany
 */
public class DefaultConnectionManager implements ConnectionManager {
    
    public Connection getConnection(String datasource) {
        return new Connection(datasource);
    }
    
}
