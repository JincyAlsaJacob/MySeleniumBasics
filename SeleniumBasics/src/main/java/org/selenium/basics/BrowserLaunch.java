package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaunch {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	String current_URL=driver.getCurrentUrl();
	System.out.println(current_URL);
	String handle_ID=driver.getWindowHandle();
	System.out.println(handle_ID);
	String pageSource=driver.getPageSource();
	System.out.println(pageSource);
	driver.close();
	}

}
