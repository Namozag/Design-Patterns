package patterns.behavioral.mediator.copy.after;

/**
 *
 * @author Hany
 */
public class Computer extends Colleague {

    public Computer(CopyMediator mediator) {
        super(mediator);
        mediator.setComputer(this);
    }
    
    public void copy() {
        mediator.copy();
    }
    
    public void input(IODevice device,String text) {
        System.out.println(device.getClass().getSimpleName() + " : " + text);
    }
    
}
