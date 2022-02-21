package com.Aspire.framework.pomPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy (xpath="//img[@alt='Kite logo']")WebElement logo;
	@FindBy (xpath="//div[@id='avatar-83']//span") WebElement initialnames;
	
	public HomePage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoDisplay()
	{
		boolean actlogo = logo.isDisplayed();
		boolean explogo = true;
		
		if(explogo=actlogo)
			{
				System.out.println("Logo Verification Is Passed");
			}
		else
		{
			System.out.println("Logo Verification Is Failed");
		}
	}
	
	public void verifyInitialName()
	{		
		 String actinitialname = initialnames.getText();
		
		 String expinitialName = "PM";
		
		 if(expinitialName.equals(actinitialname))
	
		 {
			 System.out.println("Initial Name Verification Is Passed");
		 }
		 else
		 {
				System.out.println("Initial Name Verification Is Failed");
		 }
	}	
}	
	
//	boolean logo = driver.findElement(By.xpath("//img[@alt='Kite logo']")).isDisplayed();
//	System.out.println(logo);
//	
//	if(explogo=logo)
//	{
//		System.out.println("Logo Verification Is Passed");
//	}
//	else
//	{
//		System.out.println("Logo Verification Is Failed");
//	}
//	Thread.sleep(2000);
//  initial name verification
//	
//	 String expinitialName = "PM";
//	 String initialname = driver.findElement(By.xpath("//div[@id='avatar-83']//span")).getText();
//	
//	 System.out.println(initialname);
//	
//	 if(expinitialName.equals(initialname))
//	 {
//			System.out.println("Initial Name Verification Is Passed");
//		}
//		else
//		{
//			System.out.println("Initial Name Verification Is Failed");
//		}
	 

