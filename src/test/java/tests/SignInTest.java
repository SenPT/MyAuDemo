package tests;

import org.testng.annotations.Test;

import pages.SignInPage;

public class SignInTest extends BaseTest{
	@Test()
	public static void LoginTest(){
		SignInPage signInPage = new SignInPage();
		signInPage.signIn("username", "password");
	}
}
