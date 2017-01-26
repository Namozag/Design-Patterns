package patterns.creational.abstractfactory.helpdesk;

/**
 *
 * @author Hany.Ahmed
 */
public interface HelpDeskFactory {
    
    Machine createMachine();
    
    System createSystem();
    
}
