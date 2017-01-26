package patterns.behavioral.strategy.employee.after;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        Employee employee = new Employee("Ali", 10, 1);
        employee.setPayStrategy(new DefaultPayStrategy());
        employee.printPaySlip();
        
        employee.setPayStrategy(new TaxesDeductionPayStrategy());
        employee.printPaySlip();
        
        employee.setPayStrategy(new InVacationPayStrategy());
        employee.printPaySlip();
        
    }
    
}
