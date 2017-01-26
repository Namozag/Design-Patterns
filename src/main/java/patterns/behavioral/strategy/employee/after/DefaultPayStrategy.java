package patterns.behavioral.strategy.employee.after;

/**
 *
 * @author Hany
 */
public class DefaultPayStrategy implements PayStrategy{

    @Override
    public double compute(int ratePerHour, int workingHours) {
        return workingHours * ratePerHour;
    }
    
}
