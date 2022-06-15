package com.cuccumberfarameworl.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	 // created a constructor for a driver class
	
	public LoginPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement btnSignin;
	@FindBy(name = "email")
	WebElement txtUserName;
	
	@FindBy(id = "continue")
	WebElement btnContinue;
	
	@FindBy(id = "ap_password")
	WebElement txtPassword;
	
	@FindBy(id = "signInSubmit")
	WebElement btnSignIn;
	
	//Action Methods
	public void SignIn()
	{
		btnSignin.click();
		
	}
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);	
	}
	
	public void setPassword(String upwd)
	{
		txtPassword.sendKeys(upwd);	
	}
	public void clickContinue()
	{
		btnContinue.click();
		
	}
	public void clickSubmit()
	{
		
		btnSignIn.click();
	}
	
	
	
}
