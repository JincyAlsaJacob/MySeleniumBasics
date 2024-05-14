package org.selenium.basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
	public void verifyDemoWebShopRegister()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement Register_field=driver.findElement(By.className("ico-register"));
		Register_field.click();
		
	}
	public void verifyDemoWebShopLogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement Login_field=driver.findElement(By.className("ico-login"));
		Login_field.click();
		WebElement Emailid_field=driver.findElement(By.id("Email"));
		Emailid_field.sendKeys("anikha123@gmail.com");
		WebElement Password_field=driver.findElement(By.id("Password"));
		Password_field.sendKeys("anik123asd");
		WebElement Login_button=driver.findElement(By.className("login-button"));
		Login_button.click();
	}
	public void verifyLinkText()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement destination_field=driver.findElement(By.linkText("your destination"));
		destination_field.click();	
		driver.close();
		}
public void verifyPartialLinktext()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/index.php");
	driver.manage().window().maximize();
	WebElement destination_field=driver.findElement(By.partialLinkText("destination"));
	destination_field.click();
	driver.close();
}
public void verifyTotalNumberofTagsintheApplication()
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	List<WebElement> input_type=driver.findElements(By.tagName("input"));
	int input_size= input_type.size();
	System.out.println("Total no.of input tags are "+input_size);
	
	
	
}
public void verifyDemoWebShopLoginusing_xPath()
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	WebElement Login_field=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	Login_field.click();
	WebElement Emailid_field=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
	Emailid_field.sendKeys("anikha123@gmail.com");
	WebElement Password_field=driver.findElement(By.xpath("//*[@id=\"Password\"]"));
	Password_field.sendKeys("anik123asd");
	WebElement Login_button=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
	Login_button.click();
}
public void verifyDemoWebShopLoginUsing_cssSelector()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	WebElement Login_field=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
	Login_field.click();
	WebElement Emailid_field=driver.findElement(By.cssSelector("#Email"));
	Emailid_field.sendKeys("anikha123@gmail.com");
	WebElement Password_field=driver.findElement(By.cssSelector("#Password"));
	Password_field.sendKeys("anik123asd");
	WebElement Login_button=driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
	Login_button.click();
}
public void verifyDemoWebShopRegistration()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement Register_field=driver.findElement(By.className("ico-register"));
	Register_field.click();
	WebElement Gender_field=driver.findElement(By.id("gender-female"));
	Gender_field.click();
	WebElement Firstname_field=driver.findElement(By.id("FirstName"));
	Firstname_field.sendKeys("Radhika");
	WebElement Lastname_field=driver.findElement(By.id("LastName"));
	Lastname_field.sendKeys("Kumar");
	WebElement Email_field=driver.findElement(By.id("Email"));
	Email_field.sendKeys("radha457@gmail.com");
	WebElement Password_field=driver.findElement(By.id("Password"));
	Password_field.sendKeys("kumar@321");
	WebElement ConfirmPassword_field=driver.findElement(By.id("ConfirmPassword"));
	ConfirmPassword_field.sendKeys("kumar@321");
	WebElement Register_button=driver.findElement(By.id("register-button"));
	Register_button.click();
	WebElement Continue_button=driver.findElement(By.className("register-continue-button"));
	Continue_button.click();
}
public void verifyGuru99Registration()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/login.php");
	driver.manage().window().maximize();
	WebElement Register_field=driver.findElement(By.linkText("REGISTER"));
	Register_field.click();
	WebElement Firstname_field=driver.findElement(By.name("firstName"));
	Firstname_field.sendKeys("Radhika");
	WebElement Lastname_field=driver.findElement(By.name("lastName"));
	Lastname_field.sendKeys("Kumar");
	WebElement Phone_field=driver.findElement(By.name("phone"));
	Phone_field.sendKeys("1234567890");
	WebElement Email_field=driver.findElement(By.id("userName"));
	Email_field.sendKeys("radha457@gmail.com");
	WebElement Address_field=driver.findElement(By.name("address1"));
	Address_field.sendKeys("abcdhouse");
	WebElement City_field=driver.findElement(By.name("city"));
	City_field.sendKeys("kottarakara");
	WebElement State_field=driver.findElement(By.name("state"));
	State_field.sendKeys("Kollam");
	WebElement PostalCode_field=driver.findElement(By.name("postalCode"));
	PostalCode_field.sendKeys("123456");
	WebElement Username_field=driver.findElement(By.id("email"));
	Username_field.sendKeys("Radhika456");
	WebElement Password_field=driver.findElement(By.name("password"));
	Password_field.sendKeys("kumar@321");
	WebElement ConfirmPassword_field=driver.findElement(By.name("confirmPassword"));
	ConfirmPassword_field.sendKeys("kumar@321");
	WebElement Submit_button=driver.findElement(By.name("submit"));
	Submit_button.click();
	
	
}
	public static void main(String[] args) 
	{
		Commands obj=new Commands();
	  // obj.verifyDemoWebShopRegister();
	 //obj.verifyDemoWebShopLogin();
	 //obj.verifyLinkText();
	//obj.verifyPartialLinktext();
	//obj.verifyTotalNumberofTagsintheApplication();
    //obj.verifyDemoWebShopLoginusing_xPath();
	//obj.verifyDemoWebShopLoginUsing_cssSelector();
		//obj.verifyDemoWebShopRegistration();
		obj.verifyGuru99Registration();
		
	}

}
