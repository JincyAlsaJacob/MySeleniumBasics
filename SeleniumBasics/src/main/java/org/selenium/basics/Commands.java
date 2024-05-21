package org.selenium.basics;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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

public void verifyIsSelected()
{
	boolean ismaleselected;
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.manage().window().maximize();
	WebElement gender_male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	ismaleselected=gender_male.isSelected();
	System.out.println("Male element before selected :"+ismaleselected);
	gender_male.click();
	ismaleselected=gender_male.isSelected();
	System.out.println("Male element after selected "+ismaleselected);
	driver.close();

	
}
public void verifyIsEnabled()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement Subscribe_button=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
	boolean isSubscribeButtonIsEnabled=Subscribe_button.isEnabled();
	System.out.println("Subscribe button is enabled or not :"+isSubscribeButtonIsEnabled);
    driver.close();
}
public void verifyIsDisplayed()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebElement Vote_button=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
    boolean isVoteButtonIsDisplayed=Vote_button.isDisplayed();
    System.out.println("Vote button is displayed or not :"+isVoteButtonIsDisplayed);
    driver.close();
}
public void verifyValuesFromDropdown()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");	
	driver.manage().window().maximize();
	WebElement Country_Dropdown=driver.findElement(By.xpath("//select[@name='country']"));
    Select select =new Select(Country_Dropdown);
   // select.selectByVisibleText("ANTARCTICA");
   // select.selectByIndex(8);
    select.selectByValue("BHUTAN");
    WebElement First_SelectedCountryName=select.getFirstSelectedOption();
    System.out.println(First_SelectedCountryName.getText());
    }

public void verifyTotalNumberofDropdownValues()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");	
	driver.manage().window().maximize();
	WebElement Country_Dropdown=driver.findElement(By.xpath("//select[@name='country']"));
    Select select =new Select(Country_Dropdown);
    List<WebElement> DropDownlist=select.getOptions();
    System.out.println("Total no.of dropdown : "+DropDownlist.size());
    
}

public void verifyMultipleOptionsFromdropdown()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/select-input.php");	
	driver.manage().window().maximize();
	WebElement Dropdown_MultiSelector=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
    Select select=new Select(Dropdown_MultiSelector);
    boolean Selected_Options=select.isMultiple();
    System.out.println("Check whether multiple values are selected :"+Selected_Options);
    select.selectByIndex(2);
    select.selectByIndex(0);
    List<WebElement> ListofSelected_Options=select.getAllSelectedOptions();  
    for(WebElement e:ListofSelected_Options)
    {
    	System.out.println(e.getText());
    }
	select.deselectByIndex(0);
}

public void verifySimpleAlert()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");	
	driver.manage().window().maximize();
	WebElement ClickMeButton=driver.findElement(By.xpath("//button[@id='alertButton']"));
	ClickMeButton.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
}
public void verifyConfirmationAlert()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");	
	driver.manage().window().maximize();
	WebElement Clickme_Button=driver.findElement(By.xpath("//button[@id='confirmButton']"));
	Clickme_Button.click();
	Alert alert=driver.switchTo().alert();
	String PopUpMesssage=alert.getText();
	System.out.println("Message : "+PopUpMesssage);
	alert.accept();
	WebElement ConfirmedMessage=driver.findElement(By.xpath("//span[@id='confirmResult']"));
	String ConfirmtionMessageAfterOKSelect=ConfirmedMessage.getText();
	System.out.println("ConfirmationMessageAfterSelectingOK : "+ConfirmtionMessageAfterOKSelect);
	driver.close();
}
public void verifyPromptAlert()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");	
	driver.manage().window().maximize();
	WebElement ClickmeButton=driver.findElement(By.xpath("//button[@id='promtButton']"));
	ClickmeButton.click();
	Alert alert =driver.switchTo().alert();
	String Poup_Messsage=alert.getText();
	System.out.println("Popup Message : "+Poup_Messsage);
	alert.sendKeys("Anitha");
	alert.accept();
	WebElement ConfirmedMessage=driver.findElement(By.xpath("//span[@id='promptResult']"));
	String ConfirmtionMessageAfterOKSelect=ConfirmedMessage.getText();
	System.out.println("ConfirmationMessageAfterSelectingOK : "+ConfirmtionMessageAfterOKSelect);
	driver.close();
}

public void verifyRightClick()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
	driver.manage().window().maximize();
	WebElement RightClickButton=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions action=new Actions(driver);
    action.contextClick(RightClickButton).build().perform();
}

public void verifyDoubleClick()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
	driver.manage().window().maximize();
	WebElement DoubleClickButton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions action=new Actions(driver);
	action.doubleClick(DoubleClickButton).build().perform();
	Alert alert=driver.switchTo().alert();
	String PopUpMesssage=alert.getText();
	System.out.println("PopUpMessage : "+PopUpMesssage);
	alert.accept();
	driver.close();
}

public void verifyDragAndDrop()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable");	
	driver.manage().window().maximize();
	WebElement DragMe=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement DropHere=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
	Actions action=new Actions(driver);
	action.dragAndDrop(DragMe, DropHere).build().perform();
	driver.close();
}

public void verifyDragAndOffest()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/dragabble");	
	driver.manage().window().maximize();
	WebElement DragMe=driver.findElement(By.xpath("//div[@id='dragBox']"));
	Actions action=new Actions(driver);
	action.dragAndDropBy(DragMe, 50, 100).build().perform();
	driver.close();
	
}

public void verifyMouseOver()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/menu/");	
	driver.manage().window().maximize();
	WebElement MainItem_2MouseOver=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	Actions action=new Actions(driver);
	action.moveToElement(MainItem_2MouseOver).build().perform();
	WebElement SubList_MouseOver=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
	action.moveToElement(SubList_MouseOver).build().perform();

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
		//obj.verifyGuru99Registration();
		//obj.verifyIsSelected();
		//obj.verifyIsEnabled();
		//obj.verifyIsDisplayed();
		//obj.verifyValuesFromDropdown();
		//obj.verifyTotalNumberofDropdownValues();
		//obj.verifyMultipleOptionsFromdropdown();
		//obj.verifySimpleAlert();
		//obj.verifyConfirmationAlert();
		//obj.verifyPromptAlert();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick();
		//obj.verifyDragAndDrop();
		//obj.verifyDragAndOffest();
		obj.verifyMouseOver();
		
		
	}

}
