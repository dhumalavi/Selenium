package com.Aspire.framework.pomPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	@FindBy (xpath="//input[@type='text']") WebElement UN;
	
	@FindBy (xpath="//input[@type='password']")WebElement pwd;
	
	@FindBy (xpath="//button[@type='submit']") WebElement loginbtn;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName()
	{
		UN.sendKeys("DP6852");
	}
	
	public void enterPassword() 
	{
		pwd.sendKeys("Pramod@2105");
	}
	
	public void loginButton()
	{
		loginbtn.click();
	}
	
//	Enter UI
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DP6852");
//	Thread.sleep(2000);
//	Enter pass
//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pramod@2105");
//	Thread.sleep(2000);
//	Enter button
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(2000);

}
