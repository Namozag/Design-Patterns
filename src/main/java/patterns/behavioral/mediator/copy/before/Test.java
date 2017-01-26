package patterns.behavioral.mediator.copy.before;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        Printer printer = new CanonPrinter();
        Scanner scanner = new BinqScanner();
        Computer computer = new Computer();
        
        printer.setComputer(computer);
        scanner.setComputer(computer);
        computer.setPrinter(printer);
        computer.setScanner(scanner);
        
        computer.copy();
        
    }
    
}
