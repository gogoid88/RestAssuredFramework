package Framework;

import java.util.HashMap;

import org.json.JSONObject;

 class JSONPayloadManager {
	static private HashMap payload = new HashMap<String, Object>();
	static private HashMap headers = new HashMap<String, Object>();
	public JSONPayloadManager() {
		payload = new HashMap();
	}
	
	public static void addPayLoadField(String field , Object value) {
		payload.put(field, value);
	}
	
	public static void addHeaderField(String field , Object value) {
		headers.put(field, value);
	}
	
	public static JSONObject getPayLoad() {
		return new JSONObject(payload);
	}
	public static HashMap getHeader() {
		return headers;
	}
	public static String getRequestBody() {
		return getPayLoad().toString();
	}
	 static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		}
		
	}


