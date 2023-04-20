package com.saucedemo.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.LandingPage;

public class SecondScenarioTest extends BaseTestClass{

	@Test
	public void verifyErrMsg() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUserName("locked_out_user");
		landingPage.enterPassword("secret_sauce");
		landingPage.clickLognBtn();
		
		String expectedErrMsg = "Epic sadface: Sorry, this user has been locked out.";
		String actualErrMsg = landingPage.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
	
}
