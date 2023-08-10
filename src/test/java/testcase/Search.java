package testcase;

import org.openqa.selenium.By;

import base.BaseTest;

public class Search extends BaseTest{
	public static void SearchFunction() {
		driver.findElement(By.id(prop.getProperty("Search_textbox"))).sendKeys("back");
		driver.findElement(By.id(prop.getProperty("search_button"))).click();
	}
}
