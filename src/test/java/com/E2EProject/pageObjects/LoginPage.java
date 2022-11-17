package com.E2EProject.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver ldriver;  //create driver object //local driver
	
	public LoginPage(WebDriver rdriver) //creating constructor and passing webdriver driver as a parameter //remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);// this is the constructor we created

}
	
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement lnkLogout;
	
	public void setUsername(String uname) //creating 3 action method for different elements
	{
		txtUsername.sendKeys(uname);
	} 
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clicksubmit() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", btnLogin);
		//WebDriverWait wait=new WebDriverWait(ldriver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		btnLogin.click();
	    
	}
	public void clickLogout()
	{
		lnkLogout.click();
	}
}