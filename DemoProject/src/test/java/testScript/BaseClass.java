package testScript;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constant;
import utilities.WaitUtilities;

public class BaseClass {

	public WebDriver driver;
	FileInputStream fileinputstream;
	Properties properties;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void initializebrowser(String browser) throws Exception {

		try {
			properties = new Properties();
			fileinputstream = new FileInputStream(Constant.fileinput);
			properties.load(fileinputstream);
		} catch (Exception e) {
			System.out.println(e);
		}

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else {
			throw new Exception("Invalid browser");
		}

		// driver.get("https://groceryapp.uniqassosiates.com/admin");

		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtilities.IMPLICITWAIT));

		driver.manage().window().maximize();

	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {

		driver.quit();
	}

}
