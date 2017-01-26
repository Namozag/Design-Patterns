package patterns.structural.proxy.gateway;

/**
 *
 * @author Hany
 */
public class TestCacheProxy {
    public static void main(String[] args) {
        Browser browser = new Browser(new CacheProxy(new SimpleInternetGateWay()));
        browser.visitDailySites();
    }
}
