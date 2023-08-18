package utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LocatorHelper {
    public static String getElement(String elementName) throws IOException, ParseException{
    	JSONParser jsonParser = new JSONParser();
      	FileReader reader = new FileReader((System.getProperty("user.dir"))+("\\MyAugustDemo\\src\\test\\resources\\locators\\SignInPageLocator.json"));
      	
      	Object obj = jsonParser.parse(reader);
      	JSONArray elementList = (JSONArray) obj;
      	
      	for(int i=0; i<elementList.size();i++) {
      		JSONObject elements = (JSONObject) elementList.get(i);
      		JSONObject element = (JSONObject) elements.get("elements");
      		String name=(String) element.get("name");
      	}
        return "";
    }
}
