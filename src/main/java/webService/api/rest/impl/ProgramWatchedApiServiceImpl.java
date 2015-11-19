package webService.api.rest.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import webSerivce.service.deamon.DataConfig;
import webService.api.rest.model.ErrorConcise;
import webService.api.rest.resources.NotFoundException;
import webService.api.rest.resources.services.ProgramWatchedApiService;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class ProgramWatchedApiServiceImpl extends ProgramWatchedApiService{
	private static final Logger logger = LoggerFactory.getLogger(ProgramWatchedApiServiceImpl.class);
	
	@Override
	public Response programWatchedTimeGet() throws NotFoundException {
		ObjectMapper mapper = new ObjectMapper();
		logger.debug("ProgramWatchedApiServiceImpl Receive Message Post Year");
		try {
			JSONArray result = new JSONArray();
			try {			
				DataConfig config = DataConfig.getInstance();
				result = config.getJsonArray(config.PWR_T);
			} catch (Exception ex) {

				ErrorConcise err = new ErrorConcise();
				err.setSuccess(false);
				err.setReason(ex.getMessage());
				logger.error("programWatchedTimeGet error",ex);
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.entity(mapper.writeValueAsString(err)).build();
			}
			return Response.ok()
					.entity(result.toString()).build();

		} catch (JsonProcessingException ex) {
			logger.debug(ex.getMessage());
		}

		JSONObject result = new JSONObject();
		result.put("sucess", false);
		result.put("reason", "JsonProcessingException");
		return Response.ok().entity(result.toString()).build();
	}

	@Override
	public Response programWatchedChannelChangeGet() throws NotFoundException {
		ObjectMapper mapper = new ObjectMapper();
		logger.debug("ProgramWatchedApiServiceImpl Receive Message Post Year");
		try {
			JSONArray result = new JSONArray();
			try {
				DataConfig config = DataConfig.getInstance();
				result = config.getJsonArray(config.PWR_CC);
			} catch (Exception ex) {

				ErrorConcise err = new ErrorConcise();
				err.setSuccess(false);
				err.setReason(ex.getMessage());
				logger.error("programWatchedChannelChangeGet error",ex);
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.entity(mapper.writeValueAsString(err)).build();
			}
			return Response.ok()
					.entity(result.toString()).build();

		} catch (JsonProcessingException ex) {
			logger.debug(ex.getMessage());
		}

		JSONObject result = new JSONObject();
		result.put("sucess", false);
		result.put("reason", "JsonProcessingException");
		return Response.ok().entity(result.toString()).build();
	}



}
