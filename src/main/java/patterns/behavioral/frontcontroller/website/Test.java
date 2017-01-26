package patterns.behavioral.frontcontroller.website;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) {
        
        FrontController controller = new FrontController();
        controller.setDispatcher(new UriDispatcher());
        
        controller.request("home");
        controller.request("contact");
        controller.request("xyz");
        
        System.out.println("=======================");
        
        controller.setDispatcher(new ClassNameDispatcher());
        
        controller.request("patterns.behavioral.frontcontroller.website.pages.HomePage");
        controller.request("patterns.behavioral.frontcontroller.website.pages.ContactPage");
        controller.request("xyz");
        
    }
    
}
