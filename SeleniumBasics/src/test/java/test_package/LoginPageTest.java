package test_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import dataprovider.DataProviders;
import listeners.RetryAnalyzer;
import utilities.ExcelUtility;

public class LoginPageTest extends Base{
	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void verifyLoginPageTitle() 
	{
		driver.get("https://demowebshop.tricentis.com/login");
		String actual_title=driver.getTitle();
		System.out.println("Title : "+actual_title);
		String expected_title=ExcelUtility.getStringData(0, 0, "LoginPage");
		System.out.println("Expected Title : "+expected_title);
		Assert.assertEquals(actual_title, expected_title, "INVALID TITLE");
	}
	@Test
	public void verifyUserLogin()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email_field=driver.findElement(By.id("Email"));
		String email_excel=ExcelUtility.getStringData(0, 1, "LoginPage");
		email_field.sendKeys(email_excel);
		WebElement password_field=driver.findElement(By.id("Password"));
		String password_excel=ExcelUtility.getStringData(0, 2, "LoginPage");
		password_field.sendKeys(password_excel);
		WebElement Login_button=driver.findElement(By.className("login-button"));
		Login_button.click();
		WebElement LoginEmail=driver.findElement(By.xpath("//a[text()='anikha123@gmail.com']"));
		String actualmailID=LoginEmail.getText();
		System.out.println("Actual MailID :" +actualmailID);
		String expectedmailID=email_excel;
		Assert.assertEquals(actualmailID, expectedmailID, "INVALID MAILID");
	}
	@Test(dataProvider="InvalidUserCredentials",dataProviderClass=DataProviders.class)
	public void verifyUserLoginWithInvalidCredentials(String username, String password)
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login_field=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login_field.click();
		WebElement email_field=driver.findElement(By.id("Email"));
		email_field.sendKeys(username);
		WebElement password_field=driver.findElement(By.id("Password"));
		password_field.sendKeys(password);
		WebElement Login_button=driver.findElement(By.xpath("//input[@value='Log in']"));
		Login_button.click();
		WebElement loginfail_message_field=driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
		String actual_message=loginfail_message_field.getText();
		System.out.println("Actual Message : "+actual_message );
		String expected_message=ExcelUtility.getStringData(1, 0, "LoginPage");
		//System.out.println("Expected Message : "+expected_message);
		Assert.assertEquals(actual_message,expected_message, "Succesful Login");
	}

}
