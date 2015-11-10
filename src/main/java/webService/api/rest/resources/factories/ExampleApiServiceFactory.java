package webService.api.rest.resources.factories;

import webService.api.rest.impl.ExampleApiServiceImpl;
import webService.api.rest.resources.services.ExampleApiService;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class ExampleApiServiceFactory {
	private final static ExampleApiService service = new ExampleApiServiceImpl();
	
	public static ExampleApiService getExampleApi(){
		return service;
	}
}
