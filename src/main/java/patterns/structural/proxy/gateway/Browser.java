package patterns.structural.proxy.gateway;

/**
 *
 * @author Hany
 */
public class Browser {
    
    private InternetGateWay internet;

    public Browser(InternetGateWay internetGateWay) {
        this.internet = internetGateWay;
    }
    
    
    public void visitDailySites() {
        String page;
        page = internet.request("http://www.google.com");
        System.out.println(page);
        page = internet.request("http://www.stackoverflow.com");
        System.out.println(page);
        page = internet.request("http://www.stackoverflow.com");
        System.out.println(page);
        page = internet.request("http://www.facebook.com");
        System.out.println(page);
    }
    
}
