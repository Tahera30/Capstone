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

public class FifthScenarioTest extends BaseTestClass{
	
	@Test
	public void expnsiveItem() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.enterUserName("standard_user");
		landingPage.enterPassword("secret_sauce");
		landingPage.clickLognBtn();
		
		BuyProducts buyFrst = new BuyProducts(driver);
		buyFrst.addFrstP();
		buyFrst.buyThirdP();
		buyFrst.removep();
		
		buyFrst.cornerBtn();
		
		Checkout check = new Checkout(driver);
		String expectedMsg = "Your Cart";
		String actualMsg = check.VerifyCartMsg();
		Assert.assertEquals(actualMsg, expectedMsg);
		
		check.shopping();
		buyFrst.sortPHighToLow("Price(high to low)");
		buyFrst.addTheExpnsive();
		buyFrst.cornerBtn();
		check.clickcheck();
		
		Continue continu = new Continue(driver);
		continu.enterName("First Name");
		continu.enterLastName("Last Name");
		continu.enterPstlcode("Postal Code");
		continu.clickOnContinue();
		
		WebElement itemCountElement = driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]"));
		String itemCountText = itemCountElement.getText();
		int itemCount = Integer.parseInt(itemCountText);
		if (itemCount == 2) {
			System.out.println("Cart contains two items");
		}
		else {
			System.out.println("Wrong number of items in cart:" +itemCount);
		}
		
		FinishPage finish = new FinishPage(driver);
		finish.ClickonFinish();
		
		VerifySccsMsg verfyMsg = new VerifySccsMsg(driver);
		verfyMsg.thankYouMsg();
		}
		
	}

