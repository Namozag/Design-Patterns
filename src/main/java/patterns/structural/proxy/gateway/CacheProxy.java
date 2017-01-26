package patterns.structural.proxy.gateway;

/**
 *
 * @author Hany
 */
public class CacheProxy implements InternetGateWay {
    
    private InternetGateWay internetGateWay;
    private String cached;

    public CacheProxy(InternetGateWay internetGateWay) {
        this.internetGateWay = internetGateWay;
    }

    @Override
    public String request(String url) {
        if(url.equals(cached)) {
            return cached + " [Cached] ";
        } else {
            this.cached = url;
            return internetGateWay.request(url);
        }
    }
    
}
