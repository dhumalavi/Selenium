package com.Aspire.selenium.ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Actions act=new Actions(driver);
//to move cursor 		
		List<WebElement> topele = driver.findElements(By.xpath("//div[@class='_331-kn _2tvxW']//a/div[2]"));
	
		for(WebElement Topele:topele)
		{
			act.moveToElement(Topele).perform();
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		
		List<WebElement> deals_of_the_day = driver.findElements(By.xpath("(//div[@class='_1oHPGm'])[1]//a/div[1]"));
		
		for(WebElement Deals_of_the_day:deals_of_the_day)
		{
			act.moveToElement(Deals_of_the_day).perform();
			
			Thread.sleep(2000);

		}
	
//to right click or context click
		
		WebElement fliplogo = driver.findElement(By.xpath("//div[@class='_3qX0zy']/a[1]"));
		
		//act.contextClick(fliplogo).perform();
		
		              // or  
		
		act.moveToElement(fliplogo).contextClick().perform();
		
		Thread.sleep(2000);
//to double click
		
		WebElement loginele = driver.findElement(By.xpath("//a[text()='Login']"));
		
		act.doubleClick(loginele);
		
		Thread.sleep(4000);
		driver.close();
	}










}
