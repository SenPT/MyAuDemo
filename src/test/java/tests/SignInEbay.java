package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import helpers.ReadXLSdataEbay;

public class SignInEbay extends BaseTest {
	
//	@Test(dataProviderClass=ReadXLSdataEbay.class, dataProvider = "bvtdataebay")
//	public static void LoginEbay(String username, String password) throws InterruptedException {
//		driver.findElement(By.linkText(prop.getProperty("Sign_in_link"))).click();
//		driver.findElement(By.id(prop.getProperty("user_id_textbox"))).sendKeys(username);
//		driver.findElement(By.id(prop.getProperty("continue_button"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id(prop.getProperty("password_textbox"))).sendKeys(password);
//		driver.findElement(By.id(prop.getProperty("Sign_in_button"))).click();
//		Thread.sleep(2000);
//		Assert.assertEquals(username,"phanthise51195@gmail.com", "Username is incorrect");
//		Assert.assertEquals(password,"S12345678","Password is incorrect");
//	}
}
