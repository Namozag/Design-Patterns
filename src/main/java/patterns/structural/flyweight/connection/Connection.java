package patterns.structural.flyweight.connection;

/**
 *
 * @author Hany
 */
public class Connection {
    
    private String dataSource;

    public Connection(String dataSource) {
        this.dataSource = dataSource;
    }
    
    public void execute(String sql) {
        System.out.println(this + " : " + sql);
    }

    @Override
    public String toString() {
        return dataSource + " #" + hashCode();
    }
    
}
