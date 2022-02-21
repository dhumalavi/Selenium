package com.Aspire.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
//		for(int i=0; i<=5; i++)
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
//		String random = RandomString.make(2);
		
//		File destination = new File("D:\\Testing\\SeleniumOct21\\Screenshots\\Avi"+i+".jpg");
		File destination = new File("D:\\Testing\\SeleniumOct21\\Screenshots\\Avi.jpg");
		
		//FileHandler.copy(source, destination);
		FileUtils.copyFile(source, destination);
		Thread.sleep(2000);
		driver.close();
		}
	}
}
