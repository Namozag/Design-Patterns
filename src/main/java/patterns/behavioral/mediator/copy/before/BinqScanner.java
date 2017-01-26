package patterns.behavioral.mediator.copy.before;

import java.util.UUID;

/**
 *
 * @author Hany
 */
public class BinqScanner implements Scanner {
    
    private Computer computer;

    @Override
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void scan() {
        System.out.println("Scanning ...");
        String text = UUID.randomUUID().toString();
        computer.input(this, text);
    }
    
}
