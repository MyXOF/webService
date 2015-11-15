package webService.api.rest.resources.services;

import javax.ws.rs.core.Response;

import webService.api.rest.resources.NotFoundException;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public abstract class PurchaseApiService {
	public abstract Response purchaseYearGet()
		    throws NotFoundException;
	
	public abstract Response purchaseSeasonGet()
		    throws NotFoundException;
	
	public abstract Response purchaseDayGet()
		    throws NotFoundException;
}
