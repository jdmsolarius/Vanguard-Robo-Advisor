package robo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Decode {
	public static float getPrice(String url) throws Exception {
		
		float price = 0;
		
		 String values = GetRequest.sendGet(url);
		
			System.out.println(values);
			
			JSONObject jsonObject = new JSONObject();
	        Object obj=JSONValue.parse(values);
	        JSONArray array = (JSONArray)obj;
	        System.out.println(array.get(0));
			
	        JSONObject jsonObject2 = (JSONObject)array.get(0);
	        price = Float.parseFloat(jsonObject2.get("pcls_fix").toString());
	  	  
	  	  
		return price;
	}
	
	public static float getChange(String url) throws Exception {
		
		float price = 0;
		
		 String values = GetRequest.sendGet(url);
		
			System.out.println(values);
			
			JSONObject jsonObject = new JSONObject();
	        Object obj=JSONValue.parse(values);
	        JSONArray array = (JSONArray)obj;
	        System.out.println(array.get(0));
			
	        JSONObject jsonObject2 = (JSONObject)array.get(0);
	        price = Float.parseFloat(jsonObject2.get("cp_fix").toString());
	  	  
	  	  
		return price;
	}
	
}


