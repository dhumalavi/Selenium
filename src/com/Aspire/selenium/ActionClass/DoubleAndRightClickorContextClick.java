package com.Aspire.selenium.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndRightClickorContextClick 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);

//Right Click
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='right click me']"));

//		act.contextClick(ele1).perform();
		
		               //OR
		
		act.moveToElement(ele1).contextClick().build().perform();
		
// Double Click		
		WebElement ele2 = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To')]"));
		
		act.moveToElement(ele2).doubleClick().build().perform();
		              
		                //OR
		
		act.doubleClick(ele2).perform();
		
		Thread.sleep(2000);
		
}
}


