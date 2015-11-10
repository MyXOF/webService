package webService.api.rest.resources.services;

import javax.ws.rs.core.Response;

import webService.api.rest.resources.NotFoundException;
import webService.api.rest.resources.PayloadExample;
import webService.api.rest.resources.PayloadSwitchOnOff;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public abstract class ExampleApiService {
    public abstract Response daemonStatusGet()
    throws NotFoundException;
    
    public abstract Response daemonStatusPut(PayloadSwitchOnOff body)
    throws NotFoundException;
    
    public abstract Response daemonStatusPost(PayloadExample body)
    throws NotFoundException;    

}
