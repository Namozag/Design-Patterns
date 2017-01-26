package patterns.creational.abstractfactory.helpdesk.itworx;

import patterns.creational.abstractfactory.helpdesk.System;

/**
 *
 * @author Hany.Ahmed
 */
public class Windows implements System{

    @Override
    public String getName() {
        return "Windows";
    }

    @Override
    public String getVersion() {
        return "8.1";
    }
    
}
