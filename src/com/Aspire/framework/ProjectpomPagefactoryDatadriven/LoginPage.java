package com.Aspire.framework.ProjectpomPagefactoryDatadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	@FindBy (xpath="//input[@type='text']") private WebElement logid;
	
	@FindBy (xpath="//input[@type='password']") private WebElement pass;
	
	@FindBy (xpath="//button[@type='submit']") private WebElement sub;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String login)
	{
		logid.sendKeys(login);
	}
	
	public void Password(String Pass)
	{
		pass.sendKeys(Pass);
	}
	
	public void Submit()
	{
			sub.click();
	}
	
}
