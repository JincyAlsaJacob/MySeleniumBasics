package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
driver.get("https://www.javatpoint.com/");
driver.manage().window().maximize();
String title=driver.getTitle();
System.out.println(title);
String Current_URL=driver.getCurrentUrl();
System.out.println(Current_URL);
String Handle_ID=driver.getWindowHandle();
System.out.println(Handle_ID);
String PageSource=driver.getPageSource();
System.out.println(PageSource);
driver.close();
	}

}
