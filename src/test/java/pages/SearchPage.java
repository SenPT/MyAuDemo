package pages;

import elementHelper.BaseElement;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import utilities.LocatorHelper;

import java.io.IOException;

public class SearchPage extends BasePage{
    BaseElement searchTxt;
    BaseElement searchBtn;
    public SearchPage() throws IOException, ParseException {
        searchTxt = new BaseElement(By.id(LocatorHelper.getElement(this.getClass().getSimpleName(),"searchTxt")));
        searchBtn = new BaseElement(By.id(LocatorHelper.getElement(this.getClass().getSimpleName(),"searchBtn")));
    }
    public void Search(){
        searchTxt.sendText("book");
        searchBtn.clickButton();
    }
}
