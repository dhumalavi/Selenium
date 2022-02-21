package com.Aspire.selenium.ActionClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Testing\\SeleniumOct21\\SoftFiles\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	Thread.sleep(2000);
	
	WebElement source = driver.findElement(By.xpath("//li[@id='sendKeys']"));
	
	WebElement Target = driver.findElement(By.xpath("//li[@id='click']"));
	
	
	Actions act = new Actions(driver);
	
	Thread.sleep(2000);
//Approach1	
	//act.moveToElement(source).clickAndHold().moveToElement(Target).release().build().perform();
	
//Approach1	
	
	//act.moveToElement(source).clickAndHold().release(Target).build().perform();
	
//Approach1	
	
	//act.clickAndHold(source).release(Target).build().perform();
	
//Approach1	

	act.dragAndDrop(source, Target).perform();
}

}