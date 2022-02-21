package com.Aspire.selenium.ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.get("https://demo.guru99.com/test/newtours/");
	
	Thread.sleep(2000);
//	WebElement firstcell = driver.findElement(By.xpath("(//tr[@class='mouseOut'])[1]/td[1]"));           //to select one element
	
	List<WebElement> allcells = driver.findElements(By.xpath("//tr[@class='mouseOut']/td[1]"));          //to perform action on multiple element
	
	Actions act =new Actions(driver);
	
//	act.moveToElement(firstcell).perform();
	
	for(WebElement Allcells:allcells)
	{
		act.moveToElement(Allcells).perform();
		
		Thread.sleep(2000);
	}
	
	
	
}
}
