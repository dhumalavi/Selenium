package com.Aspire.selenium.Webtable;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Table3 
	{
		public static void main(String[] args) throws InterruptedException {

				 System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize();
		         Thread.sleep(1000);
		         driver.get("https://prsindia.org/covid-19/cases");
		         Thread.sleep(1000);
		      
		         List<WebElement> row = driver.findElements(By.xpath("(//div[@id='w0'])//tr//td[1]"));
		         List<WebElement> column = driver.findElements(By.xpath("(//div[@id='w0'])//tr[2]/td"));
		         System.out.println("row: "+row);
		         System.out.println("column: "+column);
		         
		         for (int k=1; k<=column.size(); k++)
		         {
		        	List<WebElement> webel1 = driver.findElements(By.xpath("//tr[@data-key=\"24754\"]//td"));
		            System.out.print(webel1.get(k)+"    ");
		         }
		         System.out.println();
		         for(int i=2; i<=row.size(); i++)
		         {
		        	 for (int j=1; j<=column.size(); j++)
		        	 {
		        		 List<WebElement> webel = driver.findElements(By.xpath("(//div[@id='w0'])//tr["+i+"]/td["+j+"]"));
		        		 System.out.print(webel.get(i)+"  ");
		        	 }
		        	 System.out.println();
		         }
		         Thread.sleep(5000);
		}

	}

