package patterns.structural.proxy.gateway;

/**
 *
 * @author Hany
 */
public class TestBlockerProxy {
    public static void main(String[] args) {
        Browser browser = new Browser(new BlockerProxy(new SimpleInternetGateWay()));
        browser.visitDailySites();
    }
}
