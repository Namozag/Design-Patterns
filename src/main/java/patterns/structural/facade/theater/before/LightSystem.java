package patterns.structural.facade.theater.before;

/**
 *
 * @author Hany
 */
public class LightSystem {
    
    public void turnSideLights(boolean on) {
        System.out.println("Side lights : " + (on ? "ON" : "OFF") );
    }
    
    public void turnFrontLights(boolean on) {
        System.out.println("Front lights : " + (on ? "ON" : "OFF") );
    }
    
    public void turnAudienceLights(boolean on) {
        System.out.println("Audience lights : " + (on ? "ON" : "OFF") );
    }
    
}
