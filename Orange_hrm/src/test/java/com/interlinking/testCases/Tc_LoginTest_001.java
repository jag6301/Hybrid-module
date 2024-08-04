package com.interlinking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.interlinking.pageObject.LoginPage;

public class Tc_LoginTest_001 extends BaseClass11 {
	@Test
	public void loginTest() {
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("dashboard"))
		{
			Assert.assertTrue(true);
		}
		else
		{
		    Assert.assertTrue(false);
		}
		
	}

	
		
}
