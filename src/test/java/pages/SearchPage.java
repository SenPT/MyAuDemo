package pages;

import elementHelper.BaseElement;
import elementHelper.Button;
import elementHelper.Textbox;
import org.json.simple.parser.ParseException;
import utilities.LocatorHelper;
import org.testng.Assert;

import java.io.IOException;

public class SearchPage extends BasePage{
    Textbox searchTxt;
    BaseElement result(String value);
    Button searchBtn;
    public SearchPage() throws IOException, ParseException {
        searchTxt = new Textbox(LocatorHelper.getElement(this.getClass().getSimpleName(),"searchTxt"));
        searchBtn = new Button(LocatorHelper.getElement(this.getClass().getSimpleName(),"searchBtn"));
        result1 = new BaseElement(LocatorHelper.getElement(this.getClass().getSimpleName(),"result1"));
    }
    public void Search(){
        searchTxt.sendText("book");
        searchBtn.clickButton();
    }
    public void verifyResult(){
        String actualResult = result1.getText();
        Assert.assertTrue(actualResult.contains("book"));
    }
}
