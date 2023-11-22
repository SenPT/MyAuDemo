package pages;

import elementHelper.BaseElement;
import elementHelper.Button;
import elementHelper.Textbox;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import utilities.LocatorHelper;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchPage extends BasePage {
    Textbox searchTxt;
    BaseElement result;
    Button searchBtn;

    public SearchPage() throws IOException, ParseException {
        searchTxt = new Textbox(LocatorHelper.getElement(this.getClass().getSimpleName(), "searchTxt"));
        searchBtn = new Button(LocatorHelper.getElement(this.getClass().getSimpleName(), "searchBtn"));
        result = new BaseElement(LocatorHelper.getElement(this.getClass().getSimpleName(), "result"));
    }

    public void Search() {
        searchTxt.sendText("book");
        searchBtn.clickButton();
    }
    public void verifyResult(){
        String actual = result.getText();
        assertTrue(actual.toLowerCase().contains("book"));
    }
}
