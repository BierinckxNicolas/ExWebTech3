package edu.ap.bestelling;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class BestellingApplication extends Application {

	
	@Override
	public synchronized Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        // new instance of StudentResource.
	    Router router = new Router(getContext());
	    
	    // Defines only one route
	    router.attach("/bestellingen", BestellingResource.class);
	    
	    return router;
	}
	
}
