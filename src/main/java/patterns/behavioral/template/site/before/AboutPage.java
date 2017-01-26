package patterns.behavioral.template.site.before;

/**
 *
 * @author Hany
 */
public class AboutPage implements Page {

    @Override
    public void header() {
        System.out.println("My Demo Web Site");
    }

    @Override
    public void title() {
        System.out.println("About us");
    }

    @Override
    public void body() {
        System.out.println("We 're the best in our services");
    }

    @Override
    public void footer() {
        System.out.println("copyright (c)"); 
    }

    
    
}
