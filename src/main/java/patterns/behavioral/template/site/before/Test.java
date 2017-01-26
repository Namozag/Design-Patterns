package patterns.behavioral.template.site.before;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        Page page = new HomePage();
        
        page.header();
        page.title();
        page.body();
        page.footer();
        
        System.out.println("===============");
        
        page = new AboutPage();
        page.header();
        page.title();
        page.body();
        page.footer();
        
    }
    
}
