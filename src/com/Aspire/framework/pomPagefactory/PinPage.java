package com.Aspire.framework.pomPagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
	@FindBy (xpath="//input[@id='pin']") WebElement pin;
	
	@FindBy (xpath="//button[@class='button-orange wide']")WebElement continuebutton;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin() 
	{
	
		pin.sendKeys("976976");
	}
	
	public void enterContinue()
	{
		continuebutton.click();
	}
	
	
	
//	Enter pin
//	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");
//	Thread.sleep(2000);
//	Enter continue
//	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
//	Thread.sleep(2000);

}
