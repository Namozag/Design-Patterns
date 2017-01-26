package patterns.behavioral.observer.thermometer;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        Thermometer thermometer = new Thermometer();
        
        thermometer.attach( new HeatObserver() );
        thermometer.attach( new ColdObserver() );
        
        thermometer.start();
    }
    
}
