package com.saucedemo.testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.BuyProducts;
import com.saucedemo.pages.Checkout;
import com.saucedemo.pages.Continue;
import com.saucedemo.pages.FinishPage;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.VerifySccsMsg;

public class FrthScenarioTest extends BaseTestClass{
	
	@Test
	public void thankYouMsg() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUserName("standard_user");
		landingPage.enterPassword("secret_sauce");
		landingPage.clickLognBtn();
		
		BuyProducts buyFrst = new BuyProducts(driver);
		buyFrst.sortPrice("Price (low to high");
		buyFrst.buyThirdP();
		buyFrst.cornerBtn();
		
		WebElement confirmationMsg = driver.findElement(By.id("item_2_title_link"));
		String confirmationText = confirmationMsg.getText();
		if (confirmationText.contains("Sauce Labs Onesie")) {
			System.out.println("Item is the same as we selected");
		}
		else
		{System.out.println("Item is not the slected one");
		}
		
		Checkout check = new Checkout(driver);
		check.clickcheck();
		
		Continue name = new Continue(driver);
		name.enterName("First Name");
		name.enterLastName("Last Name");
		name.enterPstlcode("Postal Code");
		name.clickOnContinue();
		
		FinishPage finish = new FinishPage(driver);
		finish.ClickonFinish();
		
		VerifySccsMsg thankyou = new VerifySccsMsg(driver);
		String expectedMsg = "Thank you for your order!";
		String actualMsg = thankyou.thankYouMsg();
		Assert.assertEquals(actualMsg, expectedMsg);
	
	}
	

}
