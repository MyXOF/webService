package webService.api.rest.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.corp.tsdb.spark.SparkResultCollector;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
				JSONObject j1 = new JSONObject();
				j1.put("label", "Jan");
				j1.put("value", "900");
				
				JSONObject j2 = new JSONObject();
				j2.put("label", "Feb");
				j2.put("value", "900");
				
				JSONObject j3 = new JSONObject();
				j3.put("label", "Mar");
				j3.put("value", "900");
				
				JSONObject j4 = new JSONObject();
				j4.put("label", "Apr");
				j4.put("value", "900");
				
				JSONObject j5 = new JSONObject();
				j5.put("label", "May");
				j5.put("value", "900");
				
				JSONObject j6 = new JSONObject();
				j6.put("label", "June");
				j6.put("value", "900");
				
				JSONObject j7 = new JSONObject();
				j7.put("label", "Junly");
				j7.put("value", "900");
				
				result.add(j1);
				result.add(j2);
				result.add(j3);
				result.add(j4);
				result.add(j5);
				result.add(j6);
				result.add(j7);
				
//				SparkResultCollector collector = SparkResultCollector.getInstance();
//				result = collector.getPurchaseResultByYear();
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
				JSONObject j1 = new JSONObject();
				j1.put("label", "Jan");
				j1.put("value", "900");
				
				JSONObject j2 = new JSONObject();
				j2.put("label", "Feb");
				j2.put("value", "900");
				
				JSONObject j3 = new JSONObject();
				j3.put("label", "Mar");
				j3.put("value", "900");
				
				JSONObject j4 = new JSONObject();
				j4.put("label", "Apr");
				j4.put("value", "900");
				
				JSONObject j5 = new JSONObject();
				j5.put("label", "May");
				j5.put("value", "900");
				
				JSONObject j6 = new JSONObject();
				j6.put("label", "June");
				j6.put("value", "900");
				
				JSONObject j7 = new JSONObject();
				j7.put("label", "Junly");
				j7.put("value", "900");
				
				result.add(j1);
				result.add(j2);
				result.add(j3);
				result.add(j4);
				result.add(j5);
				result.add(j6);
				result.add(j7);
				
//				SparkResultCollector collector = SparkResultCollector.getInstance();
//				result = collector.getPurchaseResultBySeason();
				

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
				JSONObject j1 = new JSONObject();
				j1.put("label", "chun");
				j1.put("value", "100");
				
				JSONObject j2 = new JSONObject();
				j2.put("label", "xia");
				j2.put("value", "200");
				
				JSONObject j3 = new JSONObject();
				j3.put("label", "qiu");
				j3.put("value", "200");
				
				JSONObject j4 = new JSONObject();
				j4.put("label", "dong");
				j4.put("value", "400");
				
				JSONObject j5 = new JSONObject();
				j5.put("label", "chun");
				j5.put("value", "500");
				
				JSONObject j6 = new JSONObject();
				j6.put("label", "xia");
				j6.put("value", "600");
				
				JSONObject j7 = new JSONObject();
				j7.put("label", "qiu");
				j7.put("value", "700");
				
				result.add(j1);
				result.add(j2);
				result.add(j3);
				result.add(j4);
				result.add(j5);
				result.add(j6);
				result.add(j7);
				
//				SparkResultCollector collector = SparkResultCollector.getInstance();
//				result = collector.getPurchaseResultByDay();

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
