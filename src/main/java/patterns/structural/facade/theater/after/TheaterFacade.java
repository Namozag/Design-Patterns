package patterns.structural.facade.theater.after;

/**
 *
 * @author Hany
 */
public class TheaterFacade {
    
    // Subsystems
    AudioSystem audioSystem = new AudioSystem();
    LightSystem lightSystem = new LightSystem();
    Camera camera = new Camera();
    
    public void begin() {
        lightSystem.turnAudienceLights(false);
        camera.record();
        audioSystem.turn(true, 10);
        lightSystem.turnFrontLights(true);
        lightSystem.turnSideLights(true);
        camera.zoom(22);
    }
    
    public void end() {
        audioSystem.turn(false, 0);
        lightSystem.turnFrontLights(false);
        lightSystem.turnSideLights(false);
        camera.stop();
        lightSystem.turnAudienceLights(true);
    }
    
}
