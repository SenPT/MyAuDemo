package elementHelper;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static driverHelper.DriverManager.driver;

public class BaseElement {
   public WebElement ele;
   private By _by;

   public BaseElement(By by) {
      this._by = by;
   }

   public void findElement(By by) {
      ele = driver.findElement(this._by);
   }

   public void sendText(String value) {
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
      wait.until(ExpectedConditions.visibilityOfElementLocated(_by));
      this.findElement(_by);
      this.ele.sendKeys(value);
   }

   public void clickButton(){
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
      wait.until(ExpectedConditions.visibilityOfElementLocated(_by));
      this.findElement(_by);
      this.ele.click();
   }
}
