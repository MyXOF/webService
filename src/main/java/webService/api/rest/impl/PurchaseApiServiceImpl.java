package webService.api.rest.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import webSerivce.service.deamon.DataConfig;
import webService.api.rest.model.ErrorConcise;
import webService.api.rest.resources.NotFoundException;
import webService.api.rest.resources.services.PurchaseApiService;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-09-15T17:27:51.281+08:00")
public class PurchaseApiServiceImpl extends PurchaseApiService{
	private static final Logger logger = LoggerFactory.getLogger(PurchaseApiServiceImpl.class);
	
	@Override
	public Response purchaseYearGet() throws NotFoundException {
		ObjectMapper mapper = new ObjectMapper();
		logger.debug("PurchaseApiServiceImpl Receive Message Post Year");
		try {
			JSONArray result = new JSONArray();
			try {
				DataConfig config = DataConfig.getInstance();
				result = config.getJsonArray(config.PR_Y);
			} catch (Exception ex) {

				ErrorConcise err = new ErrorConcise();
				err.setSuccess(false);
				err.setReason(ex.getMessage());
				logger.error("purchaseYearGet error",ex);
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.entity(mapper.writeValueAsString(err)).build();
			}
			return Response.ok()
					.entity(result.toString()).build();

		} catch (JsonProcessingException ex) {
			logger.debug(ex.getMessage());
			logger.error("purchaseYearGet error",ex);
		}

		JSONObject result = new JSONObject();
		result.put("sucess", false);
		result.put("reason", "JsonProcessingException");
		return Response.ok().entity(result.toString()).build();
	}

	@Override
	public Response purchaseSeasonGet() throws NotFoundException {
		ObjectMapper mapper = new ObjectMapper();
		logger.debug("PurchaseApiServiceImpl Receive Message Post Season");
		try {
			JSONArray result = new JSONArray();
			try {
				DataConfig config = DataConfig.getInstance();
				result = config.getJsonArray(config.PR_S);

			} catch (Exception ex) {

				ErrorConcise err = new ErrorConcise();
				err.setSuccess(false);
				err.setReason(ex.getMessage());
				logger.error("purchaseSeasonGet error",ex);
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.entity(mapper.writeValueAsString(err)).build();
			}
			return Response.ok()
					.entity(result.toString()).build();

		} catch (JsonProcessingException ex) {
			logger.debug(ex.getMessage());
			logger.error("purchaseSeasonGet error",ex);
		}

		JSONObject result = new JSONObject();
		result.put("sucess", false);
		result.put("reason", "JsonProcessingException");
		return Response.ok().entity(result.toString()).build();
	}

	@Override
	public Response purchaseDayGet() throws NotFoundException {
		ObjectMapper mapper = new ObjectMapper();
		logger.debug("PurchaseApiServiceImpl Receive Message Post Day");
		try {
			JSONArray result = new JSONArray();
			try {
				DataConfig config = DataConfig.getInstance();
				result = config.getJsonArray(config.PR_D);

			} catch (Exception ex) {

				ErrorConcise err = new ErrorConcise();
				err.setSuccess(false);
				err.setReason(ex.getMessage());
				logger.error("purchaseDayGet error",ex);
				return Response.status(Status.INTERNAL_SERVER_ERROR)
						.entity(mapper.writeValueAsString(err)).build();
			}
			return Response.ok()
					.entity(result.toString()).build();

		} catch (JsonProcessingException ex) {
			logger.debug(ex.getMessage());
			logger.error("purchaseDayGet error",ex);
		}

		JSONObject result = new JSONObject();
		result.put("sucess", false);
		result.put("reason", "JsonProcessingException");
		return Response.ok().entity(result.toString()).build();
	}

}
