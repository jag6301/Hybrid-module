package com.interlinking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy (name ="vemail")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy (name ="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy (xpath ="//*[text()='Login']")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUsername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
}
