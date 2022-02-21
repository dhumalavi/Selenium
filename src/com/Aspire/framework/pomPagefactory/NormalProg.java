package com.Aspire.framework.pomPagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalProg 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		Enter UI
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DP6852");
		Thread.sleep(2000);
//		Enter pass
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pramod@2105");
		Thread.sleep(2000);
//		Enter button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
//		Enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");
		Thread.sleep(2000);
//		Enter continue
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		Thread.sleep(2000);
//		logo verification
		
		boolean explogo=true;
		boolean logo = driver.findElement(By.xpath("//img[@alt='Kite logo']")).isDisplayed();
		System.out.println(logo);
		
		if(explogo=logo)
		{
			System.out.println("Logo Verification Is Passed");
		}
		else
		{
			System.out.println("Logo Verification Is Failed");
		}
		Thread.sleep(2000);
//      initial name verification
		
		 String expinitialName = "PM";
		 String initialname = driver.findElement(By.xpath("//div[@id='avatar-83']//span")).getText();
		
		 System.out.println(initialname);
		
		 if(expinitialName.equals(initialname))
		 {
				System.out.println("Initial Name Verification Is Passed");
			}
			else
			{
				System.out.println("Initial Name Verification Is Failed");
			}
		 
		Thread.sleep(4000);
		
		driver.close();
	}
}
