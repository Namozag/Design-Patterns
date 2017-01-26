package patterns.behavioral.mediator.copy.after;

/**
 *
 * @author Hany
 */
public class CanonPrinter extends Colleague implements Printer {

    public CanonPrinter(CopyMediator mediator) {
        super(mediator);
        mediator.setPrinter(this);
    }


    @Override
    public void print(String text) {
        System.out.println("Printing ...");
        mediator.input(this, text);
    }
    
}
