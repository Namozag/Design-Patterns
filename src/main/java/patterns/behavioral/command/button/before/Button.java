package patterns.behavioral.command.button.before;

/**
 *
 * @author Hany
 */
public class Button {
    
    private Light light = new Light();
    
    public void press() {
        if(light.isLightOn()) {
            light.turnOff();
        } else {
            light.turnOn();
        }
    }
    
}
