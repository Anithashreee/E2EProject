package com.E2EProject.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.E2EProject.Utilities.Readconfig;


public class BaseClass {
	
	Readconfig readconfig=new Readconfig();

	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {                        //System.getProperty("user.dir")+"//Driver1//chromedriver.exe")
		
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver=new ChromeDriver();
		
		logger =Logger.getLogger("E2EProject");
		PropertyConfigurator.configure("log4j.properties");
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}

