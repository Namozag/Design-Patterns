package patterns.creational.abstractfactory.helpdesk.itworx;

import patterns.creational.abstractfactory.helpdesk.Machine;

/**
 *
 * @author Hany.Ahmed
 */
public class DellMachine implements Machine {

    @Override
    public String getModel() {
        return "Dell";
    }

    @Override
    public float getSpeed() {
        return 2.4f;
    }
    
}
