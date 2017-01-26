package patterns.behavioral.template.site.after;

/**
 *
 * @author Hany
 */
public class AboutPage extends PageTemplate {

    @Override
    public void title() {
        System.out.println("About us");
    }

    @Override
    public void body() {
        System.out.println("We 're the best in our services");
    }
    
}
