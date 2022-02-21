package com.Aspire.framework.facebookpomPagefactoryDatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String filepath="D:\\Testing\\SeleniumOct21\\TestData\\ProjectData.xlsx";
		
		FileInputStream file=new FileInputStream(filepath);
		
		Workbook wbf = WorkbookFactory.create(file);
		
		Row fac = wbf.getSheet("FacebookCredintials").getRow(4);
		
		String loginid = fac.getCell(1).getStringCellValue();
		String pasword = fac.getCell(2).getStringCellValue();
		String url = fac.getCell(3).getStringCellValue();
		
		boolean logidis = fac.getCell(4).getBooleanCellValue();

		driver.get(url);
		
		Thread.sleep(2000);
		
		Login lp=new Login(driver);
		
		lp.loginidinput(loginid);
		lp.passwordinput(pasword);
		lp.submit();
		
		Thread.sleep(2000);
		
		HomePage hp=new HomePage(driver);
		hp.logodisplay(logidis);		
		
		
	}
}
