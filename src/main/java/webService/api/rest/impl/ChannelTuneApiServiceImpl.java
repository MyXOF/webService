package webService.api.rest.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import webSerivce.service.deamon.DataConfig;
import webService.api.rest.model.ErrorConcise;
import webService.api.rest.resources.NotFoundException;
import webService.api.rest.resources.services.ChannelTuneApiService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class ChannelTuneApiServiceImpl extends ChannelTuneApiService{
	private static final Logger logger = LoggerFactory.getLogger(ChannelTuneApiServiceImpl.class);
	
	@Override
	public Response channelTuneDeviceOnlineGet() throws NotFoundException {
		ObjectMapper mapper = new ObjectMapper();
		logger.debug("ChannelTuneApiServiceImpl Receive Message Post DeviceOnline");
		try {	
			JSONArray result = new JSONArray();
			try {
				
				DataConfig config = DataConfig.getInstance();
				result = config.getJsonArray(config.CTR_DO);

			} catch (Exception ex) {

				ErrorConcise err = new ErrorConcise();
				err.setSuccess(false);
				err.setReason(ex.getMessage());
				logger.error("channelTuneDeviceOnlineGet error",ex);
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.entity(mapper.writeValueAsString(err)).build();
			}
			return Response.ok()
					.entity(result.toString()).build();

		} catch (JsonProcessingException ex) {
			logger.error("channelTuneDeviceOnlineGet error",ex);
			logger.debug(ex.getMessage());
		}

		JSONObject result = new JSONObject();
		result.put("sucess", false);
		result.put("reason", "JsonProcessingException");
		return Response.ok().entity(result.toString()).build();
	}

	@Override
	public Response channelTuneChannelWatchedGet() throws NotFoundException {
		ObjectMapper mapper = new ObjectMapper();
		logger.debug("ChannelTuneApiServiceImpl Receive Message Post ChannelWatched");
		try {
			JSONArray result = new JSONArray();
			try {
				DataConfig config = DataConfig.getInstance();
				result = config.getJsonArray(config.CTR_CW);
			} catch (Exception ex) {

				ErrorConcise err = new ErrorConcise();
				err.setSuccess(false);
				err.setReason(ex.getMessage());
				logger.error("channelTuneChannelWatchedGet error",ex);
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.entity(mapper.writeValueAsString(err)).build();
			}
			return Response.ok()
					.entity(result.toString()).build();

		} catch (JsonProcessingException ex) {
			logger.debug(ex.getMessage());
			logger.error("channelTuneChannelWatchedGet error",ex);
		}

		JSONObject result = new JSONObject();
		result.put("sucess", false);
		result.put("reason", "JsonProcessingException");
		return Response.ok().entity(result.toString()).build();
	}

}
