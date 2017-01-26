package patterns.structural.proxy.gateway;

/**
 *
 * @author Hany
 */
public class SimpleInternetGateWay implements InternetGateWay {

    @Override
    public String request(String url) {
        return url;
    }
    
}
