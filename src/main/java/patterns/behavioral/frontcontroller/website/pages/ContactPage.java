package patterns.behavioral.frontcontroller.website.pages;

import patterns.behavioral.frontcontroller.website.Page;

/**
 *
 * @author Hany
 */
public class ContactPage implements Page{

    @Override
    public void display() {
        System.out.println("Please contact me");
    }
    
}
