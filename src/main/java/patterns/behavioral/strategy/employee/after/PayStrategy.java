package patterns.behavioral.strategy.employee.after;

/**
 *
 * @author Hany
 */
public interface PayStrategy {
    double compute(int ratePerHour, int workingHours);
}
