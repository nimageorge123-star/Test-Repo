package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseClass {

	@Test(groups = {
			"Regression" }, description = "verifyTheUserIsAbleToLoginUsingValidCredentials", retryAnalyzer = retry.Retry.class)
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {

		// String Username= "admin";
		// String Password= "admin";

		String Username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String Password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(Username);
		loginpage.enterThePassword(Password);
		loginpage.clickOnsignin();
		boolean homepage = loginpage.isDashboardDisplayed();
		Assert.assertTrue(homepage, Constant.ValidUsernameAndValidPassword);
	}

	@Test(description = "verifyTheUserIsAbleToLoginUsingValidUsernameAndInvalidPassword")
	public void verifyTheUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() {

		String Username = "admin";
		String Password = "trt";

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(Username);
		loginpage.enterThePassword(Password);
		loginpage.clickOnsignin();
		boolean alert = loginpage.isAlertdDisplayed();
		Assert.assertTrue(alert, "Able to login with ValidUsernameAndInvalidPassword");
		System.out.println("alert message");
	}

	@Test(description = "verifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword")
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() {

		String Username = "trt";
		String Password = "admin";

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(Username);
		loginpage.enterThePassword(Password);
		loginpage.clickOnsignin();
	}

	@Test(description = "verifyTheUserIsAbleToLoginUsingInvalidUsernameAndInvalidPassword")
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndInvalidPassword() {

		String Username = "trt";
		String Password = "trt";

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(Username);
		loginpage.enterThePassword(Password);
		loginpage.clickOnsignin();
	}
}
