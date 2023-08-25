package utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LocatorHelper {
    public static String getElement(String filePath, String elementName) throws IOException, ParseException{

    	JSONParser jsonParser = new JSONParser();
		final String locatorsPath = (System.getProperty("user.dir")) + ("\\src\\test\\resources\\locators\\");
      	FileReader reader = new FileReader(locatorsPath + filePath + "Locator.json");
      	Object obj = jsonParser.parse(reader);
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray elementList = (JSONArray) jsonObject.get("elements");
		for (var element: elementList) {
			String name = ((JSONObject) element).get("name").toString();
			if (name.equals(elementName)) {
				return ((JSONObject) element).get("locator").toString();
			}
		}
        return "";
    }
}
