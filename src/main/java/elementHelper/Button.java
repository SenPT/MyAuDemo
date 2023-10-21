package elementHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driverHelper.DriverManager.driver;

public class Button extends BaseElement {

    public Button(By by) {
        super(by);
    }
    public void clickButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.by));
        this.findElement(this.by);
        this.ele.click();
    }
}

