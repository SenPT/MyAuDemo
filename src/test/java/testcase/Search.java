package testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Search extends BaseTest{
	@Test
	public static void SearchFunction() {
		driver.findElement(By.id(prop.getProperty("Search_textbox"))).sendKeys("back");
		driver.findElement(By.id(prop.getProperty("search_button"))).click();
		String actual = driver.findElement(By.xpath(prop.getProperty("search_result_title"))).getText();
		System.out.println(actual);
		boolean actualResult = actual.contains("back");
		Assert.assertTrue(actualResult);
	}
}
