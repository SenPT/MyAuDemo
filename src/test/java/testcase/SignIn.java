package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class SignIn extends BaseTest{

	@Test(dataProviderClass=ReadXLSdata.class, dataProvider = "bvtdata")
	public static void LoginTest(String username, String password) throws InterruptedException{
		driver.findElement(By.id(prop.getProperty("username_field"))).sendKeys(username);
		driver.findElement(By.id(prop.getProperty("password_field"))).sendKeys(password);
		driver.findElement(By.id(prop.getProperty("login_button"))).click();
		Thread.sleep(2000);
	}
}
