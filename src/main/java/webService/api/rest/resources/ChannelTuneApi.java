package webService.api.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import webService.api.rest.resources.factories.ChannelTuneApiServiceFactory;
import webService.api.rest.resources.services.ChannelTuneApiService;

@Path("/channelTune")
@Produces({ "application/json" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class ChannelTuneApi {
	private static ChannelTuneApiService delegate = ChannelTuneApiServiceFactory.getChannelTuneApi();
	
	@GET
    @Path("deviceOnline")
    @Produces({ "application/json", "application/xml" })
    public Response channelTuneDeviceOnlineGet()
    	    throws NotFoundException { 
    	    	return delegate.channelTuneDeviceOnlineGet();
    	    }
	
	@GET
    @Path("channelWatched")
    @Produces({ "application/json", "application/xml" })
    public Response hannelTuneChannelWatchedGet()
    	    throws NotFoundException { 
    	    	return delegate.channelTuneChannelWatchedGet();
    	    }
}
