package pages;

import elementHelper.BaseElement;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;
import utilities.LocatorHelper;

import java.io.IOException;

public class HomePage extends BasePage{
    BaseElement signinLink;

    public HomePage() throws IOException, ParseException {
        signinLink = new BaseElement(LocatorHelper.getElement(this.getClass().getSimpleName(),"signinLink"));
    }
    public void SignInFromHomePage(){
        signinLink.clickButton();
    }
}
