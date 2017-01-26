package patterns.behavioral.template.site.after;

/**
 *
 * @author Hany
 */
public class HomePage extends PageTemplate {

    @Override
    public void title() {
        System.out.println("Home page");
    }

    @Override
    public void body() {
        System.out.println("Welcome to my web site");
    }
    
}
