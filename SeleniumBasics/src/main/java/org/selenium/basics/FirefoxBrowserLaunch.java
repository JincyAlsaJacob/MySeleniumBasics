package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxBrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
String Title=driver.getTitle();
System.out.println(Title);
String Current_URL=driver.getCurrentUrl();
System.out.println(Current_URL);
String Handle_ID=driver.getWindowHandle();
System.out.println(Handle_ID);
String PageSource=driver.getPageSource();
System.out.println(PageSource);
driver.close();
	}

}
