package patterns.behavioral.command.button.after;

/**
 *
 * @author Hany
 */
public class ComputerCommand implements Command {
    
    private Computer computer;

    public ComputerCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        if(computer.isRunning()) {
            computer.shutDown();
        } else {
            computer.turnOn();
        }
    }

    
}
