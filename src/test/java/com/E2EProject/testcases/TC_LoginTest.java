package com.E2EProject.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.E2EProject.pageObjects.LoginPage;

public class TC_LoginTest extends BaseClass {
	@Test
	public void logintest() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		logger.info("URL is opened");
	
		LoginPage lp=new LoginPage(driver); //creating object for page object class
		
		lp.setUsername(username);
		logger.info("entered username");//"C:\Users\ppkar\Dropbox\PC\Downloads\chromedriver_win32 (4)\chromedriver.exe"
		
		lp.setPassword(password);
		logger.info("entered pwd");
		
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("logging test passed..");
		}
		else
		{
			captureScreen( driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("logging test failed");
		}
	}

	

}
