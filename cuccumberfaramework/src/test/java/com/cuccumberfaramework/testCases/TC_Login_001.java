package com.cuccumberfaramework.testCases;

import org.junit.Test;

import com.cuccumberfarameworl.pageobjects.LoginPage;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TC_Login_001  extends BaseClass{
	@Test
	public void LoginTest() {
		driver.get(baseURL);
		logger.info("url is opened");
		LoginPage lp = new LoginPage(driver);
		lp.SignIn();
		logger.info("Signin is clicked");
		lp.setUserName(username);
		logger.info("user name is entered");
		lp.clickContinue();
		logger.info("Continue is clicked");
		lp.setPassword(password);
		logger.info("password is entered");
		lp.clickSubmit();
		logger.info("submit is clicked");
		
		if(driver.getTitle().equals("Nizamabad 503001"))
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}

}
