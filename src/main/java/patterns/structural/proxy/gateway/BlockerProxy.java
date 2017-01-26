package patterns.structural.proxy.gateway;

/**
 *
 * @author Hany
 */
public class BlockerProxy implements InternetGateWay {
    
    private InternetGateWay internetGateWay;

    public BlockerProxy(InternetGateWay internetGateWay) {
        this.internetGateWay = internetGateWay;
    }

    @Override
    public String request(String url) {
        if(url.contains("facebook")) {
            return "404";
        } else {
            return internetGateWay.request(url);
        }
    }
    
}
