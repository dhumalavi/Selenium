package com.Aspire.framework.facebookpomPagefactoryDatadriven;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{

	
	
	@FindBy (xpath="//input[@type='text']")WebElement logid;
	
	@FindBy (xpath="//input[@type='password']")WebElement password ;
	
	@FindBy (xpath="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")WebElement submit;
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void loginidinput(String username)
	{
		logid.sendKeys(username);
	}
	
	public void passwordinput(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void submit()
	{
		submit.click();
	}
}
