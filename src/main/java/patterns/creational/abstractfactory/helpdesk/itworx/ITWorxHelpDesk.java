package patterns.creational.abstractfactory.helpdesk.itworx;

import patterns.creational.abstractfactory.helpdesk.HelpDeskFactory;
import patterns.creational.abstractfactory.helpdesk.Machine;
import patterns.creational.abstractfactory.helpdesk.System;

/**
 *
 * @author Hany.Ahmed
 */
public class ITWorxHelpDesk implements HelpDeskFactory {

    @Override
    public Machine createMachine() {
        return new DellMachine();
    }

    @Override
    public System createSystem() {
        return new Windows();
    }
    
    
    
}
