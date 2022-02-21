package com.Aspire.framework.ProjectpomPagefactoryDatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{

	public static void main(String []args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		FileInputStream file=new FileInputStream("D:\\Testing\\SeleniumOct21\\TestData\\Automation project.xlsx");
		
		Workbook wbk = WorkbookFactory.create(file);
		
		Sheet sheetname = wbk.getSheet("Sheet1");
		
		String url = sheetname.getRow(4).getCell(1).getStringCellValue();
		String log = sheetname.getRow(4).getCell(2).getStringCellValue();
		String pas = sheetname.getRow(4).getCell(3).getStringCellValue();
		String pi = sheetname.getRow(4).getCell(4).getStringCellValue();
		
		driver.get(url);
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.username(log);
		lp.Password(pas);
		lp.Submit();
		Thread.sleep(2000);
		
	
		PinPage pin =new PinPage(driver);
		
		
		pin.username(pi);
		pin.Submit();
		Thread.sleep(2000);
		
		HomePage hm=new HomePage(driver);
		
		hm.Nikname();
		hm.Submit();
				
		
		
		
	}

}
