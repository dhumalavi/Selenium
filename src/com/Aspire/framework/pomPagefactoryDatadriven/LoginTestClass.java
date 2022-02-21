package com.Aspire.framework.pomPagefactoryDatadriven;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestClass 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
//	    String UNvalue="DP6852";
//	    String pwdValue="Pramod@2105";
//	    String pinValue="976976";
		
		String filepath="D:\\Testing\\SeleniumOct21\\TestData\\ProjectData.xlsx";
		
		FileInputStream file=new FileInputStream(filepath);
		
		Workbook wbf = WorkbookFactory.create(file);
		
		String UNvalue = wbf.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
		
		String pwdValue = wbf.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue();
		
		String pinValue = wbf.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue();
		
		 String ExpectedIname = wbf.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue();
		
		 boolean Expectedlogo = wbf.getSheet("Sheet1").getRow(10).getCell(6).getBooleanCellValue();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUserName(UNvalue);
		lp.enterPassword(pwdValue);
		lp.loginButton();
		Thread.sleep(2000);
		
		PinPage pp=new PinPage(driver);
		
		pp.enterPin(pinValue);
		pp.enterContinue();
		Thread.sleep(2000);
		
		HomePage hp= new HomePage(driver);
		
		hp.logoDisplay(Expectedlogo);
		hp.verifyInitialName(ExpectedIname);
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
