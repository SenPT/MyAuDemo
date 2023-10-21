package elementHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driverHelper.DriverManager.driver;

public class Textbox extends BaseElement{
    public Textbox(By by) {
        super(by);
    }
    public void sendText(String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.by));
        this.findElement(this.by);
        this.ele.sendKeys(value);
    }
}
