package test_package;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class HomePageTest extends Base{
	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actual_title=driver.getTitle();
		System.out.println("Title : "+actual_title);
		String expected_title="Demo Web Shop";
		Assert.assertEquals(actual_title, expected_title, "INVALID TITLE");
	}
	@Test
	public void verifyCommunityPollSelection()
	{
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> communitypoll_options=driver.findElements(By.xpath("//ul[@class='poll-options']"));
		for(WebElement e:communitypoll_options)
		{
			//System.out.println(e.getText());
			String options=e.getText();
			if(options.equals("Good"))
			{
				e.click();
			}
		}
	}
	

}
