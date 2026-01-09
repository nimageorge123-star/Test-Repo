package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.FileUploadUtility;
import utilities.WaitUtilities;

public class LoginPage {

	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;

	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement alertmessage;

	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	WaitUtilities waitutilities= new WaitUtilities();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);/// to initialize the webelements

	}

	public void enterTheUsername(String username2) {
		username.sendKeys(username2);
	}

	public void enterThePassword(String password2) {
		password.sendKeys(password2);
	}

	public void clickOnsignin() {
		
		
		waitutilities.waitForElementToBeClickable(driver, signin);
		signin.click();
	}

	/*
	 * public void choosefile() {
	 * fileuploadutility.Fileuploadusingsendkeys(dashboard, Constant.groceryimage);
	 * }
	 */
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}

	public boolean isAlertdDisplayed() {
		return alertmessage.isDisplayed();
	}

}
