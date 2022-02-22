package com.Aspire.framework.testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test2 {
	
	
		WebDriver driver;
		

		@Test
		public void browser_opening() throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		}
		
		@Test
		public void hiddenpopupclose() throws InterruptedException 
		{
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		}
		@Test
		public void movemouse() throws InterruptedException 
		{
		Actions act=new Actions(driver);
		
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		
		act.moveToElement(fashion).perform();

		Thread.sleep(2000);}
		
//		List<WebElement> dropdown = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
//		
//		for(WebElement Dropdown:dropdown)
//		{
//			System.out.println(Dropdown.getText());
//			
//		}
//		
	
}


