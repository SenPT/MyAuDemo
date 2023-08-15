package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.LocatorHelper;

public class SignInPage extends BasePage{
    WebElement usernameTxt;
    WebElement passwordTxt;
    WebElement loginBtn;

    public SignInPage() {
        usernameTxt = driver.findElement(By.id(LocatorHelper.getElement("usernameTxt")));
        passwordTxt = driver.findElement(By.id(LocatorHelper.getElement("password_field")));
        loginBtn = driver.findElement(By.id(LocatorHelper.getElement("login_button")));
    }

    public void signIn(String username, String password) {
        usernameTxt.sendKeys(username);
        passwordTxt.sendKeys(password);
        loginBtn.click();
    }
}
