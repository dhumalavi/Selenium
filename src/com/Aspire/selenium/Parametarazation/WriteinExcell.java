package com.Aspire.selenium.Parametarazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteinExcell
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 

	{
	
		String []a= {"Aspire","Training","Institute","Pune"};
		FileInputStream data = new FileInputStream("D:\\Testing\\SeleniumOct21\\TestData\\Test1.xlsx");
	
	
		Workbook wbk = WorkbookFactory.create(data);
		
		 Sheet s = wbk.getSheet("Sheet2");
		 
		Row row1 = s.createRow(2);
		
		Cell cell1 = row1.createCell(2);
		
		cell1.setCellValue("Hii");
		
		
		
		for(int i=0; i<a.length; i++)
		{
			s.createRow(i+3).createCell(2).setCellValue(a[i]);
		}
		

		FileOutputStream filewrite = new FileOutputStream("D:\\Testing\\SeleniumOct21\\TestData\\Test1.xlsx");
		
		wbk.write(filewrite);

	}
}
