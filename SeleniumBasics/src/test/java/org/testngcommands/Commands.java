package org.testngcommands;

import org.testng.annotations.Test;

public class Commands extends BrowserLaunch {
	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println("Title : "+title);
	}

}
