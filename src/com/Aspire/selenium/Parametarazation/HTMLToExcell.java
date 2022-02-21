package com.Aspire.selenium.Parametarazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLToExcell
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Samsung");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(1000);
	List<WebElement> mobiletext = driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//a/div[2]/div[1]/div[1]"));
	
	FileInputStream file=new FileInputStream("D:\\Testing\\SeleniumOct21\\TestData\\Test1.xlsx");
	
	Workbook wbf = WorkbookFactory.create(file);
	
	Sheet s = wbf.getSheet("Sheet3");
	
	
	for(WebElement Mobiletext:mobiletext)
	{
		String mtext = Mobiletext.getText();
		
		for(int i=0; i<mtext.length(); i++)
			
		{
			 s.createRow(i).createCell(1).setCellValue(mtext);
		}
		
		System.out.println(mtext);
		
	}
	Thread.sleep(1000);

	FileOutputStream file2=new FileOutputStream("D:\\\\Testing\\\\SeleniumOct21\\\\TestData\\\\Test1.xlsx");
	
	wbf.write(file2);

	}
}
