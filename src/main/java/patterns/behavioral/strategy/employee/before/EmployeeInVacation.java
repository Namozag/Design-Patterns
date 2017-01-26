package patterns.behavioral.strategy.employee.before;

/**
 *
 * @author Hany
 */
public class EmployeeInVacation extends Employee {

    public EmployeeInVacation(String name, int ratePerHour, int workingHours) {
        super(name, ratePerHour, workingHours);
    }

    @Override
    public double computePayment() {
        return workingHours * ratePerHour * 2;
    }
    
}
