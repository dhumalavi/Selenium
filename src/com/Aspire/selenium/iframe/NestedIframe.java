package com.Aspire.selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/nestedframes");
		
		
		
//By id or name		
//		driver.switchTo().frame("frame1");

//By index
		
//		driver.switchTo().frame(1);
		
//By Weblement		
		
	    WebElement parantframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
	    
	    driver.switchTo().frame(parantframe);
		
		String Paranttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		
		System.out.println(Paranttext);
		
// patrant to child
		
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		
		driver.switchTo().frame(childframe);
		
		String childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		
		System.out.println(childtext);
		
//child to parant	
		
		driver.switchTo().parentFrame();
		
//to main page
		
		driver.switchTo().defaultContent();
		
		String mainpagetext = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page')]")).getText();
		
		System.out.println(mainpagetext);
		
		driver.close();
		
		
	}
}
