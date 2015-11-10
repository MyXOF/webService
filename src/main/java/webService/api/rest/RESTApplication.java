package webService.api.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

import webService.api.rest.resources.ExampleApi;


public class RESTApplication extends Application{
    public static String MESSAGE = "message";
    public static String ERRORCODE = "errorcode";

    /**
     * Get the list of service classes provided by this JAX-RS application
     */
	@Override
    public Set<Class<?>> getClasses() {
		Set<Class<?>> serviceClasses = new HashSet<Class<?>>();
		serviceClasses.add(ExampleApi.class);
		
		serviceClasses.add(com.wordnik.swagger.jaxrs.listing.ResourceListingProvider.class);
		serviceClasses.add(com.wordnik.swagger.jaxrs.json.JacksonJsonProvider.class);
		serviceClasses.add(com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider.class);
		return serviceClasses;
	}
}
