package patterns.creational.abstractfactory.helpdesk.ibm;

import patterns.creational.abstractfactory.helpdesk.Machine;

/**
 *
 * @author Hany.Ahmed
 */
public class LenovoMachine implements Machine {

    @Override
    public String getModel() {
        return "Lenovo";
    }

    @Override
    public float getSpeed() {
        return 3.2f;
    }
    
}
