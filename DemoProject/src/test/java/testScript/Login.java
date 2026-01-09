package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends BaseClass {
	
	
	@Test
	public void logintoApp()
	{
		String UserName = "admin";
		String Password= "admin";
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys(UserName);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Password);
		WebElement signin= driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}

	@Test
	public void logintoApp1()
	{
		String UserName1 = "test";
		String Password1= "admin";
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys(UserName1);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Password1);
		WebElement signin= driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	@Test
	public void logintoApp2()
	{
		String UserName2 = "admin";
		String Password2= "test";
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys(UserName2);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Password2);
		WebElement signin= driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	
	@Test
	public void logintoApp3()
	{
		
		String UserName3 = "testing";
		String Password3= "test"; 
		
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys(UserName3);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Password3);
		WebElement signin= driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
}
