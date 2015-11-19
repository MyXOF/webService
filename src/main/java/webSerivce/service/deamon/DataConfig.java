package webSerivce.service.deamon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataConfig {
	private final static DataConfig CONFIG = new DataConfig();
	
	private final String CONF_FILE_PATH = "/config.properties";
	
	private Map<String, JSONArray> cache;
	
	public String ROOT_PATH;
	public String CTR_CW;
	public String CTR_DO;
	public String PWR_CC;
	public String PWR_T;
	public String PR_Y;
	public String PR_S;
	public String PR_D;
	
	private final static Logger logger = LoggerFactory.getLogger(DataConfig.class);
	
	private DataConfig(){
		cache = new HashMap<String, JSONArray>();
		readConfig();
	}
	
	public static DataConfig getInstance(){
		return CONFIG;
	}
	
	public JSONArray getJsonArray(String key){
		if(cache.get(key) == null){
			inputDataFromFile(key);
		}
		return cache.get(key);
	}
	
	private void readConfig(){
		Properties prop = new Properties();
		try (InputStream in = DataConfig.class.getResourceAsStream(CONF_FILE_PATH)){
			prop.load(in);
			ROOT_PATH = prop.getProperty("data_root_path");
			CTR_CW = prop.getProperty("ctr_cw");
			CTR_DO = prop.getProperty("ctr_do");
			PWR_CC = prop.getProperty("pwr_cc");
			PWR_T = prop.getProperty("pwr_t");
			PR_Y = prop.getProperty("pr_y");;
			PR_S = prop.getProperty("pr_s");
			PR_D = prop.getProperty("pr_d");
			
		} catch (Exception e) {
			logger.error("DataConfig : failed to load config from {}",CONF_FILE_PATH,e);
		}
	}
	
	private void inputDataFromFile(String path){
		JSONArray jsonArray = new JSONArray();		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(ROOT_PATH+path));
			String stringLine = "";
			while((stringLine = bufferedReader.readLine()) != null){
				String values[] = stringLine.split(",");
				String label = values[0];
				String value = values[1];
				JSONObject object = new JSONObject();
				object.put("label", label);
				object.put("value", value);
				jsonArray.add(object);
			}
		} catch (FileNotFoundException e) {
			logger.error("DataConfig : failed to read data from {} because file does not exist",ROOT_PATH+path,e);
		} catch (IOException e) {
			logger.error("DataConfig : failed to read data from {} because IO problem",ROOT_PATH+path,e);
		}
		cache.put(path, jsonArray);
	}
	
	public static void main(String[] args) {
		DataConfig config = DataConfig.getInstance();
		
		System.out.println(config.getJsonArray(config.CTR_CW));
		System.out.println(config.getJsonArray(config.CTR_DO));
		System.out.println(config.getJsonArray(config.PWR_CC));
		System.out.println(config.getJsonArray(config.PWR_T));
		System.out.println(config.getJsonArray(config.PR_Y));
		System.out.println(config.getJsonArray(config.PR_S));
		System.out.println(config.getJsonArray(config.PR_D));
	}
}
