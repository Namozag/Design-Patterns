package patterns.behavioral.template.site.after;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        PageTemplate page = new HomePage();
        page.display();
        
        System.out.println("===============");
        
        page = new AboutPage();
        page.display();
        
    }
    
}
