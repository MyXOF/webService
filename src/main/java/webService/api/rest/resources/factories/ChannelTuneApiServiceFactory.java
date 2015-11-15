package webService.api.rest.resources.factories;

import webService.api.rest.impl.ChannelTuneApiServiceImpl;
import webService.api.rest.resources.services.ChannelTuneApiService;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class ChannelTuneApiServiceFactory {
	private final static ChannelTuneApiService service = new ChannelTuneApiServiceImpl();
	
	public static ChannelTuneApiService getChannelTuneApi(){
		return service;
	}
}
