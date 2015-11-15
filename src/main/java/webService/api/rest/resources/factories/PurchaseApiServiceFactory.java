package webService.api.rest.resources.factories;

import webService.api.rest.impl.PurchaseApiServiceImpl;
import webService.api.rest.resources.services.PurchaseApiService;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class PurchaseApiServiceFactory {
	private final static PurchaseApiService service = new PurchaseApiServiceImpl();
	
	public static PurchaseApiService getPurchaseApi(){
		return service;
	}
}
