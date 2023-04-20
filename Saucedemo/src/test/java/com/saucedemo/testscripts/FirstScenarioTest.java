package com.saucedemo.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.saucedemo.pages.BuyProducts;
import com.saucedemo.pages.Checkout;
import com.saucedemo.pages.Continue;
import com.saucedemo.pages.FinishPage;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.VerifySccsMsg;

public class FirstScenarioTest extends BaseTestClass{
	
	@Test
	public void buyTwoProdcts() {
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.enterUserName("standard_user");
		landingPage.enterPassword("secret_sauce");
		landingPage.clickLognBtn();
		
		BuyProducts products = new BuyProducts(driver);
		products.addFrstP();
		products.addScndP();
		products.cornerBtn();
		
		Checkout check = new Checkout(driver);
		check.clickcheck();
		
		Continue cntinue = new Continue(driver);
		
		cntinue.enterName("First Name");
		cntinue.enterLastName("Last Name");
		cntinue.enterPstlcode("Postal Code");
		cntinue.clickOnContinue();
		
		FinishPage finish = new FinishPage(driver);
		finish.ClickonFinish();
		
		VerifySccsMsg sccsmsg = new VerifySccsMsg(driver);
		String expectedSccsMsg = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualSccsMsg = sccsmsg.getVerifyMsg();
		
		Assert.assertEquals(actualSccsMsg, expectedSccsMsg);
	
	}
	
}


