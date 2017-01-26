package patterns.structural.facade.theater.before;

/**
 *
 * @author Hany
 */
public class AudioSystem {
    
    public void turn(boolean on, int volume) {
        System.out.println("Audio " + (on ? "ON " + volume : "OFF"));
    }
    
}
