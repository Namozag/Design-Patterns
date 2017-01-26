package patterns.creational.abstractfactory.helpdesk.ibm;

import patterns.creational.abstractfactory.helpdesk.System;

/**
 *
 * @author Hany.Ahmed
 */
public class Linux implements System{

    @Override
    public String getName() {
        return "Linux";
    }

    @Override
    public String getVersion() {
        return "14.2";
    }
    
}
