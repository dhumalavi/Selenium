package com.Aspire.framework.testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample 
{

	@Test
	
	public void demo()
	{
		System.out.println("Hi Test installed succesfully");
		
		System.out.println("hii");
		
		Reporter.log("Hii", true);
	}
}
