package patterns.behavioral.mediator.copy.before;

/**
 *
 * @author Hany
 */
public interface Printer extends IODevice {
    
    void print(String text);
    void setComputer(Computer computer);
    
}
