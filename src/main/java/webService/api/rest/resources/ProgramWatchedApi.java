package webService.api.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import webService.api.rest.resources.factories.ProgramWatchedApiServiceFactory;
import webService.api.rest.resources.services.ProgramWatchedApiService;

@Path("/programWatched")
@Produces({ "application/json" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class ProgramWatchedApi {
	private final ProgramWatchedApiService delegate = ProgramWatchedApiServiceFactory.getProgramWatchedApi();
	
    @GET
    @Path("time")
    @Produces({ "application/json", "application/xml" })
    public Response programWatchedTimeGet()
    	    throws NotFoundException { 
    	    	return delegate.programWatchedTimeGet();
    	    }
    
    @GET
    @Path("channelChange")
    @Produces({ "application/json", "application/xml" })
    public Response programWatchedChannelChangeGet()
    	    throws NotFoundException { 
    	    	return delegate.programWatchedChannelChangeGet();
    	    }
}
