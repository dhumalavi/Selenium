package com.Aspire.framework.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellToHTML 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		
		FileInputStream data = new FileInputStream("D:\\Testing\\SeleniumOct21\\TestData\\Test1.xlsx");
		
		 Workbook wbk = WorkbookFactory.create(data);
		
		String name = wbk.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		
		String pass = wbk.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
	
		String conpass = wbk.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		
		
		System.out.println(name);
		System.out.println(pass);
		System.out.println(conpass);
		
		Sheet s = wbk.getSheet("Sheet1");
		
		int rowindex = s.getLastRowNum();
		System.out.println("row count = "+rowindex);
		
		
		short cellcount = s.getRow(4).getLastCellNum();
		
		System.out.println("cell count = "+cellcount);
	}	
	
}
