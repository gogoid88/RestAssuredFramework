package StepDefs;

import Framework.APIManager;

public class UsersStepDefs {
	
	public void testGetRequest(String url) {
		APIManager.runGetRequest(url);
	}
	
	public void checkgetResponse(String field, String val) {
		APIManager.checkResponseField(field, val);
	}
	
	public void addToHeader(String name , String val) {
		APIManager.addToHeader(name, val);
	}
	
	public void adToBody(String name, String val) {
		APIManager.addToPayLoad(name, val);
	}
	
	public void postData(String url) {
		APIManager.runPost(url);
	}

}
