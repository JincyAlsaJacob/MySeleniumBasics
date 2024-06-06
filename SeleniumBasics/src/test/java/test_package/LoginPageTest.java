package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class LoginPageTest extends Base{
	@Test
	public void verifyLoginPageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		String actual_title=driver.getTitle();
		System.out.println("Title : "+actual_title);
		String expected_title="Demo Web Shop. Login";
		Assert.assertEquals(actual_title, expected_title, "INVALID TITLE");
	}
	@Test
	public void verifyUserLogin()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email_field=driver.findElement(By.id("Email"));
		email_field.sendKeys("anikha123@gmail.com");
		WebElement password_field=driver.findElement(By.id("Password"));
		password_field.sendKeys("anik123asd");
		WebElement Login_button=driver.findElement(By.className("login-button"));
		Login_button.click();
		WebElement LoginEmail=driver.findElement(By.xpath("//a[text()='anikha123@gmail.com']"));
		String actualmailID=LoginEmail.getText();
		System.out.println("Actual MailID :" +actualmailID);
		String expectedmailID="anikha123@gmail.com";
		Assert.assertEquals(actualmailID, expectedmailID, "INVALID MAILID");
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials()
	{
		
	}

}
