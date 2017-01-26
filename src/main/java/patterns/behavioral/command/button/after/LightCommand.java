package patterns.behavioral.command.button.after;

/**
 *
 * @author Hany
 */
public class LightCommand implements Command {
    
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        if(light.isLightOn()) {
            light.turnOff();
        } else {
            light.turnOn();
        }
    }
    
}
