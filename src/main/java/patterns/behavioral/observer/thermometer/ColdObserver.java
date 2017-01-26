package patterns.behavioral.observer.thermometer;

/**
 *
 * @author Hany
 */
public class ColdObserver implements Observer {

    @Override
    public void update(int value) {
        if(value < 10) {
            System.out.println("CAUTION : It's very cold");
        }
    }
    
}
