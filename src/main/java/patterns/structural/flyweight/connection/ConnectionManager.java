package patterns.structural.flyweight.connection;

/**
 *
 * @author Hany
 */
public interface ConnectionManager {
    Connection getConnection(String datasource);
}
