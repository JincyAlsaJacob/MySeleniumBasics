package test_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.ExcelUtility;

public class RegistrationPageTest extends Base{
	@Test
	public void verifyRegistrationPageTitle() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/register");
		String actual_title=driver.getTitle();
		System.out.println("Title : "+actual_title);
		String expected_title=ExcelUtility.getStringData(0, 0, "RegistrationPage");
		Assert.assertEquals(actual_title, expected_title, "INVALID TITLE");
	}
	@Test
	public void verifyUserRegistration() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender_field=driver.findElement(By.id("gender-female"));
		gender_field.click();
		WebElement Firstname_field=driver.findElement(By.id("FirstName"));
		String firstname_excel=ExcelUtility.getStringData(0, 1, "RegistrationPage");
		Firstname_field.sendKeys(firstname_excel);
		WebElement Lastname_field=driver.findElement(By.id("LastName"));
		String lastname_excel=ExcelUtility.getStringData(0, 2, "RegistrationPage");
		Lastname_field.sendKeys(lastname_excel);
		WebElement Email_field=driver.findElement(By.id("Email"));
		String email_excel=ExcelUtility.getStringData(0, 3, "RegistrationPage");
		Email_field.sendKeys(email_excel);
		WebElement Password_field=driver.findElement(By.id("Password"));
		String password_excel=ExcelUtility.getStringData(0, 4, "RegistrationPage");
		Password_field.sendKeys(password_excel);
		WebElement ConfirmPassword_field=driver.findElement(By.id("ConfirmPassword"));
		String confirmpassword_excel=ExcelUtility.getStringData(0, 4, "RegistrationPage");
		ConfirmPassword_field.sendKeys(confirmpassword_excel);
		WebElement Register_button=driver.findElement(By.id("register-button"));
		Register_button.click();
		WebElement successful_message=driver.findElement(By.xpath("//div[@class='result']"));
		String actual_message=successful_message.getText();
		System.out.println("Actual Message : "+actual_message);
		String expected_message=ExcelUtility.getStringData(0, 5, "RegistrationPage");
		Assert.assertEquals(actual_message, expected_message, "INVALID MAIL_ID");
	}

}
