package patterns.structural.proxy.gateway;

/**
 *
 * @author Hany
 */
public class TestNormalInternet {
    public static void main(String[] args) {
        Browser browser = new Browser(new SimpleInternetGateWay());
        browser.visitDailySites();
    }
}
