package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
driver.get("https://www.javatpoint.com/");
driver.manage().window().maximize();
	}

}
