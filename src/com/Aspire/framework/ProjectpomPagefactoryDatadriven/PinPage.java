package com.Aspire.framework.ProjectpomPagefactoryDatadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{


	@FindBy (xpath="//*[@id=\"pin\"]") private WebElement pin;
	
	
	@FindBy (xpath="//button[@type='submit']") private WebElement sub;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String pn)
	{
		pin.sendKeys(pn);
	}
	
	public void Submit()
	{
			sub.click();
	}
	
	
}
