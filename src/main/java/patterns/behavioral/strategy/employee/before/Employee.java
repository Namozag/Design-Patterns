package patterns.behavioral.strategy.employee.before;

/**
 *
 * @author Hany
 */
public class Employee {
    
    private String name;
    protected int ratePerHour;
    protected int workingHours;

    public Employee(String name, int ratePerHour, int workingHours) {
        this.name = name;
        this.ratePerHour = ratePerHour;
        this.workingHours = workingHours;
    }
    
    public double computePayment() {
        return workingHours * ratePerHour;
    }
    
    public void printPaySlip() {
        System.out.println("Employee : " + name);
        System.out.println("Total : " + computePayment());
    }
    
}
