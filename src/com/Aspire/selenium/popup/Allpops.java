package com.Aspire.selenium.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allpops 

{
	public static void main(String []args) throws InterruptedException

	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Thread.sleep(2000);
		Alert alr = driver.switchTo().alert();
		
		String text = alr.getText();
		
		System.out.println(text);
		Thread.sleep(2000);
		alr.dismiss();
		
		

		Thread.sleep(5000);
		driver.close();

////Alert popup
//		//alert***********************************
//		
//		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
//		
//		Alert alt = driver.switchTo().alert();
//		
//		System.out.println(alt.getText());
//		
//		Thread.sleep(2000);
//		alt.accept();
//
//		Thread.sleep(2000);
//		
//		//confirm box*************************************
//		
//		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
//		
//		Alert confirmtext = driver.switchTo().alert();
//		
//		
//		System.out.println(confirmtext.getText());
//		
//		Thread.sleep(2000);
//		
//		confirmtext.dismiss();
//	
//		Thread.sleep(2000);
//		
//		//prompt box
		
//
//		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
//		
//		Alert prompttext = driver.switchTo().alert();
//		
//		prompttext.sendKeys("Avinash Dhumal");
//		
//		Thread.sleep(2000);
//		
//		System.out.println(prompttext.getText());
//		
//		Thread.sleep(2000);
//		
//		prompttext.dismiss();
//	
//		Thread.sleep(2000);
//		
//		Thread.sleep(5000);
//		
//		driver.close();
	}
}
