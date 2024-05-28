package org.testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends BrowserLaunch {
	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtitle=driver.getTitle();
		System.out.println("Title : "+actualtitle);
		String expectedtitle="Demo Web Shop";
		Assert.assertEquals(actualtitle, expectedtitle,"INVALID TITLE");
	}
	@Test
	public void verifyDemoWebShopLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Login_field=driver.findElement(By.className("ico-login"));
		Login_field.click();
		WebElement Emailid_field=driver.findElement(By.id("Email"));
		Emailid_field.sendKeys("anikha123@gmail.com");
		WebElement Password_field=driver.findElement(By.id("Password"));
		Password_field.sendKeys("anik123asd");
		WebElement Login_button=driver.findElement(By.className("login-button"));
		Login_button.click();
		WebElement LoginEmail=driver.findElement(By.xpath("//a[text()='anikha123@gmail.com']"));
		String actualmailID=LoginEmail.getText();
		System.out.println("Actual MailID :" +actualmailID);
		String expectedmailID="anikha123@gmail.com";
		Assert.assertEquals(actualmailID, expectedmailID, "INVALID MAILID");
	}
	@Test
	public void verifyIsSelected()
	{   boolean ismaleselected;
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender_male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		ismaleselected=gender_male.isSelected();
		Assert.assertFalse(ismaleselected, "Male Selected");
		gender_male.click();
		ismaleselected=gender_male.isSelected();
		Assert.assertTrue(ismaleselected, "Male not Selected");
	}
	@Test
	public void verifyIsEnabled()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Subscribe_button=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		boolean isSubscribeButtonIsEnabled=Subscribe_button.isEnabled();
		Assert.assertTrue(isSubscribeButtonIsEnabled, "Subscribe Button not enabled ");
	}
	@Test
	public void verifyIsDisplayed()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Vote_button=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
	    boolean isVoteButtonIsDisplayed=Vote_button.isDisplayed();
	    Assert.assertTrue(isVoteButtonIsDisplayed, "Vote Button not displayed");
	}
}
