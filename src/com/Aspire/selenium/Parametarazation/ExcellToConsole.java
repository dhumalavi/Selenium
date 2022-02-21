package com.Aspire.selenium.Parametarazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcellToConsole 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		driver.findElement(By.xpath("//a[text()=' REGISTER ']")).click();
		
		FileInputStream data = new FileInputStream("D:\\Testing\\SeleniumOct21\\TestData\\Test1.xlsx");
		
		Workbook wbk = WorkbookFactory.create(data);
		
		String name = wbk.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(name);
		

		String pass = wbk.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys(pass);
		

		String conpass = wbk.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='cnfUsrPwd']")).sendKeys(conpass);
		
		System.out.println(name);
		System.out.println(pass);
		System.out.println(conpass);
		
		
	}	
	
}
