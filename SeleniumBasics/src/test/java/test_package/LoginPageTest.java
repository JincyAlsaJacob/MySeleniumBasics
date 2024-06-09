package test_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.ExcelUtility;

public class LoginPageTest extends Base{
	@Test
	public void verifyLoginPageTitle() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/login");
		String actual_title=driver.getTitle();
		System.out.println("Title : "+actual_title);
		String expected_title=ExcelUtility.getStringData(0, 0, "LoginPage");
		System.out.println("Expected Title : "+expected_title);
		Assert.assertEquals(actual_title, expected_title, "INVALID TITLE");
	}
	@Test
	public void verifyUserLogin() throws IOException
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
	@Test
	public void verifyUserLoginWithInvalidCredentials()
	{
		
	}

}
