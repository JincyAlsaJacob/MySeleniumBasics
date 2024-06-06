package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class RegistrationPageTest extends Base{
	@Test
	public void verifyRegistrationPageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		String actual_title=driver.getTitle();
		System.out.println("Title : "+actual_title);
		String expected_title="Demo Web Shop. Register";
		Assert.assertEquals(actual_title, expected_title, "INVALID TITLE");
	}
	@Test
	public void verifyUserRegistration()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender_field=driver.findElement(By.id("gender-female"));
		gender_field.click();
		WebElement Firstname_field=driver.findElement(By.id("FirstName"));
		Firstname_field.sendKeys("Fidah");
		WebElement Lastname_field=driver.findElement(By.id("LastName"));
		Lastname_field.sendKeys("Kumar");
		WebElement Email_field=driver.findElement(By.id("Email"));
		Email_field.sendKeys("fidah457@gmail.com");
		WebElement Password_field=driver.findElement(By.id("Password"));
		Password_field.sendKeys("kumar@321");
		WebElement ConfirmPassword_field=driver.findElement(By.id("ConfirmPassword"));
		ConfirmPassword_field.sendKeys("kumar@321");
		WebElement Register_button=driver.findElement(By.id("register-button"));
		Register_button.click();
		WebElement successful_message=driver.findElement(By.xpath("//div[@class='result']"));
		String actual_message=successful_message.getText();
		System.out.println("Actual Message : "+actual_message);
		String expected_message= "Your registration completed";
		Assert.assertEquals(actual_message, expected_message, "INVALID MAIL_ID");
		WebElement Continue_button=driver.findElement(By.className("register-continue-button"));
		Continue_button.click();
		/*WebElement login_email=driver.findElement(By.xpath("//a[text()='fidah457@gmail.com']"));
		String actual_mailID=login_email.getText();
		System.out.println("Actual MailID :" +actual_mailID);
		String expected_mailID="fidah457@gmail.com";
		Assert.assertEquals(actual_mailID, expected_mailID, "INVALID MAIL_ID");*/
		
	}

}
