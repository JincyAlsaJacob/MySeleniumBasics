package org.selenium.basics;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AssignmentTestObsqura {
	public void verifySingleInputField()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement Enter_Message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Enter_Message.sendKeys("Hello");
		WebElement Show_Message_button=driver.findElement(By.cssSelector("button#button-one"));
		Show_Message_button.click();
		WebElement Your_Message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String Message=Your_Message.getText();
		System.out.println(Message);
		
		
	}
	public void verifyTwoInputField()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement EnterValue_A=driver.findElement(By.cssSelector("input#value-a"));
		EnterValue_A.sendKeys("15");
		WebElement EnterValue_B=driver.findElement(By.cssSelector("input#value-b"));
		EnterValue_B.sendKeys("40");
		WebElement GetTotal_button=driver.findElement(By.cssSelector("button#button-two"));
		GetTotal_button.click();
		WebElement Total_field=driver.findElement(By.xpath("//div[@id='message-two']"));
		String Total=Total_field.getText();
		System.out.println(Total);
	
	}
	public void verifyCheckBoxDemo()
	{ 
		boolean CheckBoxIsSelected;
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement SingleCheckBox=driver.findElement(By.cssSelector(".form-check-input"));
		CheckBoxIsSelected=SingleCheckBox.isSelected();
		System.out.println("Before Checkbox is selected : "+CheckBoxIsSelected);
		SingleCheckBox.click();
		CheckBoxIsSelected=SingleCheckBox.isSelected();
		System.out.println("After Checkbox is selected : "+CheckBoxIsSelected);
	}
	public void verifyRadioButtonDemo()
	{
		boolean IsMaleSelected;
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement SingleCheckBox=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		IsMaleSelected=SingleCheckBox.isSelected();
		System.out.println("Before Male is selected : "+IsMaleSelected);
		SingleCheckBox.click();
		IsMaleSelected=SingleCheckBox.isSelected();
		System.out.println("After Male is selected : "+IsMaleSelected);
		WebElement ShowSelectedValue_button=driver.findElement(By.cssSelector("button#button-one"));
		ShowSelectedValue_button.click();
		WebElement ShowSelectedValue_message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String message=ShowSelectedValue_message.getText();
		System.out.println(message);
	}
	public void verifyFormSubmit()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		WebElement Firstname_field=driver.findElement(By.cssSelector("#validationCustom01"));
		Firstname_field.sendKeys("Sooraj");
		WebElement Lastname_field=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		Lastname_field.sendKeys("Jain");
		WebElement Username_field=driver.findElement(By.cssSelector("#validationCustomUsername"));
		Username_field.sendKeys("sooraj123");
		WebElement City_field=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		City_field.sendKeys("Kollam");
		WebElement State_field=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		State_field.sendKeys("Kerala");
		WebElement Zip_field=driver.findElement(By.cssSelector("input[id='validationCustom05']"));
		Zip_field.sendKeys("123456");
		WebElement AgreeCheckBox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		AgreeCheckBox.click();
		WebElement SubmitForm_button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		SubmitForm_button.click();
		WebElement SubmitMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String Submit_msg=SubmitMessage.getText();
		System.out.println(Submit_msg);
	}
	
public void verifyColourFromDropdown()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/select-input.php");
	driver.manage().window().maximize();
	WebElement DropdownColor=driver.findElement(By.cssSelector("select#multi-select-field"));
	Select select=new Select(DropdownColor);
	//select.selectByVisibleText("Yellow");
	//select.selectByValue("Red");
	select.selectByIndex(2);
	WebElement ColorSelectedFromDropDown=select.getFirstSelectedOption();
	System.out.println("Selected Color : "+ColorSelectedFromDropDown.getText());
    List<WebElement> NumberOfColors=select.getOptions();
    System.out.println("Total no.of colors in dropdown : "+NumberOfColors.size());
    
}
	
public void verifyCustomerDelete()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	WebElement Customer_ID=driver.findElement(By.xpath("//input[@name='cusid']"));
	Customer_ID.sendKeys("12");
	WebElement SubmitButton=driver.findElement(By.xpath("//input[@name='submit']"));
	SubmitButton.click();
	Alert alert=driver.switchTo().alert();
	String PopupMessage=alert.getText();
	System.out.println("Popup Message : "+PopupMessage);
	alert.accept();
	String PopupMessage2=alert.getText();
	System.out.println("Message after clicking OK : "+PopupMessage2);
	alert.accept();
	
	
}

	public static void main(String[] args) {
		AssignmentTestObsqura obj=new AssignmentTestObsqura();
		//obj.verifySingleInputField();
		//obj.verifyTwoInputField();
		//obj.verifyCheckBoxDemo();
		//obj.verifyRadioButtonDemo();
		//obj.verifyFormSubmit();
		//obj.verifyColourFromDropdown();
		obj.verifyCustomerDelete();

	}

}
