package com.Aspire.selenium.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomisedListBox 

{

	public static void main(String[] args) throws InterruptedException

	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(4000);
//		act.moveToElement(month).click().perform();
		
		act.click(month).perform();
		Thread.sleep(4000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
}
