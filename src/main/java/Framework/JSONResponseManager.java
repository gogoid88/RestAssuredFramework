package Framework;

import java.util.HashMap;

import org.json.JSONObject;

import io.restassured.response.Response;
import junit.framework.Assert;

class JSONResponseManager {
	 static private JSONObject jobj ;
	 
	 public  static void setJSONResponse(Response response) {
		 response.getStatusCode();
		 JSONObject obj = new JSONObject(response.asString());
		 jobj = obj;
	 }
	 
	 public static void checkStatusCode(int code) {
		 Assert.assertEquals(code, jobj.getInt("StatusCode")); 
	 }
	 
	 public static void AssertStringField(String name, String value) {
		 Assert.assertEquals(jobj.getString(name), value);
	 }
	 
	 public static void AssertFloatField(String name, float value) {
		 Assert.assertEquals(jobj.getFloat(name), value);
	 }
	 public static void AssertLongField(String name, long value) {
		 Assert.assertEquals(value, jobj.getLong(name));
	 }
	 
	 public static void AssertIntField(String name, int value) {
		 Assert.assertEquals(jobj.getInt(name), value);
	 }
	 public static void AssertDoubleField(String name, double value) {
		 Assert.assertEquals(jobj.getDouble(name), value);
	 }
	 public static void AssertBooleanField(String name, boolean value) {
		 Assert.assertEquals(jobj.getBoolean(name), value);
	 }
	 
	 // assert json array
	 public static void AssertArrayStringField(String key , int index, String name, String value) {
		 JSONObject element = (JSONObject) (jobj.getJSONArray(key)).get(index);
		 Assert.assertEquals(element.getString(name), value);
	 }
	 
	 public static void AssertArrayFloatField(String key , int index,String name, float value) {
		 JSONObject element = (JSONObject) (jobj.getJSONArray(key)).get(index);
		 Assert.assertEquals(element.getFloat(name), value);
	 }
	 public static void AssertArrayLongField(String key , int index,String name, long value) {
		 JSONObject element = (JSONObject) (jobj.getJSONArray(key)).get(index);
		 Assert.assertEquals(element.getLong(name), value);
	 }
	 
	 public static void AssertArrayIntField(String key , int index,String name, int value) {
		 JSONObject element = (JSONObject) (jobj.getJSONArray(key)).get(index);
		 Assert.assertEquals(element.getInt(name), value);
	 }
	 public static void AssertArrayDoubleField(String key , int index,String name, double value) {
		 JSONObject element = (JSONObject) (jobj.getJSONArray(key)).get(index);
		 Assert.assertEquals(element.getDouble(name), value);
	 }
	 public static void AssertArrayBooleanField(String key , int index,String name, boolean value) {
		 JSONObject element = (JSONObject) (jobj.getJSONArray(key)).get(index);
		 Assert.assertEquals(element.getBoolean(name), value);
	 }
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
