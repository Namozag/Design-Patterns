package patterns.behavioral.frontcontroller.website.pages;

import patterns.behavioral.frontcontroller.website.Page;

/**
 *
 * @author Hany
 */
public class NotFoundPage implements Page {

    @Override
    public void display() {
        System.out.println("Page not found");
    }
    
}
