package patterns.behavioral.observer.thermometer;

/**
 *
 * @author Hany
 */
public class HeatObserver implements Observer {

    @Override
    public void update(int value) {
        if(value > 50) {
            System.out.println("CAUTION : It's very hot");
        }
    }
    
}
