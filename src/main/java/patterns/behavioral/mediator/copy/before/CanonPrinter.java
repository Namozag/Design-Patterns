package patterns.behavioral.mediator.copy.before;

/**
 *
 * @author Hany
 */
public class CanonPrinter implements Printer {
    
    private Computer computer;

    @Override
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void print(String text) {
        System.out.println("Printing ...");
        computer.input(this, text);
    }
    
}
