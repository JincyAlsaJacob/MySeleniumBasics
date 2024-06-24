package test_package;

import java.io.IOException;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.ExcelUtility;

public class HomePageTest extends Base{
	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actual_title=driver.getTitle();
		System.out.println("Title : "+actual_title);
		String expected_title=ExcelUtility.getStringData(0, 1, "HomePage");
		System.out.println("Expected Title : "+expected_title);
		Assert.assertEquals(actual_title, expected_title, "INVALID TITLE");
	}
	@Test
	public void verifyCommunityPollSelection()
	{
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> communitypoll_options=driver.findElements(By.xpath("//li[@class='answer']//input[@type='radio']//following-sibling::label"));
		for(WebElement e:communitypoll_options)
		{
			String options=e.getText();
			System.out.println("Options : "+options);
			String variable_option=ExcelUtility.getStringData(0, 1, "HomePage");
			if(options.equals(variable_option))
			{
				e.click();
			}
			
		}
		WebElement good_button=driver.findElement(By.id("pollanswers-2"));
		boolean isradiobuttonselected=good_button.isSelected();
		Assert.assertTrue(isradiobuttonselected, "Radio Button Not Selected");
	}
	

}
