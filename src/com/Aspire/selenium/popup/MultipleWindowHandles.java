package com.Aspire.selenium.popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		
		String id = driver.getWindowHandle();
		
		System.out.println("Parant window handle id = "+id);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='win1']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for(String Ids:ids)
		{
			System.out.println(Ids);
		}
		
		ArrayList<String> ar=new ArrayList<String>(ids);
		
		driver.switchTo().window(ar.get(1));
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung");
		Thread.sleep(2000);
		
		driver.switchTo().window(ar.get(0));
		
		
		String wintext = driver.findElement(By.xpath("//label[contains(text(),'Drag and ')]")).getText();
		
		System.out.println(wintext);
		
	
		
		
	}
}
