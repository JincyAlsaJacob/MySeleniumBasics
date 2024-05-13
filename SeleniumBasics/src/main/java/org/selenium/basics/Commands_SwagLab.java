package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands_SwagLab {
	public void verifySwapLabLogin()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement Username_field=driver.findElement(By.id("user-name"));
		Username_field.sendKeys("standard_user");
		WebElement Password_field=driver.findElement(By.id("password"));
		Password_field.sendKeys("secret_sauce");
		WebElement Login_button=driver.findElement(By.id("login-button"));
		Login_button.click();
		
	}
	public void verifySwapLoginName()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		driver.manage().window().maximize();
		WebElement Username_field=driver.findElement(By.name("user-name"));
		Username_field.sendKeys("standard_user");
		WebElement Password_field=driver.findElement(By.name("password"));
		Password_field.sendKeys("secret_sauce");
		WebElement Login_button=driver.findElement(By.name("login-button"));
		 Login_button.click();
	}
	public void verifySwapLoginClass()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
		driver.manage().window().maximize();
		WebElement Username_field=driver.findElement(By.className("input_error form_input"));
		Username_field.sendKeys("standard_user");
		WebElement Password_field=driver.findElement(By.className("input_error form_input"));
		 Password_field.sendKeys("secret_sauce");
		 WebElement Login_button=driver.findElement(By.className("submit-button btn_action"));
		 Login_button.click();
		
	}
	public static void main(String[] args) {
		Commands_SwagLab obj=new Commands_SwagLab();
		//obj.verifySwapLabLogin();
		//obj.verifySwapLoginClass();
		obj.verifySwapLoginName();
	
	}

}
