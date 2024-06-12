package test_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class RegistrationPageTest extends Base{
	@Test
	public void verifyRegistrationPageTitle() 
	{
		driver.get("https://demowebshop.tricentis.com/register");
		String actual_title=driver.getTitle();
		System.out.println("Title : "+actual_title);
		String expected_title=ExcelUtility.getStringData(0, 0, "RegistrationPage");
		Assert.assertEquals(actual_title, expected_title, "INVALID TITLE");
	}
	@Test
	public void verifyUserRegistration() 
	{
		driver.get("https://demowebshop.tricentis.com/register");
		String firstname=RandomDataUtility.getFirstname();
		String lastname=RandomDataUtility.getLastname();
		String email_ID=firstname+"."+lastname+"@gmail.com";
		String password=firstname+"."+lastname;
		WebElement gender_field=driver.findElement(By.id("gender-female"));
		gender_field.click();
		WebElement Firstname_field=driver.findElement(By.id("FirstName"));
		Firstname_field.sendKeys(firstname);
		WebElement Lastname_field=driver.findElement(By.id("LastName"));
		Lastname_field.sendKeys(lastname);
		WebElement Email_field=driver.findElement(By.id("Email"));
		Email_field.sendKeys(email_ID);
		WebElement Password_field=driver.findElement(By.id("Password"));
		Password_field.sendKeys(password);
		WebElement ConfirmPassword_field=driver.findElement(By.id("ConfirmPassword"));
		ConfirmPassword_field.sendKeys(password);
		WebElement Register_button=driver.findElement(By.id("register-button"));
		Register_button.click();
		WebElement successful_message=driver.findElement(By.xpath("//div[@class='result']"));
		String actual_message=successful_message.getText();
		System.out.println("Actual Message : "+actual_message);
		String expected_message=ExcelUtility.getStringData(0, 5, "RegistrationPage");
		Assert.assertEquals(actual_message, expected_message, "INVALID MAIL_ID");
	}

}
