package tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;
import pages.SignInPage;

public class SignInTest extends BaseTest{
	@Test()
	public static void LoginTest() throws IOException, ParseException, InterruptedException {
		HomePage homePage = new HomePage();
		homePage.SignInFromHomePage();
		SignInPage signInPage = new SignInPage();
		signInPage.signIn("phanthisen51195@gmail.com", "S12345678");
		SearchPage searchPage = new SearchPage();
		searchPage.Search();
	}
}
