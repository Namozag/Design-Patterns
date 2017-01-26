package patterns.behavioral.mediator.copy.after;

/**
 *
 * @author Hany
 */
public abstract class Colleague {
    
    protected CopyMediator mediator;

    public Colleague(CopyMediator mediator) {
        this.mediator = mediator;
    }
    
}
