package com.Aspire.selenium.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CovidTable 
{

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://prsindia.org/covid-19/cases");
		 
		 
		 List<WebElement> heading = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered']//tr/th"));
		
		 
		 
		 int row_count = driver.findElements(By.xpath("//div[@id='w0']//tr//td[1]")).size();
		
		  int column_count = driver.findElements(By.xpath("//div[@id='w0']//tr[2]/td")).size();
		 
		 
	
	for(WebElement Heading:heading)
	{
		System.out.print(Heading.getText()+">            < ");
	}
	
	System.out.println();
	
	
	for(int i=0; i<=row_count; i++) 
	
	{
		for(int j=1; j<=column_count; j++)
		{
			   String alldata = driver.findElement(By.xpath("//div[@id='w0']//tr["+(i+1)+"]/td["+j+"]")).getText();
		
			  System.out.print(alldata+" >               < ");
		}
		System.out.println();
			
	}
	
	Thread.sleep(2000);
	
	driver.close();
	}
}

