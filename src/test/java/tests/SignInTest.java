package tests;

import java.io.IOException;

import helpers.ReadXLSdataEbay;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;
import pages.SignInPage;

public class SignInTest extends BaseTest{
	@Test(dataProviderClass = ReadXLSdataEbay.class, dataProvider = "bvtdataebay")
	public static void LoginTest(String username, String password) throws IOException, ParseException {
		HomePage homePage = new HomePage();
		homePage.SignInFromHomePage();
		SignInPage signInPage = new SignInPage();
		signInPage.signIn(username, password);
		SearchPage searchPage = new SearchPage();
		searchPage.Search();
		searchPage.verifyResult();
	}
}
