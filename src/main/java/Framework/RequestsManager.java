package Framework;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;



import org.json.JSONObject;
import org.junit.Test;

class RequestsManager {
	
	static Response res;

	public static Response runGet(String url) {
		Response res = RestAssured.when().get(url);
		return res;
	}
	// create oir replace a resource in server
	public static Response runPut(String url) {
		Response res = RestAssured.
				given().body(JSONPayloadManager.getRequestBody()).when().put(url);
		
		return res;
	}
// create a resource in server 
	public static Response runPost(String url) {
		Response res = RestAssured.given().headers(JSONPayloadManager.getHeader())
				.given().body(JSONPayloadManager.getRequestBody()).when().post(url);
		return res;
	}
	
	public static Response runPatch(String url) {
		Response res = RestAssured.given().body(JSONPayloadManager.getRequestBody()).when().post(url);
		return res;
	}
	
	public static Response runDelete(String url) {
		Response res = RestAssured.when().delete(url);
		return res;
	}
	
}
