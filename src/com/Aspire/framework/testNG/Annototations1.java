package com.Aspire.framework.testNG;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annototations1 
{
	@BeforeClass
	public void browserlaunch()
	{
		Reporter.log("Browser launch successful", true);
	}
	@AfterMethod
	public void enterusername()
	{
		Reporter.log("User name entered successful", true);
	}
	@Test
	public void enterpassword()
	{
		Reporter.log("Enter Password successful", true);
	}

	@Test
	public void Loginbtn()
	{
		Reporter.log("Click on login btn successful", true);
	}
	@AfterClass
	public void verifyuser()
	{
		Reporter.log("User name verified successful", true);
	}
}
