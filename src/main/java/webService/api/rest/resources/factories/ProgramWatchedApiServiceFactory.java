package webService.api.rest.resources.factories;

import webService.api.rest.impl.ProgramWatchedApiServiceImpl;
import webService.api.rest.resources.services.ProgramWatchedApiService;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class ProgramWatchedApiServiceFactory {
	private final static ProgramWatchedApiService service = new ProgramWatchedApiServiceImpl();
	
	public static  ProgramWatchedApiService getProgramWatchedApi(){
		return service;
	}
}
