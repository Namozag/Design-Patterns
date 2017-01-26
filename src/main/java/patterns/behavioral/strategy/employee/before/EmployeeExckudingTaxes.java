package patterns.behavioral.strategy.employee.before;

/**
 *
 * @author Hany
 */
public class EmployeeExckudingTaxes extends Employee {
    
    private int taxesPercentage = 10;

    public EmployeeExckudingTaxes(String name, int ratePerHour, int workingHours) {
        super(name, ratePerHour, workingHours);
    }

    @Override
    public double computePayment() {
        return workingHours * ratePerHour * (100-taxesPercentage) / 100;
    }
    
}
