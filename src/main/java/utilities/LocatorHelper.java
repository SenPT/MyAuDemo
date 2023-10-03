package utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;

public class LocatorHelper {
    public static By getElement(String filePath, String elementName) throws IOException, ParseException
	{
    	JSONParser jsonParser = new JSONParser();
		final String locatorsPath = (System.getProperty("user.dir")) + ("\\src\\test\\resources\\locators\\");
      	FileReader reader = new FileReader(locatorsPath + filePath + "Locator.json");
      	Object obj = jsonParser.parse(reader);
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray elementList = (JSONArray) jsonObject.get("elements");
		for (var element: elementList) {
			String name = ((JSONObject) element).get("name").toString();
			String by = ((JSONObject) element).get("by").toString();
			if (name.equals(elementName)) {
				if (by.equals("id")){
					return By.id(((JSONObject) element).get("locator").toString());
				}
				else if (by.equals("xpath")){
					return By.xpath(((JSONObject) element).get("locator").toString());
				}
				else if (by.equals("linkText")){
					return By.linkText(((JSONObject) element).get("locator").toString());
				}
			}
		}
        return null;
    }
}
