package pages;

import elementHelper.Button;
import org.json.simple.parser.ParseException;
import utilities.LocatorHelper;

import java.io.IOException;

public class HomePage extends BasePage{
    Button signinLink;

    public HomePage() throws IOException, ParseException {
        signinLink = new Button(LocatorHelper.getElement(this.getClass().getSimpleName(),"signinLink"));
    }
    public void SignInFromHomePage(){
        signinLink.clickButton();
    }
}
