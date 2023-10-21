package elementHelper;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driverHelper.DriverManager.driver;

public class BaseElement {
   public WebElement ele;
   protected By by;

   public BaseElement(By by) {
      this.by = by;
   }
   public void findElement(By by) {
      ele = driver.findElement(this.by);
   }

   public String getText(){
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      wait.until(ExpectedConditions.visibilityOfElementLocated(this.by));
      this.findElement(this.by);
      return this.ele.getText();
   }
}
