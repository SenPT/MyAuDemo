package pages;
import java.io.IOException;

import elementHelper.BaseElement;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.LocatorHelper;

public class SignInPage extends BasePage{
    BaseElement usernameTxt;
    BaseElement passwordTxt;
    BaseElement signincontinueBtn;
    BaseElement signinBtn;

    public SignInPage() throws IOException, ParseException {
        usernameTxt = new BaseElement(By.id(LocatorHelper.getElement(this.getClass().getSimpleName(), "usernameTxt")));
        signincontinueBtn = new BaseElement(By.id(LocatorHelper.getElement(this.getClass().getSimpleName(), "signincontinueBtn")));
        passwordTxt = new BaseElement(By.id(LocatorHelper.getElement(this.getClass().getSimpleName(), "passwordTxt")));
        signinBtn = new BaseElement(By.id(LocatorHelper.getElement(this.getClass().getSimpleName(), "signinBtn")));
    }

    public void signIn(String username, String password) {
        usernameTxt.sendText(username);
        signincontinueBtn.clickButton();
        passwordTxt.sendText(password);
        signinBtn.clickButton();
    }
}
