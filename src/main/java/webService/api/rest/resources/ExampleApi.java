package webService.api.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import webService.api.rest.resources.factories.ExampleApiServiceFactory;
import webService.api.rest.resources.services.ExampleApiService;


@Path("/example")
@Produces({ "application/json" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class ExampleApi {
	private final ExampleApiService delegate = ExampleApiServiceFactory.getExampleApi();
	
    @GET
    @Path("daemon/status")
    @Produces({ "application/json", "application/xml" })

    public Response daemonStatusGet()
    throws NotFoundException { 
    	return delegate.daemonStatusGet(); 
    }
    
    @PUT
    @Path("daemon/status")
    @Consumes({ "application/json", "application/xml","application/x-www-form-urlencoded","text/plain"})
    @Produces({ "application/json", "application/xml" })
    public Response daemonStatusPut(PayloadSwitchOnOff body) throws NotFoundException {
    	return delegate.daemonStatusPut(body);
    }

	@POST
	@Path("list")
	@Consumes({ "application/json", "application/xml" ,"application/x-www-form-urlencoded","text/plain"})
	@Produces({ "application/json", "application/xml" })
	public Response daemonStatusPost(PayloadExample body) throws NotFoundException {
		return delegate.daemonStatusPost(body);
	}
}
