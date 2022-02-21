package com.Aspire.framework.facebookpomPagefactoryDatadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage

{

	@FindBy (xpath="//a[@aria-label='Facebook']")WebElement logo;
	
	@FindBy (xpath="")WebElement text;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void logodisplay(boolean explogo)
	{
		boolean actlogo = logo.isDisplayed();
		
		if(explogo=actlogo)
		{
			System.out.println("TC-01 Test case for Facebook logo is display PASS");
		}
		
		else
		{
			System.out.println("TC-01 Test case for Facebook logo is display FAIL");
		}
		
	}
	
	


}

