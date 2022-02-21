package com.Aspire.framework.pomPagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestClass 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUserName();
		lp.enterPassword();
		lp.loginButton();
		Thread.sleep(2000);
		
		PinPage pp=new PinPage(driver);
		
		pp.enterPin();
		pp.enterContinue();
		Thread.sleep(2000);
		
		HomePage hp= new HomePage(driver);
		
		hp.logoDisplay();
		hp.verifyInitialName();
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
