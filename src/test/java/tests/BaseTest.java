package tests;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

import static driverHelper.DriverManager.driver;

public class BaseTest {
	private static Properties lop = new Properties();
	private static Properties prop = new Properties();
	private static FileReader fr;
	private static FileReader fr2;
	
	@BeforeMethod
	public void setUp() throws IOException {
		if(driver == null) {
			fr = new FileReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\configfiles\\config.properties");
			fr2 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			lop.load(fr);
			prop.load(fr2);
		}
		if (lop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(lop.getProperty("testEbayUrl"));
		}
		else if (lop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(lop.getProperty("testEbayUrl"));
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
