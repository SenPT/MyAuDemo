package elementHelper;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

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
      this.findElement(_by);
      this.ele.sendKeys(value);
   }
}
