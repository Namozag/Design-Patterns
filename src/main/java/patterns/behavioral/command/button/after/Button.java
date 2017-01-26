package patterns.behavioral.command.button.after;

/**
 *
 * @author Hany
 */
public class Button {
    
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void press() {
        command.execute();
    }
    
}
