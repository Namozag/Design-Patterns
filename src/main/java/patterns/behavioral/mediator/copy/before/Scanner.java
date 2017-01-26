package patterns.behavioral.mediator.copy.before;

/**
 *
 * @author Hany
 */
public interface Scanner extends IODevice {
    void scan();
    void setComputer(Computer computer);
}
