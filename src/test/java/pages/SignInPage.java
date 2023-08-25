package pages;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.LocatorHelper;

public class SignInPage extends BasePage{
    WebElement usernameTxt;
    WebElement passwordTxt;
    WebElement loginBtn;

    public SignInPage() throws IOException, ParseException {
        usernameTxt = driver.findElement(By.id(LocatorHelper.getElement(this.getClass().getSimpleName(), "usernameTxt")));
        passwordTxt = driver.findElement(By.id(LocatorHelper.getElement(this.getClass().getSimpleName(), "password_field")));
        loginBtn = driver.findElement(By.id(LocatorHelper.getElement(this.getClass().getSimpleName(), "login_button")));
    }

    public void signIn(String username, String password) {
        usernameTxt.sendKeys(username);
        passwordTxt.sendKeys(password);
        loginBtn.click();
    }
}
