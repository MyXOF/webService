package webService.api.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import webService.api.rest.resources.factories.PurchaseApiServiceFactory;
import webService.api.rest.resources.services.PurchaseApiService;


@Path("/purchase")
@Produces({ "application/json" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class PurchaseApi {
	private final  PurchaseApiService delegate =  PurchaseApiServiceFactory.getPurchaseApi();
	
    @GET
    @Path("year")
    @Produces({ "application/json", "application/xml" })
    public Response purchaseYearGet()
    	    throws NotFoundException { 
    	    	return delegate.purchaseYearGet(); 
    	    }
    
    @GET
    @Path("season")
    @Produces({ "application/json", "application/xml" })
    public Response purchaseSeasonGet()
    	    throws NotFoundException { 
    	    	return delegate.purchaseSeasonGet(); 
    	    }
    
    @GET
    @Path("day")
    @Produces({ "application/json", "application/xml" })
    public Response purchaseDayGet()
    	    throws NotFoundException { 
    	    	return delegate.purchaseDayGet(); 
    	    }
	
}
