package com.Aspire.framework.ProjectpomPagefactoryDatadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 

{

	@FindBy (xpath="//span[text()='Avinash']") private WebElement a;
	
	
	@FindBy (xpath="//div[@class='app-nav']//a[2]/span") private WebElement b;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Nikname()
	{
	String	b=a.getText();
		System.out.println(b);
	}
	
	public void Submit()
	{
			b.click();
	}
	

	
	
}
