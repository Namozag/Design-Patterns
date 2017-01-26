package patterns.structural.facade.theater.before;

/**
 *
 * @author Hany
 */
public class Camera {
    
    public void record() {
        System.out.println("Camera recording ...");
    }
    
    public void zoom(int level) {
        System.out.println("Camera zoom #" + level);
    }
    
    public void stop() {
        System.out.println("Camera finished recording");
    }
    
}
