package patterns.creational.abstractfactory.helpdesk.ibm;

import patterns.creational.abstractfactory.helpdesk.HelpDeskFactory;
import patterns.creational.abstractfactory.helpdesk.Machine;
import patterns.creational.abstractfactory.helpdesk.System;

/**
 *
 * @author Hany.Ahmed
 */
public class IbmHelpDesk implements HelpDeskFactory {

    @Override
    public Machine createMachine() {
        return new LenovoMachine();
    }

    @Override
    public System createSystem() {
        return new Linux();
    }

}
