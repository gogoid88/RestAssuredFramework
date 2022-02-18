package Framework;

import io.restassured.response.Response;

public class APIManager {
	
	public static void runGetRequest(String url) {
		Response res = RequestsManager.runGet(url);
		JSONResponseManager.setJSONResponse(res);
	}
	public void checkResponseCode(int code) {
		JSONResponseManager.checkStatusCode(code);
	}
	
	public static void checkResponseField(String field, String val) {
		try {
			int expected = Integer.parseInt(val);
			JSONResponseManager.AssertIntField(field, expected);
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		try {
			float expected = Float.parseFloat(val);
			JSONResponseManager.AssertFloatField(field, expected);
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		try {
			long expected = Long.parseLong(val);
			JSONResponseManager.AssertLongField(field, expected);
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		try {
			boolean expected = Boolean.parseBoolean(val);
			JSONResponseManager.AssertBooleanField(field, expected);
		}catch( Exception e) {
			// TODO: handle exception
		}
	}
	public static void addToPayLoad(String field, Object val) {
		JSONPayloadManager.addPayLoadField(field, val);
	}
	
	
	public static void addToHeader(String field, Object val) {
		JSONPayloadManager.addHeaderField(field, val);
	}
	public static void runPost(String url) {
		Response res = RequestsManager.runPost(url);
		JSONResponseManager.setJSONResponse(res);
	}
	
	public static void runPut(String url) {
		Response res = RequestsManager.runPut(url);
		JSONResponseManager.setJSONResponse(res);
	}
	
	public static void runPatch(String url) {
		Response res = RequestsManager.runPatch(url);
		JSONResponseManager.setJSONResponse(res);
	}
	
	public static void runDelete(String url) {
		Response res = RequestsManager.runDelete(url);
		JSONResponseManager.setJSONResponse(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIManager.runGetRequest("https://simple-books-api.glitch.me/books?type=fiction&limit=10");
	}

}
