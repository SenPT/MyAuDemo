package pages;
import java.io.IOException;

import elementHelper.Button;
import elementHelper.Textbox;
import org.json.simple.parser.ParseException;
import utilities.LocatorHelper;

public class SignInPage extends BasePage{
    Textbox usernameTxt;
    Textbox passwordTxt;
    Button signInContinueBtn;
    Button signInBtn;

    public SignInPage() throws IOException, ParseException {
        usernameTxt = new Textbox(LocatorHelper.getElement(this.getClass().getSimpleName(), "usernameTxt"));
        signInContinueBtn = new Button(LocatorHelper.getElement(this.getClass().getSimpleName(), "signincontinueBtn"));
        passwordTxt = new Textbox(LocatorHelper.getElement(this.getClass().getSimpleName(), "passwordTxt"));
        signInBtn = new Button(LocatorHelper.getElement(this.getClass().getSimpleName(), "signinBtn"));
    }
    public void signIn(String username, String password)  {
        usernameTxt.sendText(username);
        signInContinueBtn.clickButton();
        passwordTxt.sendText(password);
        signInBtn.clickButton();
    }
}
