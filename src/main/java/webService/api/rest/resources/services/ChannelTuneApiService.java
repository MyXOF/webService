package webService.api.rest.resources.services;

import javax.ws.rs.core.Response;

import webService.api.rest.resources.NotFoundException;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public abstract class ChannelTuneApiService {
	public abstract Response channelTuneDeviceOnlineGet()
		    throws NotFoundException;
	
	public abstract Response channelTuneChannelWatchedGet()
		    throws NotFoundException;
}
