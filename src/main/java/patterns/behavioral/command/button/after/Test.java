package patterns.behavioral.command.button.after;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        Button button = new Button();
        
        ComputerCommand comCom = new ComputerCommand(new Computer());
        button.setCommand(comCom);
        testCommand(button);
        
        LightCommand lightCom = new LightCommand(new Light());
        button.setCommand(lightCom);
        testCommand(button);
        
        button.setCommand(new Command() {
            private Ringer ringer = new Ringer();
            @Override
            public void execute() {
                ringer.ring();
            }
        });
        testCommand(button);
        
        
    }
    
    private static void testCommand(Button button) {
        System.out.println("*** Testing ***");
        button.press();
        button.press();
        button.press();
    }
    
}
