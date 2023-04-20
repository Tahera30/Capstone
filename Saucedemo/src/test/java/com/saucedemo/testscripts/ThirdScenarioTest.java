package com.saucedemo.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.BuyProducts;
import com.saucedemo.pages.Checkout;
import com.saucedemo.pages.Continue;
import com.saucedemo.pages.LandingPage;

public class ThirdScenarioTest extends BaseTestClass{
	
	@Test
	public void lastNameErrMsg() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUserName("problem_user");
		landingPage.enterPassword("secret_sauce");
		landingPage.clickLognBtn();
		
		BuyProducts buy = new BuyProducts(driver);
		buy.addFrstP();
		buy.cornerBtn();
		
		Checkout check = new Checkout(driver);
		check.clickcheck();
		
		Continue contnue = new Continue(driver);
		contnue.enterName("First Name");
		contnue.enterLastName("Last Name");
		contnue.enterPstlcode("Postal Code");
		contnue.clickOnContinue();
		
		String expectedErrMsg = "Error: Last Name is required";
		String actualErrMsg = contnue.verfyErr();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
		
	}

}
