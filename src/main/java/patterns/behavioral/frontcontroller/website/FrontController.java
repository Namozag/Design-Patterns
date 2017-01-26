package patterns.behavioral.frontcontroller.website;

import java.io.PrintStream;

/**
 *
 * @author Hany
 */
public class FrontController {
    
    private Dispatcher dispatcher;
    private PrintStream logger;

    public FrontController() {
        logger = System.out;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    
    public void request(String uri) {
        logger.println("LOG | Locating resource : " + uri);
        dispatcher.dispatch(uri);
    }
    
}
